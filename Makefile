include $(HOME)/.env

VERSION := $(shell git describe --tags --always)-SNAPSHOT
APP_NAME := $(shell ./mvnw org.apache.maven.plugins:maven-help-plugin:3.2.0:evaluate -Dexpression=project.name -q -DforceStdout)

all : 	ci clean
.PHONY: all

ci : 	setup build generate_living_documentation_for_domain
.PHONY: ci

clean : revert_project_version
.PHONY: clean

setup : check_variables setup_project_version
.PHONY: setup

build :
	./scripts/ci/build.sh "${VERSION}"
check_variables :
	./scripts/commons/check_pipeline_variables.sh
cleaning :
	./scripts/commons/clean.sh
generate_living_documentation_for_domain :
	./scripts/commons/generate_living_documentation.sh domain "${VERSION}"
revert_project_version :
	./scripts/commons/revert_project_version.sh
setup_project_version :
	./scripts/commons/setup_project_version.sh "${VERSION}"