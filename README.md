<div align="center">

# 🎓 Spring Boot School Management System

[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![Java](https://img.shields.io/badge/Java-17+-orange.svg)](https://www.oracle.com/java/)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)
[![Status](https://img.shields.io/badge/Status-Active-success.svg)]()

*A modern, lightweight school management application built with Spring Boot and JdbcTemplate*

[Features](#-features) • [Tech Stack](#-tech-stack) • [Getting Started](#-getting-started) • [API Endpoints](#-api-endpoints) • [Database Schema](#-database-schema) • [Contributing](#-contributing)

</div>

---

## 📋 Overview

The **Spring Boot School Project** is a full-stack web application designed for managing school information. This project demonstrates core Spring Boot concepts including MVC architecture, JdbcTemplate for database operations, and RESTful API design. Perfect for learning Spring Boot fundamentals and building CRUD applications.

### ✨ Key Highlights

- 🚀 Built with **Spring Boot** framework
- 🗄️ **JdbcTemplate** for efficient database operations
- 🎨 MVC architecture with Thymeleaf templating
- ✅ Full CRUD functionality (Create, Read, Update, Delete)
- 🔌 RESTful API endpoints
- 📊 Clean and maintainable code structure

---

## 🎯 Features

### Core Functionality

- ✏️ **Add Schools** - Register new school information
- 📖 **View Schools** - Display all schools in a clean interface
- 🔄 **Update Schools** - Edit existing school details
- 🗑️ **Delete Schools** - Remove school records
- 🔍 **Search & Filter** - Find schools by various criteria

### Technical Features

- RESTful API architecture
- Server-side validation
- Exception handling
- Database transaction management
- Responsive web interface

---

## 🛠️ Tech Stack

| Technology              | Purpose |
|-------------------------|---------|
| **Spring Boot**         | Application Framework |
| **Spring MVC**          | Web Layer & Controllers |
| **JdbcTemplate**        | Database Access |
| **Thymeleaf**           | Template Engine |
| **MySQL/PostgreSQL/H2** | Database |
| **Maven**               | Dependency Management |
| **Java 17+**            | Programming Language |

---

## 🚀 Getting Started

### Prerequisites

Before running this project, ensure you have:

- ☕ Java 17 or higher
- 📦 Maven 3.6+
- 🗄️ MySQL or PostgreSQL database
- 💻 Your favorite IDE (IntelliJ IDEA, Eclipse, VS Code)

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/umairdev010/Spring_Boot_School_Project.git
   cd Spring_Boot_School_Project
   ```

2. **Configure Database**

   Update `application.properties` with according to your database credentials. If using MySQL then:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/school_db 
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
   ```

3. **Create Database Schema**
   ```sql
   CREATE DATABASE school_db;
   USE school_db;
   
   CREATE TABLE school (
       id INT AUTO_INCREMENT PRIMARY KEY,
       name VARCHAR(255) NOT NULL,
       city VARCHAR(255) NOT NULL,
       estb_year INT NOT NULL
   );
   ```

4. **Build the project**
   ```bash
   mvn clean install
   ```

5. **Run the application**
   ```bash
   mvn spring-boot:run
   ```

6. **Access the application**

   Open your browser and navigate to:
   ```
   http://localhost:8082
   ```

---

## 📡 API Endpoints

### Web Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| `GET` | `/` | Home page with school list |
| `GET` | `/test` | Controller health check |
| `POST` | `/save` | Save or update school |
| `GET` | `/edit/{id}` | Edit school form |
| `GET` | `/delete/{id}` | Delete school by ID |

### REST Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| `GET` | `/ping` | Simple health check |
| `GET` | `/school/ping2` | Context path health check |

### Example Requests

**Add a School**
```http
POST /save
Content-Type: application/x-www-form-urlencoded

name=Greenwood High School
city=New York
estbYear=1995
```

**Edit a School**
```http
GET /edit/1
```

---

## 🗂️ Project Structure

```
Spring_Boot_School_Project/
│
├── src/main/java/org/practice/umair/spring_boot_school_project/
│   ├── controller/
│   │   ├── SchoolController.java      # Main CRUD controller
│   │   └── TestController.java        # Health check endpoints
│   │
│   ├── model/
│   │   └── School.java                # School entity/model
│   │
│   └── repository/
│       └── SchoolRepository.java      # Database operations
│
├── src/main/resources/
│   ├── templates/                     # Thymeleaf templates
│   ├── static/                        # CSS, JS, images
│   └── application.properties         # Configuration
│
└── pom.xml                            # Maven dependencies
```

---

## 🗄️ Database Schema

### School Table

| Column | Type | Constraints | Description |
|--------|------|-------------|-------------|
| `id` | INT | PRIMARY KEY, AUTO_INCREMENT | Unique identifier |
| `name` | VARCHAR(255) | NOT NULL | School name |
| `city` | VARCHAR(255) | NOT NULL | City location |
| `estb_year` | INT | NOT NULL | Establishment year |

---

## 💡 Usage Examples

### Adding a New School

1. Navigate to the home page
2. Fill in the school details in the form
3. Click "Save" to add the school to the database

### Editing a School

1. Click the "Edit" button next to the school
2. Modify the details in the form
3. Click "Save" to update

### Deleting a School

1. Click the "Delete" button next to the school
2. The school will be removed from the database

---

## 🧪 Testing

Test the application endpoints:

```bash
# Test controller health
curl http://localhost:8082/test

# Test REST endpoint
curl http://localhost:8082/ping
```


## 🔮 Future Enhancements

- [ ] Add Spring Data JPA for ORM
- [ ] Implement pagination and sorting
- [ ] Add authentication and authorization
- [ ] Create student management module
- [ ] Add file upload for school logos
- [ ] Implement search and advanced filtering
- [ ] Add REST API documentation with Swagger
- [ ] Write unit and integration tests
- [ ] Deploy to cloud platform (AWS/Azure/Heroku)

---

## 🤝 Contributing

Contributions are welcome! Here's how you can help:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

---

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## 👤 Author

**Umair**

- GitHub: [@umairdev010](https://github.com/umairdev010)
- Project Link: [Spring Boot School Project](https://github.com/umairdev010/Spring_Boot_School_Project)

---

## 🙏 Acknowledgments

- Spring Boot documentation
- Spring Framework community
- All contributors and supporters

---

<div align="center">

### ⭐ Star this repository if you find it helpful!

**Made with ❤️ for learning Spring Boot**

</div>