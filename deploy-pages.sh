#!/bin/bash

readonly TEMP=/tmp/app/page
readonly ROOT=~/Development/Scala/bootstrapper/sample
readonly PORT=9999

cd ${ROOT}																# Move to project root.

if ! git diff-index --quiet HEAD --; then								# Check for uncommited changes.
	echo "Commit current working directory before deploying."
elif -f RUNNING_PID; then
    echo "Play application seems to be running already."
else
	rm -rf ${TEMP} && mkdir -p ${TEMP}									# Clean temporary storage.
    (play "start ${PORT}")                                              # Start play application in background.
    while [ ! -f RUNNING_PID ]; do                                      # Wait until play is ready to serve.
        sleep 1
    done
    wget -r -l 1 -k -p -nh -P ${TEMP} localhost:${PORT}                 # Retrieve HTML.
    play stop                                                           # Stop play server.
	git checkout gh-pages   											# Switch to proper git branch.
	rm -rf index.html assets/											# Remove current page.
	mv ${TEMP} ${ROOT}													# Move new page to project.
	git add index.html assets/											# Add new page files to commit state.
	git commit -m "Updated pages."      								# Commit changes.
	git push origin gh-pages											# Push changes to remote repository.
	git checkout -														# Go back to previously used branch.
fi

cd - > /dev/null														# Restore latest working directory location.