# Employee API

## Project Overview

This is a Spring Boot REST API for managing employee records. The application provides full CRUD operations for employee entities, backed by an in-memory H2 database.

## Tech Stack

- Java 17
- Spring Boot 3.5.x
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

## API Endpoints

Base URL: `http://localhost:8080`

| Method | Endpoint | Description |
| --- | --- | --- |
| POST | `/employees` | Create a new employee |
| GET | `/employees` | Retrieve all employees |
| GET | `/employees/{id}` | Retrieve an employee by ID |
| PUT | `/employees/{id}` | Update an existing employee |
| DELETE | `/employees/{id}` | Delete an employee by ID |

## How to Run

1. Open a terminal in the project directory.
2. Run the application with Maven:

```bash
./mvnw spring-boot:run
```

On Windows, use:

```powershell
./mvnw.cmd spring-boot:run
```

3. Access the API at `http://localhost:8080`.
4. Optionally access the H2 console at `http://localhost:8080/h2-console`.
   - JDBC URL: `jdbc:h2:mem:employee_db`
   - User Name: `sa`
   - Password: (leave empty)

## Sample Requests

### Create Employee

POST `http://localhost:8080/employees`

Headers:
- `Content-Type: application/json`

Body:

```json
{
  "name": "Alice Johnson",
  "email": "alice.johnson@example.com",
  "department": "Engineering",
  "salary": 85000.00
}
```

Expected Response:
- Status: `201 Created`
- Body: created employee object with `id`

### Get All Employees

GET `http://localhost:8080/employees`

Expected Response:
- Status: `200 OK`
- Body: array of employee objects

### Get Employee By ID

GET `http://localhost:8080/employees/1`

Expected Response:
- Status: `200 OK`
- Body: employee object

If the employee is not found:
- Status: `404 Not Found`

### Update Employee

PUT `http://localhost:8080/employees/1`

Headers:
- `Content-Type: application/json`

Body:

```json
{
  "name": "Alice Johnson",
  "email": "alice.johnson@example.com",
  "department": "Product",
  "salary": 88000.00
}
```

Expected Response:
- Status: `200 OK`
- Body: updated employee object

### Delete Employee

DELETE `http://localhost:8080/employees/1`

Expected Response:
- Status: `204 No Content`

## Postman Request Examples

Use the following sample requests in Postman:

- Create Employee: `POST http://localhost:8080/employees`
- Get All Employees: `GET http://localhost:8080/employees`
- Get Employee By ID: `GET http://localhost:8080/employees/{id}`
- Update Employee: `PUT http://localhost:8080/employees/{id}`
- Delete Employee: `DELETE http://localhost:8080/employees/{id}`

## Notes

- The API returns `404 Not Found` when a lookup by ID fails.
- The H2 database is configured for in-memory storage and resets on restart.
