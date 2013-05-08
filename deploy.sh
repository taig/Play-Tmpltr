#!/bin/bash

# Switch to application directory.
cd ~/Development/Scala/bootstrapper
git checkout master

# Download documentation files (application must be running).
rm -rf /tmp/app/*
mkdir /tmp/app
wget -r -l 1 -k -p -P /tmp/app localhost:9000

# Create ScalaDoc.
mkdir /tmp/app/doc
scaladoc -d /tmp/app/doc src/app/com/taig/bootstrapper/*.scala

# Update documentation in proper git branch.
git stash
git checkout gh-pages
rm -rf *
mv /tmp/app/localhost:9000/* .
mv /tmp/app/doc .
rm -rf /tmp/app

git add .
git commit -m "Updated documentation."
git push

git checkout master
git stash pop