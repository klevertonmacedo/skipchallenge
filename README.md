# Skipchallenge
This provide API microservices for a product delivery application. It contains:

  - Docker for MySQL and RabbitMQ;
  - One microservice for authentiation;
  - One microservice for creating users accounts;
  - One microservice for creating restaurants;
  - One microservice for creating products for the restaurants;
  - One microservice for order products;

# Testing the microservices
In order to test the microservices, first it's necessary to start the docker container. Do as follow to start.
```sh
$ cd docker
$ docker docker-compose up
```
The project was developed using TDD, which means there are unit tests for all microservices. Feel free to test any one of them.

| Microservice | Module/Java Test Class |
| ------ | ------ |
| authentiation | **auth**/AuthRestTest.java |
| creating users accounts | **accounts**/AccountRestTest.java |
| creating restaurants | **restaurants**/RestaurantRestTest.java |
| creating products for the restaurants | **products**/ProductsRestTest.java |
| order products | **orders**/OrdersRestTest.java |

# Important
  - The RabbitMQ is not implemented yet;
  - Because of the time, the restaurant authentication part uses the password in the restaurant table;
  - Some validations were not implemented, but all of them were marked as TODO;