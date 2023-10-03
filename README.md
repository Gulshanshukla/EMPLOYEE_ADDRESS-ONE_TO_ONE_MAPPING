# Employee Address Application

This project is a simple Employee and Address management system implemented using Spring Boot and JPA (Java Persistence API). It allows you to perform CRUD (Create, Read, Update, Delete) operations on employees and their associated addresses.
*** 

## Table of Contents

- [Prerequisites](#prerequisites)
- [Project Structure](#project-structure)
- [Endpoints](#endpoints)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)
 ***

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) 8 or higher
- Maven (for building the project)
- Your preferred IDE (e.g., IntelliJ IDEA, Eclipse)
- MySQL or another relational database (configured in `application.properties`)
  ***
  
 ## Project Structure
The project structure is organized as follows:

- `src/main/java/com/example/employeeaddressapplication/`:

- `controller/`: Contains controller classes for handling HTTP requests and responses.
- `model/`: Contains the Employee and Address entity classes.
- `repo/`: Contains repository interfaces for database operations.
- `service/`: Contains service classes for encapsulating business logic.
- `Application.java`: The main application class.
- `src/main/resources/`:

application.properties: Configuration file for database settings and other application properties.
***
## Endpoints
The application exposes the following endpoints:

### Employee Endpoints (EmployeeController):
- `GET /employees`: Get all employees.
- `GET /employee/id/{id}`: Get an employee by ID.
- `POST /employees`: Create a new employee.
- `PUT /update/id/{id}`: Update an employee by ID.
- `DELETE /delete/employee/id/{id}`: Delete an employee by ID.
### Address Endpoints (AddressController):
- `GET /addresses`: Get all addresses.
- `GET /address/id/{id}`: Get an address by ID.
- `POST /addresses`: Create a new address.
- `PUT /update/address/id/{id}`: Update an address by ID.
- `DELETE /delete/address/id/{id}`: Delete an address by ID.
  ***
  ## Usage
You can use a tool like POSTMAN or CURL to interact with the API endpoints to perform SWAGGER operations on employees and addresses.

Example Request (Create an Employee):

POST http://localhost:8080/employees
Content-Type: application/json
```json

{
    "firstName": "John",
    "lastName": "Doe",
    "address": {
        "street": "123 Main St",
        "city": "Springfield",
        "state": "IL",
        "zipcode": "12345"
    }
}
   

 ```
***
## Contributing
Contributions are welcome! If you find any issues or have suggestions for improvements, please create a GitHub issue or submit a pull request.
***



