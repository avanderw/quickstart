# Changelog for project todo
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/) 
and adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [v1.1.0] (Feature release)
*Released on 2020-07-24*

### Added
- Add tagline to required parameters
- Add logging configuration to README.md

### Updated
- Update minor version for tagline addition
- Update test logging to info level
- Update title in changelog
- Update readme and changelog to detail how to remotely use archetype
- Update maven-publish to allow for manual dispatch
- Update to publish on branch push

### Bug fixes
- Fix jar name with usage in the README
- Fix resources not being added to the jar
- Fix incorrect package for test classes

## [v1.0.3] (Maintenance release, Update recommended)
*Released on 2020-07-22*

### Added
- Add default implementation details to META-INF
- Add enforcer plugin
- Create maven-publish.yml
- Add runtime to tinylog-impl dependency
- Add META-INF information for version during build
- Add release and snapshot enforcer rules for artifact version

### Bug fixes
- Fix various package related errors introduced
- Fix picocli version to read pom.properties when not running from jar
- Fix tinylog property file for debug mode
- Fix tinylog property referring to another project for the log file name
- Fix error in pom single assembly

### Changed
- Update picocli to get the version from META-INF
- Update dependency versions
- Update plugin versions to the latest
- Update pom to explicitly include plugins

## [v1.0.2] (Maintenance release)
*Released on 2020-07-07*

### Changed
- Update README getting started and support area
- Change todo to roadmap
- Refactor tagline to not be in the header of the README
- Update file references to not include extensions in README
- Update reference to readme file in supporting documents
- Update header of changelog to name project

### Removed
- Remove duplicate last commit badge from README

### Bug fixes
- Fix readme reference to wrong license in use

## [v1.0.1] (Maintenance release)
*Released on 2020-07-07*

### Changed
- Update build settings to not be in root directory

## [v1.0.0] (Major release)
*Released on 2020-05-27*

### Changed
- Update jar name in archetype

### Bug fixes
- Fix package.Main when using the assembly plugin
