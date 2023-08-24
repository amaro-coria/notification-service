# Notification Service

## Overview

Notification Service is a backend service built with Spring Boot, designed to handle various types of notifications such as email, SMS, and push notifications.

## Features

- Support for multiple notification channels (Email, SMS, Push)
- Scalable and extensible architecture
- Dockerized for easy deployment

## Prerequisites

- Java 11+
- Maven
- Docker (optional)

## Installation

### Using Maven

1. Clone the repository:

    ```bash
    git clone https://github.com/amaro-coria/notification-service.git
    ```

2. Navigate to the project directory:

    ```bash
    cd notification-service
    ```

3. Build the project:

    ```bash
    mvn clean install
    ```

4. Run the application:

    ```bash
    mvn spring-boot:run
    ```

### Using Docker

1. Build the Docker image:

    ```bash
    docker build -t notification-service .
    ```

2. Run the Docker container:

    ```bash
    docker run -p 8080:8080 notification-service
    ```

## Usage

The service exposes RESTful APIs for sending notifications. Here's an example API call to send an email:

```bash
curl -X POST http://localhost:8080/sendEmail -d '{"to":"example@email.com", "subject":"Hello", "body":"World"}'
