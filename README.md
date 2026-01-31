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
Use code with caution.

Update src/main/resources/application.properties with your credentials:
properties
spring.datasource.url=jdbc:mysql://localhost:3306/legislation
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
Use code with caution.

🏃 How to Run
Follow these steps to get the application up and running:
Clone the repository:
bash
git clone https://github.com
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

### Pro-Tips for your README:
*   **Badges:** You can add [GitHub Badges](https://github.com) to show the build status.
*   **License:** If you plan to share this, include a [LICENSE](https://choosealicense.com) file (like MIT or Apache 2.0).
*   **Screenshots:** Since you have a UI with a black header and centered form, adding a screenshot significantly improves the presentation.




Show me how to integrate Bootstrap with Thymeleaf

Give an example of Spring Boot 4 Controller with Thymeleaf view

Tell me more about H2 in-memory databases

