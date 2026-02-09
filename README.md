# Java Contact Manager

A lightweight, **console-based Contact Management application** built in Java.
It provides a simple and intuitive menu-driven interface for users to **add, view, search, update, and delete contacts**, while ensuring basic input validation for data integrity.
This project is ideal for learning Java fundamentals, object-oriented design, and basic CRUD operations.

---

## Features

- Add new contacts with Name, Phone, and Email.
- View all saved contacts.
- Search contacts by name (case-insensitive and partial matches supported).
- Update contact details by ID.
- Delete contacts by ID.
- Input validation:
  - Name cannot be empty.
  - Phone must be exactly 10 digits.
  - Email must contain `@` and a domain (`.`).

---

## How to Run

**Steps:**

1. Clone the repository:  
   `git clone https://github.com/rakshaashtankar/java-contact-manager.git`

2. Open the project in your preferred IDE (IntelliJ/Eclipse) **or** navigate to the project folder in terminal.

3. Run the `Main.java` file.

4. Follow the menu prompts in the console to use the application.

---


## Project Structure

- `src/com/contactmanager/model/Contact.java` — Represents a contact entity.
- `src/com/contactmanager/service/ContactService.java` — Contains all business logic like add, update, delete, search, and validation.
- `src/com/contactmanager/Main.java` — Console interface and menu-driven operations.

---

## Input Validation Rules

- **Name**: Cannot be null or empty.
- **Phone**: Must be exactly 10 digits.
- **Email**: Must contain `@` and a valid domain.

---

## Tech Stack

- **Language:** Java
- **IDE:** IntelliJ IDEA / Eclipse (any Java-supporting IDE)
- **Build/Run:** Java SDK (JDK 8 or above)
- **Version Control:** Git / GitHub

---

## Notes

- This is a **mini project**, so all data is stored in memory and will be lost when the application exits.
- Input validation ensures **basic correctness**, but advanced checks (like email format or duplicate contacts) are not implemented.

---

## Author

**Raksha Ashtankar**
