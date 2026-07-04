# Redis Homework

## Project Description

This project demonstrates how to use Redis as an in-memory database with Java using the Jedis client library.

The application:

- Connects to a local Redis server.
- Creates 10,000 Person objects.
- Stores each Person object in Redis.
- Reads sample records from Redis to verify successful insertion.

## Technologies Used

- Java 21
- Maven
- Redis
- Jedis
- Docker
- RedisInsight

## How to Run

### 1. Start Redis

```bash
docker run -d --name redis-server -p 6379:6379 redis:latest
```

### 2. Build the project

```bash
mvn clean install
```

### 3. Run the application

```bash
mvn exec:java -Dexec.mainClass="com.i2i.redis.App"
```

## Expected Output

- Redis connection successful.
- 10,000 Person objects inserted into Redis.
- Sample records displayed in the console.