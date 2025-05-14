# 🧑‍💻 University Course Registration System

## 📚 Overview

This is a modular, scalable Java-based University Course Registration System designed using Java Collections Framework. It allows for student registration, waitlisting, course management, and data analytics in a clean and extensible structure.

---

## 🛠️ Features

- ✅ Register students to courses with capacity checks and waitlisting
- ✅ Drop students from courses and auto-promote waitlisted students
- ✅ List students in a course (sorted by name)
- ✅ List students from a specific branch across all courses
- ✅ List all courses sorted by enrollment count (descending)
- ✅ Filter courses by instructor or credit value
- ✅ Data validation and duplicate prevention
- ✅ Modular package structure for clarity and separation of concerns

---
## 📦 Project Structure


---

## 📑 Core Classes

### Student

- `id`, `name`, `email`, `year`, `branch`
- Overrides `equals()` and `hashCode()` to ensure uniqueness

### Course

- `courseId`, `courseName`, `instructorName`, `capacity`, `credits`
- Uses:
    - `TreeSet<Student>` for enrolled students (sorted)
    - `Queue<Student>` for waitlisted students

### RegistrationSystem

- Manages:
    - All courses and students
    - Registration/dropping with waitlist handling
    - Filtering and listing logic

---

## 💻 Sample Console Interactions

### 🔹 Register Student

### 🔹 Drop Course

### 🔹 List Students in a Course






