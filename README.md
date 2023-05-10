# Spring Boot CRUD Operations
This is a sample Spring Boot project that demonstrates basic CRUD (Create, Read, Update, Delete) operations using a RESTful API.

The project uses Spring Boot and Spring Data JPA to create a simple API that allows users to manage a list of items. The items are stored in a database and can be retrieved, created, updated, and deleted using HTTP requests.

## Prerequisites
***

Before you can start using the project, you need to make sure you have the following installed on your machine:

+ Java 8 or later installed
+ Maven installed
+ MySQL installed and running

## Getting Started

To get started with the project, follow these steps:

1. To get started with the project, you need to first clone the repository to your local machine. You can do this by running the following command:
 ```
 git clone https://github.com/lukemansahid/springboottest
 ```
2. After cloning the repository, navigate to the project directory using the command line:
```
 cd springboottest
 ```
3. Once you're in the project directory, you need to update the MySQL configuration in the application.properties file with your MySQL username and password. You can do this by opening the application.properties file in a text editor and updating the following lines:
For this project I use database hosted on heroku.
```
spring.datasource.url= <your-local database>
spring.datasource.username=<your-username>
spring.datasource.password=<your-password>
 ```
 Replace <your-username> and <your-password> with your MySQL username and password. 
 And <your-local database> with your local database server
4. Next, you can run the project using Maven by running the following command: 
```
 mvn spring-boot:run
 ```
5. Once the project is running, it will start up and be available at http://localhost:8082. Based on my server port number configured in the application.properties file.

## Usage

 The Spring Boot CRUD Operations project provides a RESTful API with the following endpoints:

### Get all tasks
```
GET /api/tasks
```
 To retrieve a list of all items in the database, send a **GET** request to /api/tasks.
 This will return a JSON array of all items in the database.

### Get a specific task
 To retrieve a specific item from the database, send a **GET** request to /api/task/{id}.
 Replace {id} with the ID of the item you want to retrieve.
```
GET /api/tasks/{id}
```
This will return a **JSON** object representing the item.

### Create a new item
 
 To create a new item, send a **POST** request to /api/save  
```
POST /api/save
```
Note that the ID is auto-generated. Send a **JSON** payload in the following format:
```
{
    "id": null,
    "description": "Item description"
}
The server will create a new item in the database and return a JSON object representing the new item.
```
### Update an existing item
 To update an existing item, send a **PUT** request or **POST** request to api/save. Hence JPA is capable of performing **PUT** and **POST** request with the inbuilt save method when updating a record  
```
PUT /api/update
```
Replace {id} with the **ID** of the item you want to update. To update an existing item, send a **JSON** payload in the following format:
```
{
    "id": "1",
    "description": "Updated item description"
}
```
 The server will update the item in the database and return a JSON object representing the updated item.
### Delete an item
 To delete an item from the database, send a **DELETE** request to /api/tasks/{id}/delete.
Replace {id} with the ID of the item you want to delete.
```
DELETE /api/tasks/{id}/delete
```
The server will delete the item from the database and return a HTTP status code of 204 (No Content).

# Conclusion

This project provides a simple example of how to use Spring Boot and Spring Data JPA to create a RESTful API that performs basic CRUD operations. Feel free to use this project as a starting point for your own projects.
