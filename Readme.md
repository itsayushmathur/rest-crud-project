## 🔧 `@Service` Annotation

The `@Service` annotation is a **specialized stereotype annotation** in Spring used to mark a class as a **service layer component**.

---

### 🎯 Purpose

- Indicates that the class **contains business logic**
- Allows Spring to detect and manage it as a **Spring Bean**
- Semantically indicates intent (vs. `@Component`)

---

### 🏷️ Key Characteristics

| Feature                  | Description                                                     |
|--------------------------|-----------------------------------------------------------------|
| Layer                    | Belongs to the **Service Layer** of the application             |
| Spring Component Scan    | Auto-detected during component scanning                         |
| Bean Management          | Registered as a Spring bean and available for dependency injection |
| Readability              | Improves **code readability and organization**                  |

---

### 🪜 When to Use

- When a class contains **business logic** (e.g., validation, processing)
- To **decouple** service logic from controllers and repositories
- For **reusability and testability** of logic across multiple controllers

---

### 🧱 Example Usage

```java
@Service
public class UserService {
    public List<User> getAllUsers() {
        // Business logic
    }
}
```

---

## 🛠️ `ObjectMapper` (Spring + Jackson Revision Notes)

`ObjectMapper` is a class provided by the **Jackson** library, commonly used in Spring Boot to **convert between Java objects and JSON**.

---

### 🎯 Purpose

- Serialize: Convert **Java object → JSON string**
- Deserialize: Convert **JSON string → Java object**
- Helps in reading/writing JSON data in REST APIs

---

### 📦 Class Info

| Detail              | Value                          |
|---------------------|---------------------------------|
| Class Name          | `com.fasterxml.jackson.databind.ObjectMapper` |
| Library             | Jackson (comes by default with Spring Boot) |
| Scope               | Can be used anywhere (Controller, Service, etc.) |

---

### 🔄 Common Use Cases

| Use Case                 | Method Example                               |
|--------------------------|----------------------------------------------|
| Java → JSON              | `writeValueAsString(object)`                 |
| JSON → Java              | `readValue(jsonString, Class.class)`         |
| JSON File → Java         | `readValue(new File("data.json"), Class.class)` |
| Pretty Print             | `writerWithDefaultPrettyPrinter().writeValueAsString(obj)` |

---

### 🧱 Example

```java
@Autowired
private ObjectMapper objectMapper;

String json = objectMapper.writeValueAsString(user);
User userObj = objectMapper.readValue(json, User.class);
```
---

## 🗂️ Spring Data JPA & JpaRepository 

Spring Data JPA is a part of the **Spring Data** family. It simplifies working with JPA (Java Persistence API) by **removing boilerplate code** for database operations.

---

### 📘 What is Spring Data JPA?

- Abstraction layer on top of **JPA + Hibernate**
- Automatically implements repository methods at runtime
- Integrates with **Spring Boot**, **Hibernate**, and **JPA Providers**

---

### 📦 Key Benefits

| Feature                        | Description                                                   |
|--------------------------------|---------------------------------------------------------------|
| No boilerplate                 | Eliminates need for common CRUD implementation                |
| Auto query generation          | Methods can be created by following naming conventions         |
| Pagination and sorting support| Built-in via interfaces like `PagingAndSortingRepository`      |
| JPQL/Native queries            | Supports `@Query`, `@NamedQuery`, and native SQL              |

---
