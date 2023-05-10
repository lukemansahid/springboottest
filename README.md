# Spring Boot CRUD Operations
This is a sample Spring Boot project that demonstrates basic CRUD (Create, Read, Update, Delete) operations using a RESTful API.

The project uses Spring Boot and Spring Data JPA to create a simple API that allows users to manage a list of items. The items are stored in a database and can be retrieved, created, updated, and deleted using HTTP requests.

## Prerequisites
***

Before you begin, make sure you have the following:

+ Java 8 or later installed
+ Maven installed
+ MySQL installed and running

## Getting Started

To get started with the project, follow these steps:

1. Clone the repository to your local machine:
 ```
 
 ```
2. Navigate to the project directory:
```
 
 ```
3. Update the MySQL configuration in the application.properties file with your MySQL username and password:
```
 
 ```
4. Run the project using Maven:
```
 
 ```
5. The project will start up and be available at http://localhost:8082. Based on my server port number.

## Usage

The following endpoints are available:

### Get all tasks
```
GET /api/tasks
```
This will retrieve a list of all items in the database.

### Get a specific task
```
GET /api/tasks/{id}
```
Replace {id} with the ID of the task you want to retrieve. This will retrieve a specific item from the database.

### Create a new item
```
POST /api/save
```
To create a new item, send a JSON payload in the following format:
```
{
    "id": " ",
    "description": "Item description"
}

```
### Update an existing item
```
PUT /api/update
```
Replace {id} with the ID of the item you want to update. To update an existing item, send a JSON payload in the following format:
```
{
    "id": "1",
    "description": "Updated item description"
}
```
### Delete an item
```
DELETE /api/tasks/{id}/delete
```
Replace {id} with the ID of the item you want to delete. This will remove the item from the database.

# Conclusion

This project provides a simple example of how to use Spring Boot and Spring Data JPA to create a RESTful API that performs basic CRUD operations. Feel free to use this project as a starting point for your own projects.
