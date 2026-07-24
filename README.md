# 🎓 Student Management System

A console-based **Student Management System** developed using **Java, JDBC, and MySQL**. This project demonstrates CRUD operations, database connectivity, Object-Oriented Programming (OOP), and the DAO (Data Access Object) design pattern.

---

## 📌 Overview

This application allows users to manage student records from a console interface. It follows a modular architecture by separating database access, business logic, and user interaction into different packages.

The project was built to strengthen practical knowledge of:

- Java Programming
- JDBC Connectivity
- MySQL Database
- Object-Oriented Programming
- DAO Design Pattern
- CRUD Operations
- Input Validation
- Exception Handling
- Git & GitHub

---

# ✨ Features

| Feature | Status |
|---------|:------:|
| Add Student | ✅ |
| View Students | ✅ |
| Search Student | ✅ |
| Update Student | ✅ |
| Delete Student | ✅ |
| Email Validation | ✅ |
| Phone Validation | ✅ |
| Duplicate Email Prevention | ✅ |
| PreparedStatement | ✅ |
| Exception Handling | ✅ |

---

# 🚀 Tech Stack

| Technology | Purpose |
|------------|---------|
| Java | Programming Language |
| JDBC | Database Connectivity |
| MySQL | Database |
| Git | Version Control |
| GitHub | Repository Hosting |
| VS Code | IDE |

---

# 🏗️ Project Architecture

```text
                +------------------+
                |    Console UI    |
                +---------+--------+
                          |
                          v
                +------------------+
                | Student Service  |
                +---------+--------+
                          |
                          v
                +------------------+
                |   Student DAO    |
                +---------+--------+
                          |
                          v
                +------------------+
                | JDBC Connection  |
                +---------+--------+
                          |
                          v
                +------------------+
                |     MySQL DB     |
                +------------------+
```

---

# 🔄 Application Flow

```text
User

↓

Main Menu

↓

Choose Operation

↓

Input Validation

↓

DAO Layer

↓

PreparedStatement

↓

MySQL Database

↓

Success / Failure

↓

Console Output
```

---

# 📂 Project Structure

```text
StudentManagementSystem
│
├── lib
│   └── mysql-connector-j.jar
│
├── screenshots
│
├── src
│   ├── dao
│   │    └── StudentDAO.java
│   │
│   ├── db
│   │    └── DBConnection.java
│   │
│   ├── model
│   │    └── Student.java
│   │
│   ├── ui
│   │    └── MainMenu.java
│   │
│   └── App.java
│
├── README.md
└── .gitignore
```

---

# 📦 Package Description

| Package | Responsibility |
|----------|----------------|
| dao | Performs CRUD operations |
| db | Manages database connection |
| model | Student entity class |
| ui | Console interface |
| App.java | Entry point of application |

---

# 🗄️ Database

Database Name

```sql
student_management_system
```

Table

```sql
students
```

---

## Database Schema

```sql
CREATE TABLE students (

id INT PRIMARY KEY AUTO_INCREMENT,

name VARCHAR(100) NOT NULL,

email VARCHAR(100) UNIQUE NOT NULL,

phone VARCHAR(15),

department VARCHAR(100)

);
```

---

# ER Diagram

```text
+------------------------------------------------+
|                 STUDENTS TABLE                 |
+------------------------------------------------+
| id (PK)                                       |
| name                                          |
| email                                         |
| phone                                         |
| department                                    |
+------------------------------------------------+
```

---

# 📚 Concepts Demonstrated

- Object-Oriented Programming
- DAO Design Pattern
- JDBC Connectivity
- CRUD Operations
- SQL
- PreparedStatement
- ResultSet
- Exception Handling
- Input Validation
- Package Organization

---

# ⚙️ Installation

Clone Repository

```bash
git clone https://github.com/codefuser/student-management-system-java.git
```

Open project inside VS Code.

---

Compile

```bash
javac -cp ".;lib/mysql-connector-j.jar" src/App.java
```

Run

```bash
java -cp ".;lib/mysql-connector-j.jar;src" App
```

---

# 📸 Screenshots

## Main Menu

```
screenshots/main-menu.png
```

## Add Student

```
screenshots/add-student.png
```

## View Students

```
screenshots/view-students.png
```

## Search Student

```
screenshots/search-student.png
```

## Update Student

```
screenshots/update-student.png
```

## Delete Student

```
screenshots/delete-student.png
```

## Database

```
screenshots/mysql-table.png
```

---

# 💡 Project Highlights

- Built using Java, JDBC, and MySQL.
- Implements complete CRUD functionality.
- Uses DAO Design Pattern.
- Uses PreparedStatement to execute SQL queries.
- Prevents duplicate email entries.
- Performs input validation.
- Organized using modular package structure.
- Easy to extend and maintain.

---

# 📖 Learning Outcomes

Through this project, I gained practical experience in:

- Java Programming
- Object-Oriented Programming
- JDBC API
- MySQL Integration
- SQL Queries
- CRUD Operations
- DAO Design Pattern
- Exception Handling
- Validation Techniques
- Git & GitHub Workflow

---

# 🔮 Future Improvements

- Spring Boot REST API
- JavaFX User Interface
- User Authentication
- Admin Dashboard
- Role-Based Access
- Export to CSV
- Docker Support
- Maven Project Structure
- Unit Testing with JUnit
- Logging Framework

---

# 🧪 Sample Workflow

```text
Start

↓

Display Menu

↓

User selects option

↓

Validate Input

↓

DAO Method Called

↓

Execute SQL Query

↓

Receive Result

↓

Display Response

↓

Repeat Until Exit
```

---

# 🛡️ Best Practices Used

- Layered Project Structure
- Reusable Database Connection
- PreparedStatement
- Input Validation
- Exception Handling
- Modular Code Organization

---

# 📈 Skills Demonstrated

- Core Java
- JDBC
- SQL
- MySQL
- OOP
- DAO Pattern
- CRUD Operations
- Git
- GitHub

---

# 📄 License

This project is created for learning and educational purposes.

---

# 👨‍💻 Author

**Joseph**

- GitHub: https://github.com/codefuser
- LinkedIn: https://www.linkedin.com/in/joseph-fullstack/

---

## ⭐ If you found this project useful, consider giving it a Star on GitHub.

---
