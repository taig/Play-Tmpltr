#!/bin/bash

readonly TEMP=/tmp/app/doc
readonly ROOT=~/Development/Scala/bootstrapper
readonly APP=${ROOT}/src
readonly SOURCE=${APP}/target/scala-2.10/api
readonly TARGET=${ROOT}/doc

cd ${APP}																# Move to app directory.

if ! git diff-index --quiet HEAD --; then								# Check for uncommited changes.
	echo "Commit current working directory before deploying."
else
	rm -rf ${TEMP} && mkdir -p ${TEMP}									# Clean temporary storage.
	play stage                                                          # Generate scalaDoc.
	cp -r ${SOURCE}/* ${TEMP}                                           # Copy scalaDoc to temp directory.
	git checkout gh-pages												# Switch to proper git branch.
	rm -rf ${TARGET}													# Remove current scalaDoc.
	mv ${TEMP} ${TARGET}												# Move new scalaDoc to project.
	git add ${TARGET}													# Add new doc files to commit state.
	git commit -m "Updated documentation."								# Commit changes.
	git push origin gh-pages											# Push changes to remote repository.
	git checkout -														# Go back to previously used branch.
fi

cd - > /dev/null														# Restore latest working directory location.