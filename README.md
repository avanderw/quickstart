# net.avdw.quickstart - java cli project archetype
![top-language](https://img.shields.io/github/languages/top/avanderw/quickstart)
![license](https://img.shields.io/github/license/avanderw/quickstart)
![last-commit](http://img.shields.io/github/last-commit/avanderw/quickstart/develop)

## Showcase

## Getting started

> 2020-07-23 GitHub Packages does not allow for unauthorised access to reading of public repositories. 
> The below configuration is required to access the repository.
> This makes the repository primarily useless for open source, configuration free use.  

.m2/settings.xml
```xml
...
<servers>
    <server>
        <id>archetype</id>
        <username>avanderw</username>
        <password>GITHUB_TOKEN</password>
    </server>
</servers>
<profiles>
    <profile>
        <id>github</id>
        <repositories>
            <repository>
                <id>archetype</id>
                <name>GitHub avanderw/quickstart Maven Archetype Repository</name>
                <url>https://maven.pkg.github.com/avanderw/quickstart</url>
                <releases>
                    <enabled>true</enabled>
                </releases>
                <snapshots>
                    <enabled>false</enabled>
                </snapshots>
            </repository>
        </repositories>
    </profile>
</profiles>
...
```

```shell script
$ mvn archetype:generate -DarchetypeGroupId=net.avdw -DarchetypeArtifactId=quickstart -DarchetypeVersion=1.0.3 -P github
```


## Usage

```bash
$ mvn install
$ mvn archetype:generate \
-DarchetypeGroupId=net.avdw \
-DarchetypeArtifactId=quickstart \
-DarchetypeVersion=1.0.0 \
-DgroupId=net.avdw \
-DartifactId=example \
-Dpackage=net.avdw.example \
-Dversion=1.0-SNAPSHOT \
-DinteractiveMode=false
$ cd example
$ mvn package
$ java -jar target/example.jar
```

## Support

## Changelog
![last-commit](https://img.shields.io/github/last-commit/avanderw/quickstart)

All notable changes to this project will be documented in [CHANGELOG.md](CHANGELOG.md). 
The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/) 
and adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## Todo
Refer to the file [.todo/todo.txt](.todo/todo.txt) for a list of potential future work.
Here is a [complete primer](https://github.com/todotxt/todo.txt) on the whys and hows of todo.txt.

## Contributing
![commit-activity](https://img.shields.io/github/commit-activity/y/avanderw/quickstart)

We love contributions! Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on how to contribute.

## License 
This project is licensed under the GNU General Public License v3.0 - see the [LICENSE](LICENSE) file for details
