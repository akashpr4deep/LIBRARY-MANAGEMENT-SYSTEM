


## Problem Statement

Small libraries, classrooms, and educational projects often need a simple way to keep track of books and manage lending. Using paper records or spreadsheets can lead to mistakes, duplicated information, and difficulty maintaining accurate records.

This project provides a lightweight, command-line-based Java application for managing library books. It allows users to add and view books, issue books to borrowers, and record returned books. The system is designed to keep the library’s information organized while remaining easy to understand, run, and extend.

## Project Scope

The application focuses on the essential operations required for basic library management. It is implemented as a simple, single-file Java program that runs in the terminal.

The features included in the current version are:

- Managing books in memory without requiring a database.
- Adding new books to the library.
- Displaying the list of available and issued books.
- Issuing books to borrowers.
- Returning previously issued books.
- Providing an interactive menu for easy navigation.
- Including a few sample books when the program starts.

The following features are not included in the current version but could be added in the future:

- Saving data permanently to a file or database.
- Supporting multiple users at the same time.
- Managing reservations, fines, borrower details, or detailed reports.
- Providing a graphical or web-based user interface.

## Target Users

This project is designed for:

- Small libraries that need a basic book management system.
- Teachers and instructors managing classroom or lab libraries.
- Students learning Java through a practical project.
- Developers who want a simple foundation for building a more advanced library system.

## Main Features

### Add a Book

Users can add a book by entering its ID, title, and author. Every newly added book is marked as available.

### Display Books

The system displays all books along with their ID, title, author, and current status. A book can have one of two statuses: `Available` or `Issued`.

### Issue a Book

Users can issue a book by entering its ID. The system prevents a book from being issued if it has already been lent out.

### Return a Book

Users can return an issued book by entering its ID. Once returned, the book’s status is changed back to `Available`.

### Sample Books

The program starts with a small collection of sample books, allowing users to test the system immediately without entering all the data manually.

### Simple Command-Line Interface

A menu-driven interface guides users through each operation. Clear prompts and confirmation messages make the program easy to use.

## Java Implementation

The application is implemented in `sourcecode.java` using only standard Java libraries. The program does not use a package, so it can be compiled and executed directly from the repository root.

To compile and run the program, use the following commands:

```bash
javac sourcecode.java
java LibraryManagementSystem
