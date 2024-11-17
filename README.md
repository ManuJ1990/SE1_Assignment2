# Student Management System - Exception Handling Overview

This document provides an overview of Exercises 2-9 that focus on object-oriented programming concepts and exception handling in Java.

## Overview of Exercises

### Exercise 2: Understanding Class Behavior

- **Description**: This exercise involves analyzing the behavior of two classes, `Test` and `ExtendedTest`, particularly focusing on how inherited properties are accessed and how method behavior changes in different instances.

### Exercise 3: Teaching Assistant Class

- **Description**: The class `Student` is extended to create a specialized `TAStudent` class that represents teaching assistants. Teaching assistants are students who have been assigned additional tasks to support courses, demonstrating inheritance in Java.

### Exercise 4: PhD Student Class

- **Description**: A new class, `PhDStudent`, is created to represent PhD students. This exercise focuses on extending the `Student` class to model a PhD student pursuing a higher degree. PhD students can also be assigned teaching responsibilities, adding complexity to the inheritance hierarchy.

### Exercise 5: Exception Handling in Execution Flow

- **Description**: This exercise explores how exceptions affect the execution flow of a program. The provided code snippet demonstrates what happens when an exception is thrown, and whether subsequent instructions are executed or skipped, depending on the handling of exceptions.

### Exercise 6: Student Console Input

- **Description**: The `Student` class is modified to accept input from the console for adding new student entries. Input validation is implemented to ensure only correct data types are entered, showcasing how console input handling and validation can prevent runtime errors.

### Exercise 7: Array of Students

- **Description**: An array of `Student` objects is created, with the size specified by user input. Proper input validation is applied to ensure that only valid numbers are accepted, highlighting the importance of managing array data using user-provided information.

### Exercise 8: Display Student Information

- **Description**: This exercise adds functionality to display information about a specific number of students stored in an array. It introduces custom exceptions to handle invalid requests, such as attempting to display more students than available, illustrating how to define, throw, and catch custom exceptions.

### Exercise 9: Division Program with Exception Handling

- **Description**: A program is implemented to allow users to enter two numbers and display the result of their division. Exception handling is added to manage cases where the input is invalid (`NumberFormatException`) or division by zero (`ArithmeticException`), ensuring robust and user-friendly error handling.

## Running the Exercises

1. Clone the repository:
   ```
   git clone https://github.com/yourusername/student-management-exception-handling.git
   ```
2. Navigate to the project directory:
   ```
   cd student-management-exception-handling
   ```
3. Compile the Java files:
   ```
   javac *.java
   ```

## Summary of Concepts

- **Inheritance**: Exercises 3 and 4 extend the `Student` class to create `TAStudent` and `PhDStudent`, demonstrating the concept of class hierarchy and inheritance.
- **Exception Handling**: Exercises 5, 8, and 9 explore Java's exception handling mechanisms using `try`, `catch`, and custom exception classes to make the code more resilient to runtime errors.
- **Input Validation**: Exercises 6 and 7 focus on console input and validation, using Java wrapper methods like `parseInt()` and `parseDouble()` to ensure user inputs are correctly handled.
- **Custom Exceptions**: Exercise 8 demonstrates how to create and handle custom exceptions to manage unexpected conditions effectively.

## Contributing

Contributions are welcome! Feel free to fork the repository and submit pull requests to add new exercises, improve code quality, or expand on the documentation.

## License

This repository is licensed under the MIT License.

