## Problem statement

Small libraries, classrooms, and learning projects often need a straightforward way to track books and manage lending without the overhead of a full library information system.
Manual tracking (paper logs or spreadsheets) is error-prone and hard to keep consistent. This project provides a lightweight, terminal-based Java tool to add and list books, record when a book is issued, and record returns — keeping the library's state consistent while remaining easy to run and understand.

## Scope of the project

This project focuses on implementing core library operations in a simple, single-file Java program that runs from the command line. Within scope:
- In-memory management of a collection of books (no persistence by default).
- Basic CRUD-like operations limited to: add book, display books, issue book, and return book.
- A user-friendly interactive menu for performing operations.
- Initialization with an optional small set of sample books for testing and demonstration.

Out of scope for the current version (can be added later):
- Persistent storage (database or file) — optional enhancement.
- Multi-user or concurrent access handling.
- Advanced features like reservations, fines, complex borrower records, or reporting dashboards.
- A graphical or web-based user interface.

## Target users

- Small library staff looking for a minimal electronic tool.
- Teachers or lab instructors managing classroom libraries.
- Students learning Java who want a simple, practical project.
- Developers who need a starting point to extend into a more complete system.

## High-level features

- Add Book: Enter an ID, title, and author to add a new book (marked Available).
- Display Books: List all books with ID, title, author, and current status (Available / Issued).
- Issue Book: Mark a book as issued by entering its ID; prevent issuing if already lent out.
- Return Book: Mark a previously issued book as returned using its ID.
- Starter Data: The program starts with a small set of sample books to try features immediately.
- Clear CLI Flow: Simple menu-driven interface with prompts and confirmation messages for usability.

## Java implementation

The implementation is in `sourcecode.java` and uses only standard Java libraries. The class is intentionally package-free so it can be compiled and run from the repository root.

Compile and run:

```bash
javac sourcecode.java
java LibraryManagementSystem
