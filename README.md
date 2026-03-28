# Job Board API

A RESTful job board API built with Spring Boot where employers can post jobs and applicants can apply. Built as a portfolio project to demonstrate real-world backend development skills.

## Live Demo

Base URL: `https://jobboard-production-7e72.up.railway.app`

## Tech Stack

- **Java 21**
- **Spring Boot 3.5**
- **Spring Security + JWT** for authentication
- **Spring Data JPA + Hibernate** for database access
- **PostgreSQL** for the database
- **Maven** for dependency management
- **Deployed on Railway**

## Features

- User registration and login with JWT authentication
- Role-based access control (EMPLOYER and APPLICANT roles)
- Job posting management — create, view, and delete jobs
- Job application system — apply and manage applications
- Secure endpoints requiring authentication

## Project Structure
```
src/main/java/com/iggy/jobboard/
├── controller/       # REST API endpoints
├── service/          # Business logic
├── repository/       # Database access
├── entity/           # JPA entities
├── security/         # JWT and Spring Security config
```

## Getting Started

### Prerequisites
- Java 21
- PostgreSQL
- Maven

### Setup

1. Clone the repository
```bash
git clone https://github.com/erdkash1/jobboard.git
cd jobboard
```

2. Create a PostgreSQL database
```sql
CREATE DATABASE jobboard_db;
```

3. Update `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/jobboard_db
spring.datasource.username=your_username
spring.datasource.password=your_password
jwt.secret=your_base64_encoded_secret
jwt.expiration=86400000
```

4. Run the application
```bash
./mvnw spring-boot:run
```

The API will start on `http://localhost:8080`

## Authentication

This API uses JWT authentication. To access protected endpoints:

1. Register or login to get a token
2. Add the token to the `Authorization` header of every request:
```
Authorization: Bearer your_token_here
```

## API Endpoints

### Auth
| Method | Endpoint | Description | Auth Required |
|--------|----------|-------------|---------------|
| POST | `/auth/register` | Register a new user | No |
| POST | `/auth/login` | Login and get JWT token | No |

### Jobs
| Method | Endpoint | Description | Auth Required |
|--------|----------|-------------|---------------|
| GET | `/jobs` | Get all jobs | Yes |
| GET | `/jobs/{id}` | Get job by ID | Yes |
| POST | `/jobs` | Post a new job | Yes |
| DELETE | `/jobs/{id}` | Delete a job | Yes |

### Applications
| Method | Endpoint | Description | Auth Required |
|--------|----------|-------------|---------------|
| GET | `/applications` | Get all applications | Yes |
| POST | `/applications` | Apply for a job | Yes |
| DELETE | `/applications/{id}` | Delete an application | Yes |

## Example Requests

### Register
**POST** `https://jobboard-production-7e72.up.railway.app/auth/register`
```json
{
    "name": "John Doe",
    "email": "john@example.com",
    "password": "password123"
}
```

### Post a Job
**POST** `https://jobboard-production-7e72.up.railway.app/jobs`
```json
{
    "title": "Backend Developer",
    "description": "Looking for a Spring Boot developer",
    "company": "Tech Corp",
    "location": "Remote"
}
```

## Author

Erdenesuren Shirmen — Senior Computer Science Student
GitHub: [@erdkash1](https://github.com/erdkash1)