#set($hash = '#')
${hash} ${groupId}.${artifactId}
![top-language](https://img.shields.io/github/languages/top/avanderw/${artifactId})
![license](https://img.shields.io/github/license/avanderw/${artifactId})

_${tagline}_

${hash}${hash} Showcase

${hash}${hash} Getting started

```shell script
$ git clone https://github.com/avanderw/${artifactId}.git
$ cd ${artifactId}/
$ mvn verify
$ java -jar ./target/${artifactId}-jar-with-dependencies.jar --help
Usage: ${artifactId} [-hV] [COMMAND]
${tagline}
  -h, --help      Show this help message and exit.
  -V, --version   Print version information and exit.
Commands:
```

${hash}${hash} Usage

${hash}${hash} Configuration

${hash}${hash}${hash} Logging
_./tinylog.properties_
```properties
writer        = file
writer.file   = ${artifactId}.log
writer.level  = info
writer.format = [{level}] at .({class-name}.java:{line}) {message}
```
Further documentation can be found at [tinylog.org](https://tinylog.org/v2/configuration/)

${hash}${hash} Support

${hash}${hash}${hash} Installing supporting software
> It is recommended to make use of a package manager to simplify the setup of your environment

- Java 11
- Maven 3.3.9

${hash}${hash}${hash}${hash} Chocolatey (https://chocolatey.org/install)
```cmd
$ choco install ojdkbuild
$ choco install maven 
```

${hash}${hash} Changelog
![last-commit](https://img.shields.io/github/last-commit/avanderw/${artifactId})
 
All notable changes to this project will be documented in [CHANGELOG](CHANGELOG.md). 
The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/) 
and adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

${hash}${hash} Roadmap
Refer to the file [.todo/todo.txt](.todo/todo.txt) for a list of potential future work.
Here is a [complete primer](https://github.com/todotxt/todo.txt) on the whys and hows of todo.txt.

${hash}${hash} Contributing
![commit-activity](https://img.shields.io/github/commit-activity/y/avanderw/${artifactId})
 
We love contributions! Please read [CONTRIBUTING](CONTRIBUTING.md) for details on how to contribute.

${hash}${hash} License 
This project is licensed under the GNU General Public License v3.0 - see the [LICENSE](LICENSE) file for details
