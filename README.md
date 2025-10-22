# 🎓 Student Records Management System (CLI-Based CRUD)

## 🧩 Overview
This project is a **Command-Line Interface (CLI)** based **Student Records Management System** developed in **Java**.  
It allows users to **Create, Read, Update, and Delete (CRUD)** student records such as ID, Name, and Marks.  
After performing each operation, the system interactively asks whether to continue or exit, providing a seamless experience.

---

## ⚙️ Features
- ➕ Add new student records  
- 📋 Display all student records  
- 🔍 Search for a student by ID  
- ✏️ Update student information  
- ❌ Delete student records  
- 💬 Interactive “Do you want to continue? (y/n)” prompt after each operation  
- 🧠 Simple and user-friendly CLI interface  

---

## 🧠 Technologies Used
- **Language:** Java  
- **Concepts:** OOP (Object-Oriented Programming), Collections (`ArrayList`, `Iterator`, `ListIterator`), Scanner input, CLI Interaction  

---

## 🗂️ Project Structure
```
StudentCRUD/
│
├── CRUD.java          # Main class containing CRUD logic and menu
├── Students.java      # Model class for student details
└── README.md          # Project documentation
```

---

## 🚀 How to Run

1. **Clone or Download** this repository  
2. Open a **terminal or command prompt** inside the project folder  
3. **Compile the program**
   ```bash
   javac CRUD.java
   ```
4. **Run the program**
   ```bash
   java CRUD
   ```
5. Follow the interactive menu to manage student records.

---

## 💻 Sample Output
```
---- CLI-Based CRUD Student Records Management System ----
1. INSERT
2. DISPLAY
3. SEARCH
4. UPDATE
5. DELETE
0. EXIT
Enter your choice: 1
Enter Student ID: 101
Enter Student Name: Aashik
Enter Student Marks: 88.5
✅ Student added successfully!

Do you want to continue? (y/n): y
```

---

## 👤 Author
**Name:** Aashik Reddy  
**Email:** [aashikreddythatiparthi03@gmail.com](mailto:aashikreddythatiparthi03@gmail.com)

---

## 🪪 License
This project is licensed under the **MIT License** — see the [LICENSE](./LICENSE) file for details.

---
