# LIBRARY-MANAGEMENT-SYSTEM

## Overview

This is a simple command-line Library Management System developed using Java. It simulates the basic operations of a library, allowing users or librarians to add books, view the library inventory, issue books, and return books.

The application stores book data in memory using Java collections, making it suitable for learning, practice, and demonstration purposes.

## Features

- Add a new book with:
  - Book ID
  - Book title
  - Book author
- Display all books in the library
- Show book status:
  - Available
  - Issued
- Issue a book using its ID
- Return an issued book using its ID
- Start with a preset list of books
- Simple menu-driven command-line interface
- Handle invalid book IDs and menu choices

## Technologies/Tools Used

- **Programming Language:** Java
- **Java Version:** Java 8 or later
- **Standard Java Libraries:**
  - `java.util.ArrayList`
  - `java.util.List`
  - `java.util.Scanner`
- **Development Tools:**
  - JDK
  - Command Prompt or Terminal
  - Any Java-supported IDE, such as IntelliJ IDEA, Eclipse, or Visual Studio Code

No external libraries or dependencies are required.

## Installation & Setup

### 1. Install Java

Install the Java Development Kit (JDK) version 8 or later.

Verify the installation using:


java -version
javac -version


### 2. Clone the Repository


git clone https://github.com/akashpr4deep/LIBRARY-MANAGEMENT-SYSTEM.git


Move into the project directory:


cd LIBRARY-MANAGEMENT-SYSTEM


### 3. Check the Java File Name

The source file is currently named `sourcecode.java`.

Because the Java class is named `LibraryManagementSystem`, rename the file to:


LibraryManagementSystem.java

On Linux or macOS:


mv sourcecode.java LibraryManagementSystem.java


On Windows, rename the file manually using File Explorer or run:


Rename-Item sourcecode.java LibraryManagementSystem.java


## How to Run

### Compile the Program

Open a terminal in the project directory and run:


javac LibraryManagementSystem.java


This creates the compiled Java class files.

### Run the Program


java LibraryManagementSystem


The following menu will appear:


*** Library Management System ***
1. Add Book
2. Display Books
3. Issue Book
4. Return Book
5. Exit
Enter your choice (1-5):

Select an option by entering a number from `1` to `5`.

### Example: Add a Book


Enter your choice (1-5): 1
Enter Book ID: 11
Enter Book Title: New Book
Enter Book Author: Some Author


### Example: Display Books


ID: 1    Title: The Wimpikid    Author: Harper Lee    Status: Available
ID: 3    Title: Pride and Prejudice    Author: Jane Austen    Status: Issued


### Menu Options

| Option | Description |
|---|---|
| 1 | Add a new book |
| 2 | Display all books |
| 3 | Issue a book |
| 4 | Return a book |
| 5 | Exit the application |
