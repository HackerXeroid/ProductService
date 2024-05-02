# ProductService

This is a simple product service application built with Java and Spring Boot. The application provides basic CRUD operations for managing products and their categories.

## Technologies Used

- Java
- Spring Boot
- Maven

## Features

The application provides the following features:

- Get a product by its ID
- Get all products
- Create a new product

## Project Structure

The project follows a typical Spring Boot project structure. Here are some of the key files and directories:

- `src/main/java/com/xeroid/productservice/controllers/ProductController.java`: This is the main controller class that handles HTTP requests.
- `src/main/java/com/xeroid/productservice/services/ProductService.java`: This is the service interface that defines the methods for product operations.
- `src/main/java/com/xeroid/productservice/services/SelfProductService.java`: This is the implementation of the ProductService interface.
- `src/main/java/com/xeroid/productservice/exceptionhandlers/GlobalExceptionHandler.java`: This class handles exceptions globally.

## Setup and Running

To run this project, you need to have Java and Maven installed on your machine.

1. Clone the repository
2. Navigate to the project directory
3. Run `mvn clean install` to build the project
4. Run `mvn spring-boot:run` to start the application

The application will start running at `http://localhost:8080`.

## API Endpoints

- `GET /products/{id}`: Get a product by its ID
- `GET /products`: Get all products
- `POST /products`: Create a new product

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License

[MIT](https://choosealicense.com/licenses/mit/)
