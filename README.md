# Java Inherited Object Test

- Created a Person Class
- Created a Superhero Class, extending the Person Class
- Created an instance of a Person, then another with Superhero abilities

## Create a Class file
1) To compile:

```
$ javac Person.java
```

2) To run:

```
$ java Person 
```

## Create a Jar file

```
jar cfve Person.jar Person *.class
```
Where 'Person' is where the 'main' method is.

* You might need to create a MANIFEST.MF
is shows Java where the main() is...

MANIFEST.MF contents
``` 
Main-Class: Person
```
NB. It must end with a newline.

## Run the jar file
``` 
java -jar Person.jar
```
NB. Don't forget the Hyphen, else it won't find the Main method!!




