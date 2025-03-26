# Setup of basic gradle project using CLI

### Go to project directory nd type command
```agsl
gradle init --type java-application
```
### Build the project
```agsl
./gradlew build
```
 This will build the project. 
 To prepare a jar file which is executable, we need to setup manifest property in `build.gradle` using below code.

```groovy
jar{
    manifest{
        attributes(
                'Main-Class': 'org.mrstm.Main'
        )
    }
}
```
Also add below code if we imported some extra packages i.e. dependencies

```agsl
jar {
    manifest {
        attributes (
                'Main-Class': 'org.mrstm.Main'
        )
    }
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    from {
        configurations.runtimeClasspath.collect { it.isDirectory() ? it : zipTree(it) }
    }
}
```

 The above command will build our project.
### Execute following code to run
```agsl
./gradlew jar
```
 And then

```agsl
java -jar build/libs/filename.jar
```
