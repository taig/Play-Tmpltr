#!/bin/bash

readonly TEMP=/tmp/app/doc
readonly ROOT=~/Development/Scala/bootstrapper
readonly FILES=${ROOT}/src/app/com/taig/bootstrapper/*.scala
readonly DOC=${ROOT}/doc

cd ${ROOT}																# Move to project root.

if ! git diff-index --quiet HEAD --; then								# Check for uncommited changes.
	echo "Commit current working directory before deploying."
else
	rm -rf ${TEMP} && mkdir -p ${TEMP}									# Clean temporary storage.
	scaladoc -d ${TEMP} ${FILES}										# Create scaladoc in temp directory.
	git checkout gh-pages												# Switch to proper git branch.
	rm -rf ${DOC}														# Remove current doc.
	mv ${TEMP} ${DOC}													# Move new doc to project.
	git add ${DOC}														# Add new doc files to commit state.
	git commit -m "Updated documentation."								# Commit changes.
	git push origin gh-pages											# Push changes to remote repository.
	git checkout -														# Go back to previously used branch.
fi

cd - > /dev/null														# Restore latest working directory location.