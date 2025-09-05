# Student Management System

A professional, interactive, and robust command-line (CLI) application built with Java for managing student records. This project is designed to run in any terminal environment like Termux, Kali Linux, or Windows Terminal and showcases a comprehensive use of Object-Oriented Programming (OOP) principles in Java.

## ✨ Features

- **Attractive CLI:** A colorful and well-organized text-based user interface.
- **ASCII Art Banner:** A beautiful welcome screen with system and developer information.
- **Student Management:**
    - Add new students with their courses and grades.
    - View details of a specific student by searching with their ID.
    - Display a complete list of all students.
    - Delete student records from the system.
- **GPA Calculation:** Automatically calculates a student's Grade Point Average (GPA).
- **Data Persistence:** Student data is saved to a file (`data/students.dat`), so information is not lost when the application is closed.
- **Cross-Platform:** Runs on any system with Java installed.

---

## 🛠️ Core Java Concepts Used

This project was built to professionally demonstrate a wide range of Java concepts:

- **Class, Object, Attributes, Methods**: The fundamental building blocks used to model entities like `Student`, `Course`, and the application `App` itself.
- **Constructor & `this`**: Used for initializing objects and differentiating between instance variables and local parameters.
- **Encapsulation & Access Modifiers**: Data is protected using `private` attributes, with access provided through `public` getters and setters.
- **Inheritance & `super`**: The `Student` class `extends` an `abstract` `Person` class, reusing common attributes and methods. The `super` keyword is used to call the parent class's constructor.
- **Polymorphism (Overriding)**: The `getDetails()` method in the `Person` class is overridden in the `Student` class to provide specific implementation.
- **Abstract Class & Interface**:
    - An `abstract class` (`Person`) is used as a template for other classes.
    - An `interface` (`IDataHandler`) defines a contract for data handling services, promoting loose coupling.
- **`final` & `static`**:
    - The `final` keyword is used in the `AnsiColors` class to create constants.
    - `static` members and methods are used where state or behavior is not tied to a specific object instance.
- **Packages & `import`**: The project is organized into logical packages (`com.university.main`, `models`, `services`, `ui`) to manage the codebase effectively.
- **`this` vs `super`**: Differentiated within constructors (`this()` vs `super()`) to illustrate calls to other constructors in the same class versus a parent class.

---

## 🚀 Getting Started

Follow these instructions to compile and run the project on your local machine.

### Prerequisites

You must have a **Java Development Kit (JDK)** installed on your system (version 8 or higher).

- To check if you have Java installed, open your terminal and run:
  ```bash
  java -version
  ```

### Installation & Running

1.  **Clone the Repository (or create the files manually)**
    If this were on Git, you would clone it. For now, create the directory structure and files as described above.

2.  **Navigate to the Project Directory**
    Open your terminal and change to the root directory of the project.
    ```bash
    cd /path/to/StudentManagementSystem
    ```

3.  **Compile the Project**
    The following command compiles all `.java` files from the `src` directory and places the resulting `.class` files into the `build` directory.

    **On Linux/macOS/Termux:**
    ```bash
    javac -d build $(find src -name "*.java")
    ```

    **On Windows (CMD):**
    ```bash
    javac -d build src\\com\\university\\main\\*.java src\\com\\university\\models\\*.java src\\com\\university\\services\\*.java src\\com\\university\\ui\\*.java
    ```
    *Note: The Windows command might need adjustment based on your shell. Using the Linux command within Git Bash or WSL is often easier.*

4.  **Run the Application**
    This command runs the application from within the `build` folder, which is now on the classpath.

    **On all platforms (from the root project directory):**
    ```bash
    java -cp build com.university.main.App
    ```

The application will start, display the welcome banner, and show the main menu. Enjoy!

---

### **Developer**

- **Name:** M/ Hamad Hatrom
- **Contact:** T/779357374
