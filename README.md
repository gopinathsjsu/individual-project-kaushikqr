# Individual-project-cmpe202-kaushikqr

# Student ID: 0017426955


#### 1. Describe what is the primary problem you try to solve?

Ans: The primary problem I'm trying to solve is how to determine whether a credit card is valid or not by comparing it
to the various credit card types, such as Mastercard, Visa, American Express, and Discover, and using the credit card
number to find the card issuer and the appropriate objects based on the type of card.

#### 2. Describe what are the secondary problems you try to solve (if there are any)?

Ans: Determining the appropriate design patterns to take into account is the secondary issue. Future additions of new
credit classes for various credit card types.

#### 3. Describe what design pattern(s) you use (use plain text and diagrams)?

Ans: Design Patterns: Chain of Responsibility, Strategy

#### Strategy Design Pattern:

The Strategy Design Pattern enables dynamic behavior changes in an application based on a selected strategy at runtime.
It allows for the creation of objects and strategies specific to different file types, adapting the application's
behavior accordingly.

I implemented Strategy Design Pattern to support multiple file formats in my application. I designed three interfaces -
Reader, Writer, and CreditCardHandler - to handle different aspects of file processing and credit card handling.

The Reader interface provides a common contract for classes that can read input files, and it includes a readFile method
to handle the reading process based on the input file type.

The CreditCardHandler interface defines a common structure for classes responsible for checking the credit card type of
parsed input files. It includes a checkCreditType method that takes the parsed input file and determines if it belongs
to any specific credit card type category.

The Writer interface provides a common structure for classes responsible for writing data to different file formats. It
includes a writeToFile method that takes an input of type OutputEntry (which represents the final output format) and
writes the data to the expected file format.

This design pattern enables runtime behavior swapping and follows the Open/Closed principle. It allows for the
introduction of new strategies without affecting the client code, making it easy to accommodate new file formats without
disrupting the existing code or design.

#### Chain of Responsibility Design Pattern:

When a request is issued by the client, it is received by the first handler in the chain. Each handler checks the
request and decides whether to process it or pass it along the chain. If a handler decides not to process the request,
it passes the request to the next handler in the chain. This process continues until the request is handled or the chain
is exhausted.

After parsing an XML, JSON, or CSV file, we need to validate its content to determine the credit card type among the
four available types.

We can utilize the Chain of Responsibility design pattern to validate the file against different credit card handlers.
The validation process starts with the MasterCard handler. If the file does not match the criteria for MasterCard, it is
passed on to the next credit card handler in the chain. This allows for flexible and extensible validation of the file
against multiple credit card types.

To facilitate the overall process, we introduce a main credit card handler that acts as a mediator. This handler
receives the file and passes it to each individual credit card handler for validation. Each credit card handler
implements the main handler and performs the necessary checks specific to its credit card type. This approach enables a
centralized and organized validation process, allowing each handler to focus on its designated credit card type.

#### 4. Describe the consequences of using this/these pattern(s)?

##### Chain of Responsibility

###### Advantages:

-> Decouples the sender of a request from its recipients.

-> The client is unaware of the chain structure and interacts with the chain through direct method calls.

-> The order of the chain can be easily modified or adjusted, and new handlers can be added or existing ones can be
removed as needed.

###### Disadvantages:

-> Debugging and observing the runtime characteristics of the chain can be challenging due to the dynamic nature of the
pattern.
-> If the chain is not properly configured or there are gaps in the chain, it may lead to requests being ignored or not
processed correctly.

#### Strategy Design Pattern:

###### Advantages:

-> The Strategy design pattern provides flexibility in adding new strategies as needed without impacting existing code.

-> It promotes code reusability. By encapsulating specific algorithms or behaviors into separate strategies, these
strategies can be reused across different parts of the application. This eliminates the need for duplicating code or
implementing similar logic multiple times, leading to cleaner and more maintainable code.

###### Disadvantages:

-> Users of the Strategy design pattern should be aware of multiple strategies and understand the distinctions between
them.

-> Having a large number of objects at the same time can become cumbersome and redundant in the Strategy design pattern.

#### Class Diagram:


#### How to Run the project:

Run the App.java

Enter the input file path: Input file path with extension

Enter the output file path: Ouput file path with extension

#### How to test Junit test?

Click on run all tests to check JUnit testcases.
