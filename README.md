# Student Management System

A simple **RESTful API** for managing students, built with **Spring Boot**, **Spring Data JDBC**, and **MySQL**.

## Features

- **Create**, **Read**, **Update**, and **Delete** (CRUD) operations for student records.
- MySQL integration for storing and retrieving student information.
- Uses **Spring Data JDBC** for data persistence.
- **Lombok** integration for reducing boilerplate code.

## Prerequisites

- **Java 17** or higher.
- **MySQL** server running on your local machine or a configured remote server.
- **Gradle** (or use the included Gradle Wrapper).
- **IDE** (e.g., IntelliJ IDEA, Eclipse) or command-line tools.

## Setup

### 1. Clone the repository
```bash
git clone https://github.com/your-repository/student-management-system.git
cd student-management-system
```

### 2. MySQL Database Setup

Run the following SQL commands to set up the `studentsystem` database and the `students` table:

```sql
CREATE DATABASE studentsystem;

USE studentsystem;

CREATE TABLE students (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    course VARCHAR(100) NOT NULL
);

-- Insert sample data
INSERT INTO students (name, email, course)
VALUES ('John Doe', 'john.doe@example.com', 'Computer Science'),
       ('Jane Smith', 'jane.smith@example.com', 'Mathematics');
```

### 3. Configure Database Connection

Update the MySQL connection details in the `src/main/resources/application.properties` file:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/studentsystem
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
```

### 4. Build and Run the Application

You can run the project using **Gradle Wrapper** without installing Gradle globally.

- **On Windows**:
  ```bash
  ./gradlew.bat bootRun
  ```

- **On macOS/Linux**:
  ```bash
  ./gradlew bootRun
  ```

The application will start and run at `http://localhost:8080`.

## API Endpoints

| Method | URL                         | Description                       |
|--------|-----------------------------|-----------------------------------|
| GET    | `/api/students`             | Get all students                  |
| GET    | `/api/students/{id}`        | Get student by ID                 |
| POST   | `/api/students`             | Create a new student              |
| PUT    | `/api/students/{id}`        | Update student by ID              |
| DELETE | `/api/students/{id}`        | Delete student by ID              |

### Example API Request

- **Create a Student** (POST):
  - URL: `http://localhost:8080/api/students`
  - Body (JSON):
    ```json
    {
      "name": "Alice Johnson",
      "email": "alice.johnson@example.com",
      "course": "Physics"
    }
    ```

## Dependencies

- **Spring Boot**: Web, Data JDBC
- **MySQL**: MySQL Connector for database connectivity
- **Lombok**: Simplifies Java code by reducing boilerplate (Getters, Setters, Constructors)
- **Gradle**: Build automation tool

## Troubleshooting

1. **Database connection issues**:
   - Ensure MySQL is running and the connection details (username, password, URL) are correct in `application.properties`.
   
2. **Gradle build issues**:
   - Run `./gradlew clean build` to clean and rebuild the project.
   - Ensure the correct Java version (17 or higher) is installed.

