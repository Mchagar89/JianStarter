# JianStarter

A Spring Boot starter application for demo purposes.

## Project Description

This is a simple Spring Boot application that demonstrates:
- REST API endpoints
- JPA/Hibernate database operations
- Spring Data repositories
- Application configuration
- Unit testing

## Prerequisites

- Java 17 or higher
- Maven 3.6 or higher

## Getting Started

### Build the Project

```bash
mvn clean install
```

### Run the Application

```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

## API Endpoints

### Hello Endpoint

```
GET /api/hello
```

Returns: `Hello from JianStarter Spring Boot Application!`

### Status Endpoint

```
GET /api/status
```

Returns: `Application is running successfully!`

## Database

The application uses an H2 in-memory database for development and testing.

### Access H2 Console

Navigate to: `http://localhost:8080/h2-console`

- URL: `jdbc:h2:mem:testdb`
- Username: `sa`
- Password: (leave blank)

## Project Structure

```
src/
├── main/
│   ├── java/com/jian/
│   │   ├── JianStarterApplication.java (Main application class)
│   │   ├── controller/
│   │   │   └── HelloController.java (REST endpoints)
│   │   ├── model/
│   │   │   └── User.java (Entity)
│   │   └── repository/
│   │       └── UserRepository.java (Data access)
│   └── resources/
│       └── application.properties (Configuration)
└── test/
    └── java/com/jian/
        └── JianStarterApplicationTests.java (Tests)
```

## Dependencies

- Spring Boot Starter Web
- Spring Boot Starter Data JPA
- Lombok
- H2 Database
- Spring Boot Test

## Version

- Spring Boot: 3.2.4
- Java: 17

## License

This project is open source and available under the MIT License.
