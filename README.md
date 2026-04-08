# Java Practice Project

A structured Java practice project with various programming examples.

## Project Structure

```
src/
├── main/
│   └── java/
│       └── com/practice/examples/
│           ├── Loops.java
│           ├── Conditional.java
│           ├── Input.java
│           ├── Variable.java
│           ├── FirstClass.java
│           └── Menu.java
└── test/
    └── java/
```

## Classes

- **Loops.java** - Demonstrates for loop (prints 0-10)
- **Conditional.java** - If-else conditions for comparing two integers
- **Input.java** - Takes two integers as input and prints their sum
- **Variable.java** - Simple variable declaration and addition
- **FirstClass.java** - Prints a star pattern
- **Menu.java** - Switch statement menu with different greetings

## Compilation & Execution

```bash
# Compile all classes
javac -d target/classes src/main/java/com/practice/examples/*.java

# Run a specific class
java -cp target/classes com.practice.examples.Loops
```

## Using Maven

```bash
# Compile
mvn clean compile

# Run a specific class
mvn exec:java -Dexec.mainClass="com.practice.examples.Loops"
```
