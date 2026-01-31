# Spring Boot MVC Application 🚀

A modern web application built with Spring Boot, featuring server-side rendering with Thymeleaf and persistent storage via MySQL.

## 🛠 Tech Stack

*   **Framework:** [Spring Boot 4.0](https://spring.io)
*   **Language:** [Java 25](https://openjdk.org)
*   **Template Engine:** [Thymeleaf](https://www.thymeleaf.org)
*   **Persistence:** Spring Data JPA
*   **Database:** MySQL

## 📋 Prerequisites

Before running the application, ensure you have the following installed:
*   **JDK 25** or higher
*   **Maven 3.9+** or **Gradle 8+**
*   **MySQL Server** (Running on port 3306)

## ⚙️ Configuration

1. Create a database in MySQL:
   ```sql
   CREATE DATABASE legislation;

2. Create the table
 ```sql
CREATE TABLE `legislation_info` (
   `id` bigint NOT NULL AUTO_INCREMENT,
   `title` varchar(255) NOT NULL,
   `text_desc` varchar(255) NOT NULL,
   `sponsors` tinytext,
   `created_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
   PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci

3.  Create the table
 ```sql
CREATE TABLE `legislator_info` (
   `id` bigint NOT NULL AUTO_INCREMENT,
   `first_name` varchar(255) NOT NULL,
   `last_name` varchar(255) NOT NULL,
   `home_town` varchar(255) NOT NULL,
   `created_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
   PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
Use code with caution.

Update src/main/resources/application.properties with MYSQL Server DB credentials:

spring.datasource.url=jdbc:mysql://localhost:3306/legislation
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

Use code with caution.

🏃 How to Run
Follow these steps to get the application up and running:
Clone the repository:
bash
git clone [https://github.com](https://github.com/kippy125/Rahini_Legislative.git)
cd your-repo-name
Use code with caution.

Build the project:
Using Maven:
bash
./mvnw clean install
Use code with caution.

Run the application:
bash
./mvnw spring-boot:run
Use code with caution.

Access the Application:
Open your browser and navigate to: http://localhost:8080

📁 Project Features
MVC Architecture: Clean separation of concerns using Spring Controllers.
Dynamic UI: Multi-select dropdowns and forms powered by Thymeleaf.
Database Integration: Seamless CRUD operations using Spring Data JPA.
Responsive Design: Styled with custom CSS for centered layouts and black headers/footers.




