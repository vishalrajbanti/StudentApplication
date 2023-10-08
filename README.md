# Student Application

## Table of Contents
- Overview
- Technologies Used
- Data Models
- Project Structure
- Setup
- Endpoints
- Acknowledgments
- Support
### Overview
This Java Spring Boot portal is designed to handle various types of relationships (one-to-one, one-to-many, many-to-one, and many-to-many) among data models and provide CRUD (Create, Read, Update, Delete) operations for each model. The portal includes models for Student, Laptop, Course, Book, and Address, along with their relationships.

### Technologies Used
- Framework: Spring Boot
- Language: Java
- Database: MySQL (You can replace it with your preferred - database)
- Dependency Management: Maven
### Data Models
- Student: Represents a student with attributes like ID, name, age, phone number, branch, and department. It has one-to-one, one-to-many, and many-to-many relationships with other models.
- Laptop: Represents a laptop with attributes like ID, name, brand, and price. It has a one-to-one relationship with the Student model.
- Course: Represents a course with attributes like ID, title, description, and duration. It has a many-to-many relationship with the Student model.
- Book: Represents a book with attributes like ID, title, author, description, and price. It has a many-to-one relationship with the Student model.
- Address: Represents an address with attributes like address ID, landmark, zipcode, district, state, and country.
### Project Structure
The project structure is organized as follows:

- src/main/java: Contains the Java source code.
- com.example.portal.controller: Contains controller classes for handling HTTP requests.
- com.geekster.model: Contains entity classes for the data models.
- com.geekster.repository: Contains repository interfaces for database operations.
- com.geekster.service: Contains service classes for business logic.
- src/main/resources: Contains application configuration files, including application.properties or application.yml.
- src/test: Contains test classes.
- Setup
    Clone the repository to your local machine:

 - bash
- Copy code
- git clone 
  - https://github.com/vishalrajbanti/StudentApplication.git
- Open the project in your chosen IDE.

- Configure your database connection in the application.properties or application.yml file.

- Run the Spring Boot application.

### Endpoints
Here are the main endpoints for each model:

#### Student:

- POST /students: Create a new student.
- GET /students/{id}: Retrieve a student by ID.
- GET /students: Retrieve all students.
- PUT /students/{id}: Update a student by ID.
- DELETE /students/{id}: Delete a student by ID.
#### Laptop:

- POST /laptops: Create a new laptop.
- GET /laptops/{id}: Retrieve a laptop by ID.
- GET /laptops: Retrieve all laptops.
- PUT /laptops/{id}: Update a laptop by ID.
- DELETE /laptops/{id}: Delete a laptop by ID.
#### Course:

- POST /courses: Create a new course.
- GET /courses/{id}: Retrieve a course by ID.
- GET /courses: Retrieve all courses.
- PUT /courses/{id}: Update a course by ID.
- DELETE /courses/{id}: Delete a course by ID.
#### Book:

- POST /books: Create a new book.
- GET /books/{id}: Retrieve a book by ID.
- GET /books: Retrieve all books.
- PUT /books/{id}: Update a book by ID.
- DELETE /books/{id}: Delete a book by ID.
#### Address:

- POST /addresses: Create a new address.
- GET /addresses/{id}: Retrieve an address by ID.
- GET /addresses: Retrieve all addresses.
- PUT /addresses/{id}: Update an address by ID.
- DELETE /addresses/{id}: Delete an address by ID.



## Project Summary
- This Student Application is built using Spring Boot and Java.
- It allows users to perform CRUD operations on student,book,laptop,address and course entities.
- The project follows a structured architecture with controllers, services, and repositories.
- Data is stored in a MySQL database with appropriate relationships.


## Acknowledgments

We would like to express our gratitude to the following individuals and projects for their contributions and support to the Student Application :

- **[Vishal Raj]**: Lead developer and project coordinator.
- **[Mainak Ghosh]**: Contributor to the project, helping with [SpringBoot to complete this project].
- **[maven]**: We utilized [maven] for [dependencies] in our project.
- **Stack Overflow Community**: For their invaluable assistance in resolving technical challenges.
- **Spring Framework**: For providing a robust and efficient platform for building our application.


We appreciate the  effort and support that made this project possible.



## Support

For support, email vishalrajbanti@gmail.com.

## thank you.





