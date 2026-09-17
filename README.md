# LIBRARY-MANAGEMENT-SYSTEM

## Input Examples

- Book ID: `11`, `B101`, or `A-23`
- Book title: `New Book`
- Book author: `Some Author`
- Menu choice: `1` to add a book

Book IDs are treated as strings, so IDs may contain letters, numbers, or symbols.

## Testing Checklist

The current application can be tested manually:

- **Test A:** Add a new book and select **Display Books**. Verify that it appears with status `Available`.
- **Test B:** Issue an available book and verify that its status changes to `Issued`.
- **Test C:** Try issuing a book that is already issued. An explanatory message should be displayed.
- **Test D:** Return an issued book and verify that its status changes back to `Available`.
- **Test E:** Try returning a non-issued or non-existent book ID. The program should display an appropriate message.
- **Test F:** Enter an invalid menu option and verify that the program asks for a number from 1 to 5.

## Suggested Improvements

- Validate input and prevent empty fields
- Prevent duplicate book IDs
- Move the `Book` class into its own file
- Replace the boolean issued flag with a more expressive status model
- Persist data using JSON, CSV, or SQLite
- Track borrower name, issue date, and return date
- Add search by title or author
- Add automated tests with JUnit
- Add a GitHub Actions workflow for continuous integration
- Provide a web or desktop GUI

## License

This project is intended for educational and demonstration purposes.
