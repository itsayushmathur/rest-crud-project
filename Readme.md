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