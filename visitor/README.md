### What is the Visitor Pattern?

The Visitor pattern is a behavioral design pattern that allows you to perform operations on elements of an object
structure without changing the classes of those elements. It's particularly useful when you need to add new operations
to an existing object structure without modifying the structure itself.

### Key Components:

- **Visitor:** An interface or abstract class that declares a visit method for each type of element in the object
  structure.
- **ConcreteVisitor:** Implements the Visitor interface and provides specific implementations for each visit method.
- **Element:** An interface or abstract class that declares an accept method.
- **ConcreteElement:** Implements the Element interface and defines the accept method to accept a visitor.

### How it works:

1. A visitor object is created.
2. The visitor is passed to the elements in the object structure via their accept method.
3. The accept method calls the appropriate visit method on the visitor based on the element's type.
4. The visitor performs the desired operation on the element.

### Example: Shape Visitor

Let's consider a simple example where we have different shapes (Circle, Rectangle, Triangle) and we want to calculate
their area and perimeter.