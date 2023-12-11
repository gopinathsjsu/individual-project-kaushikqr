## Kaushikq's Individual Project for CMPE202

Student ID: 017426955

## 1. Main Objective
The primary challenge I aim to address is the validation of credit cards. This involves identifying the card type (e.g., Mastercard, Visa) by examining the card number and handling the relevant objects accordingly.

## 2. Secondary Objectives
The secondary challenge involves deciding on suitable design patterns and accommodating future additions of credit classes for different card types.

## 3. Design Patterns Used
Design Patterns Implemented: Chain of Responsibility, Strategy

## Strategy Design Pattern:
The Strategy Design Pattern allows dynamic behavior changes in the application at runtime. It supports multiple file formats by creating objects and strategies specific to each, adapting the application's behavior accordingly.

I employed the Strategy Design Pattern to handle various file formats. Three interfaces - Reader, Writer, and CreditCardHandler - were designed to manage different aspects of file processing and credit card handling.

Reader: Defines a common contract for classes that read input files, including a readFile method for reading based on the file type.
CreditCardHandler: Establishes a common structure for classes responsible for checking credit card types, with a checkCreditType method for determining the card category.
Writer: Provides a structure for classes responsible for writing data to different file formats, featuring a writeToFile method for handling the output format.
This pattern enables runtime behavior swapping, adhering to the Open/Closed principle, and facilitates the addition of new strategies without affecting existing code.

## Chain of Responsibility Design Pattern:
The Chain of Responsibility pattern handles requests by passing them through a chain of handlers. Each handler decides whether to process the request or pass it along the chain.

After parsing XML, JSON, or CSV files, validation is needed to determine the credit card type. The Chain of Responsibility pattern validates the file against different credit card handlers, starting with the MasterCard handler and passing it along the chain as needed.

A main credit card handler acts as a mediator, receiving the file and passing it to individual credit card handlers for validation. This approach centralizes and organizes the validation process.

## 4. Consequences of Using Patterns
Chain of Responsibility \n
Advantages:
Decouples the sender from recipients.
Clients interact with the chain through direct method calls.
Easily modify or adjust the chain order.
Disadvantages:
Debugging and observing runtime characteristics can be challenging.
Improper chain configuration may lead to ignored or incorrectly processed requests.
Strategy Design Pattern:
Advantages:
Flexibility in adding new strategies without impacting existing code.
Promotes code reusability.
Disadvantages:
Users need to be aware of multiple strategies.
Large numbers of objects may become cumbersome.

## Class Diagram:
![UML](https://github.com/gopinathsjsu/individual-project-kaushikqr/assets/46593242/7292baff-7694-4389-a9e1-e2bfaedaf855)

## How to Run the Project:
Run App.java

Enter input file path: [Input file path with extension]

Enter output file path: [Output file path with extension]

How to Test Junit:
Click on "run all tests" to check JUnit test cases.
