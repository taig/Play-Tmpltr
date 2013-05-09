#!/bin/bash

readonly TEMP=/tmp/app
readonly ROOT=~/Development/Scala/bootstrapper
readonly SOURCE=src
readonly SAMPLE=sample
readonly PAGES=pages
readonly DOC=doc
readonly ALL=all

cd ${ROOT}

if [[ $# -ne 1 || ! ( $1 = ${PAGES} || $1 = ${DOC} || $1 = ${ALL} ) ]]; then					# Validate parameter.
	echo "usage: deploy token"
	echo "       token = ${PAGES} | ${DOC} | ${ALL}"
elif ! git diff-index --quiet HEAD --; then														# Check for uncommited changes.
	echo "Commit current working directory before deploying."
else																							# Run deploy.
	rm -rf ${TEMP} && mkdir -p ${TEMP}															# Clean temporary storage.

	(
	if [[ $1 = ${PAGES} || $1 = ${ALL}  ]]; then												# Deploy pages.
		APP=${SAMPLE}
		PORT=9999

		echo "[${PAGES}] Deploying ..."
		cd ${ROOT}/${APP}

		if [[ -a ${ROOT}/${APP}/RUNNING_PID ]]; then											# Check if play is already running.
    		echo "[${PAGES}] Play application already running."
    	else
			echo "[${PAGES}] Launching play application ..."
			(play "start ${PORT}" | grep "[error]") &                              				# Start play application in background.
			wget -r -l 1 -k -p -nH -t 0 --retry-connrefused -P ${TEMP}/${APP} localhost:${PORT} 2> /dev/null
			echo "[${PAGES}] Results retrieved."
			play stop > /dev/null                                                  				# Stop play server.
			echo "[${PAGES}] Play application terminated."
		fi
	fi
	) &

	(
	if [[ $1 = "doc" || $1 = "all"  ]]; then													# Deploy scalaDoc.
		APP=${SOURCE}

		echo "[${DOC}] Deploying ..."
		cd ${ROOT}/${APP}

		echo "[${DOC}] Compiling sources ..."
		play stage > /dev/null                                                 					# Generate scalaDoc.
		cp -r ${ROOT}/${APP}/target/scala-2.10/api ${TEMP}/${APP}                               # Copy scalaDoc to temp directory.
		echo "[${DOC}] Results retrieved."
	fi
	) &

	wait																						# Wait for tasks to finish.

	git checkout gh-pages 2> /dev/null															# Prepare deploy branch.

	if [[ $1 = "pages" || $1 = "all" ]]; then													# Prepare page deploy.
		APP=${SAMPLE}

		rm -rf ${ROOT}/index.html ${ROOT}/assets												# Remove old page files.
		mv ${TEMP}/${APP}/* ${ROOT}																# Move new page to project.
		git add ${ROOT}/index.html ${ROOT}/assets 2> /dev/null									# Stage page files.
	fi

	if [[ $1 = "doc" || $1 = "all" ]]; then														# Prepare scalaDoc deploy.
		APP=${SOURCE}

		rm -rf ${ROOT}/doc																		# Remove old scalaDoc files.
		mv ${TEMP}/${APP} ${ROOT}/doc															# Move new scalaDoc to project.
		git add ${ROOT}/doc 2> /dev/null														# Stage page files.
	fi

	git commit -m "Deployed updates." > /dev/null												# Deploy changes.
	git push origin gh-pages
	git checkout - 2> /dev/null
fi