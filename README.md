# Portofolio Task App

**Status:** WIP — basic CRUD API implemented with Spring Boot and Spring Data JPA.

Tech: Java, Spring Boot, Spring Data JPA, H2 (in-memory)

## Quick start
1. Build: mvn clean package
2. Run: mvn spring-boot:run
3. Create task:
   curl -X POST -H "Content-Type: application/json" -d '{"title":"Test","status":"todo"}' http://localhost:8080/api/tasks

## What I implemented
- Repository, Service, Controller layers
- JPA entity Task with H2 config
- Endpoints: GET/POST/PUT/DELETE, filter by status

## TODO
- Add authentication
- Add DTOs and validation
- Add unit & integration tests

## Notes
- This repo is a work in progress. See `application-example.properties` for safe local config.

Well I got this from AI and it's Pretty much not done so i'm not sure it's going to work or not yet.
But I will keep updating it.

This is also my very first try with Spring Boot and it's surprisingly fun!
