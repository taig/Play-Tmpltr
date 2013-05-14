#!/bin/bash

readonly TEMP=/tmp/app
readonly ROOT=~/Development/Scala/tmpltr
readonly LIBRARY=play-tmpltr
readonly SAMPLE=sample
readonly CLEAN=--clean
readonly PORT=9999

cd ${ROOT}

if [[ $# -gt 1 || ( $# -eq 1 && $1 != ${CLEAN} ) ]]; then										# Validate parameter.
	echo "usage: deploy ${CLEAN}"
elif ! git diff-index --quiet HEAD --; then														# Check for uncommited changes.
	echo "Commit current working directory before deploying."
else																							# Run deploy.
	rm -rf ${TEMP} && mkdir -p ${TEMP}															# Clean temporary storage.

	if [[ $# -eq 1 && $1 == ${CLEAN} ]]; then													# Clean play application.
		play clean > /dev/null
	fi

	(																							# Deploy sample pages.
		if [[ -a ${ROOT}/RUNNING_PID ]]; then													# Check if play is already running.
    		echo "[pages] Play application already running. Cancelled deploy."
    	else
			(play "start ${PORT}" | grep --color=never error) &                    				# Start play application in background.
			wget -r -l 1 -k -p -nH -t 0 --retry-connrefused -P ${TEMP}/${SAMPLE} localhost:${PORT} 2> /dev/null
			play stop > /dev/null                                                  				# Stop play server.
		fi
	) &

	(
		play "project play-tmpltr" doc | grep --color=never error                        		# Generate scalaDoc.
		cp -r ${ROOT}/module/library/target/scala-2.10/api ${TEMP}/${LIBRARY}                   # Copy scalaDoc to temp directory.
	) &

	wait																						# Wait for tasks to finish.

	git checkout gh-pages 2> /dev/null															# Prepare deploy branch.

	rm -rf ${ROOT}/index.html ${ROOT}/assets ${ROOT}/webjars									# Remove old page files.
	mv ${TEMP}/${SAMPLE}/* ${ROOT}																# Move new page to project.
	git add ${ROOT}/index.html ${ROOT}/assets ${ROOT}/webjars 2> /dev/null						# Stage page files.

	rm -rf ${ROOT}/doc																			# Remove old scalaDoc files.
	mv ${TEMP}/${LIBRARY} ${ROOT}/doc															# Move new scalaDoc to project.
	git add ${ROOT}/doc 2> /dev/null															# Stage scalaDoc files.

	git commit -m "Deployed updates." > /dev/null
	git push origin gh-pages
	git checkout - 2> /dev/null
fi