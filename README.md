The hello-world project

<div align="center">
    <img src="./assets/images/hello_world.png"/>
</div>

## Prerequisites
Make sure following software is installed on your PC
- [JDK 17](https://www.oracle.com/java/technologies/downloads/#java17) or later

## Project structure
```
.
├── bridge-pattern
│   ├── pom.xml
│   ...
├── pom.xml
|
└── README.md
```

## Start project

```shell
$ ./mvnw clean package
$ java -jar ./bridge-pattern/target/bridge-pattern-0.0.1-SNAPSHOT.jar
06:30:38.684 [main] INFO io.github.huypva.bridgepattern.Main -- Abtraction
06:30:38.686 [main] INFO io.github.huypva.bridgepattern.Concrete1Implementation -- Concrete1 implementation 1
06:30:38.686 [main] INFO io.github.huypva.bridgepattern.Concrete1Implementation -- Concrete1 implementation 2
06:30:38.686 [main] INFO io.github.huypva.bridgepattern.Main -- RefinedAbtraction
06:30:38.686 [main] INFO io.github.huypva.bridgepattern.Concrete1Implementation -- Concrete1 implementation 1
```

## Contribute
The code is open sourced. I encourage fellow developers to contribute and help improve it!

- Fork it
- Create your feature branch (git checkout -b new-feature)
- Ensure all tests are passing
- Commit your changes (git commit -am 'Add some feature')
- Push to the branch (git push origin my-new-feature)
- Create new Pull Request

## Reference
- https://en.wikipedia.org/wiki/Bridge_pattern
- https://refactoring.guru/design-patterns/bridge