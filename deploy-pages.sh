#!/bin/bash

# Switch to application directory.
cd ~/Development/Scala/bootstrapper
git checkout master

# Download documentation files (application must be running).
rm -rf /tmp/app/*
mkdir /tmp/app
wget -r -l 1 -k -p -P /tmp/app localhost:9000

# Update documentation in proper git branch.
git stash
git checkout gh-pages
rm -rf *
mv /tmp/app/localhost:9000/* .
rm -rf /tmp/app

git add .
git commit -m "Updated documentation."
git push

git checkout master
git stash pop