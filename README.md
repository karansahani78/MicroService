
# Microservices Practice Project

This project is a practice exercise to demonstrate the implementation of microservices architecture using Spring Boot. It involves three distinct services: **User Service**, **Rating Service**, and **Hotel Service**. The services are interconnected and communicate using REST APIs.

## Table of Contents

- [Overview](#overview)
- [Services](#services)
  - [User Service](#user-service)
  - [Rating Service](#rating-service)
  - [Hotel Service](#hotel-service)
- [Technologies](#technologies)
- [Setup Instructions](#setup-instructions)
- [Endpoints](#endpoints)
  - [User Service Endpoints](#user-service-endpoints)
  - [Rating Service Endpoints](#rating-service-endpoints)
  - [Hotel Service Endpoints](#hotel-service-endpoints)
- [Contributing](#contributing)

## Overview

This project demonstrates how to create microservices using Spring Boot. Each service is designed to handle a specific domain, with a focus on **User**, **Rating**, and **Hotel**. The services can register and discover each other using Eureka, and Spring Cloud Gateway is used for routing API calls.

## Services

### User Service
- Manages users and allows operations such as creating, fetching, and deleting users.
- Fetches associated hotel and rating information for users.

### Rating Service
- Manages ratings of hotels by users.
- Allows operations like creating ratings and fetching them by ID.

### Hotel Service
- Manages hotel information.
- Supports fetching hotel details, which can be used by the User and Rating services.

## Technologies

- **Java 17**
- **Spring Boot**
- **Spring Cloud Gateway** (API Gateway)
- **Spring Cloud Netflix Eureka** (Service Discovery)
- **MongoDB** (Database for storing user and rating information)
- **H2 Database** (In-memory database for testing)

## Setup Instructions

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/microservices-practice.git
   ```

2. Navigate to the project directory:
   ```bash
   cd microservices-practice
   ```

3. Run each service individually:
   - User Service: `mvn spring-boot:run` (in `user-service` directory)
   - Rating Service: `mvn spring-boot:run` (in `rating-service` directory)
   - Hotel Service: `mvn spring-boot:run` (in `hotel-service` directory)

4. Ensure that MongoDB is running locally for the services that require it:
   ```bash
   mongod --dbpath /path-to-your-data
   ```

5. Access Eureka Dashboard (for service discovery):
   - URL: `http://localhost:8761/`

## Endpoints

### User Service Endpoints
- **GET** `/users/{userId}`: Get user by ID (with associated hotel and rating info).
- **POST** `/users`: Create a new user.
- **DELETE** `/users/{userId}`: Delete user by ID.

### Rating Service Endpoints
- **POST** `/ratings`: Create a new rating.
- **GET** `/ratings/{ratingId}`: Get rating by ID.

### Hotel Service Endpoints
- **GET** `/hotels/{hotelId}`: Get hotel by ID.

## Contributing

Feel free to fork the repository and make contributions. This is a practice project designed for learning purposes.
