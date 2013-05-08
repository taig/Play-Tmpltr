#!/bin/bash

readonly TEMP=/tmp/app/page
readonly ROOT=~/Development/Scala/bootstrapper
readonly APP=${ROOT}/sample
readonly PROCESS=RUNNING_PID
readonly PORT=9999

cd ${APP}																# Move to project root.

if ! git diff-index --quiet HEAD --; then								# Check for uncommited changes.
	echo "Commit current working directory before deploying."
elif [ -a ${PROCESS} ]; then
    echo "Play application already running (${PROCESS} exists)."
else
	rm -rf ${TEMP} && mkdir -p ${TEMP}									# Clean temporary storage.
    (play "start ${PORT}") &                                            # Start play application in background.
    wget -r -l 1 -k -p -nH -t 0 --retry-connrefused -P ${TEMP} localhost:${PORT}
    play stop                                                           # Stop play server.
	git checkout gh-pages   											# Switch to proper git branch.
	rm -rf ${ROOT}/index.html ${ROOT}/assets/							# Remove current page.
	mv ${TEMP}/* ${ROOT}												# Move new page to project.
	git add ${ROOT}/index.html ${ROOT}/assets/							# Add new page files to commit state.
	git commit -m "Updated pages."      								# Commit changes.
	git push origin gh-pages											# Push changes to remote repository.
	git checkout -														# Go back to previously used branch.
fi

cd - > /dev/null												        # Restore latest working directory location.