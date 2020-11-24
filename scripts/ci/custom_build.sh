#!/bin/bash

GIT_DESCRIBE=$(git describe --tags --always)
VERSION="${GIT_DESCRIBE}"-SNAPSHOT
mvn versions:set -DnewVersion="${VERSION}"
mvn install
mvn versions:revert