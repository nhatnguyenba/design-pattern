## Advantages of the Decorator Pattern

The Decorator pattern offers several key advantages:

### Flexibility and Extensibility

- **Dynamically add behavior:** Decorators allow you to add or remove functionality at runtime without modifying the
  core object.
- **Open-Closed Principle:** New decorators can be created without changing existing code, promoting code
  maintainability and stability.
- **Combine decorators:** Multiple decorators can be stacked to create complex behaviors, offering great flexibility.

### Reusability

- **Reusable decorators:** Decorators can be reused with different base objects as long as they share the same
  interface.
- **Avoids inheritance explosion:** Decorators provide an alternative to inheritance, preventing overly complex class
  hierarchies.

### Improved Code Structure

- **Separation of concerns:** Decorators help separate core functionality from additional responsibilities.
- **Better testability:** Decorators can be tested independently, making unit testing easier.

## Decorator Pattern Example: Coffee Shop

### Problem:

Create a flexible system to represent different types of coffee with various toppings and sizes.