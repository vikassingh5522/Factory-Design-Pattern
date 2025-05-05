![image](https://github.com/user-attachments/assets/e7d399c0-adc9-403b-bb7c-4a88b22a6d39)

 Factory Design Pattern ![Screenshot 2025-05-05 163458](https://github.com/user-attachments/assets/cd1cb1d8-94c8-4a8a-a2f0-af9fc2ce42fb)



The **Factory Design Pattern** is a **creational design pattern** that provides an **interface for creating objects** in a superclass, but **allows subclasses to alter the type of objects that will be created**.

### 🔧 In Simple Words:

The **Factory Pattern** hides the logic of object creation and lets a method decide which class to instantiate.

---

### 🧠 Real-Life Analogy:

Imagine a **Pizza Store**. You just order “Pizza” without worrying about *how* it’s made. The store (factory) decides whether to give you Veg, Non-Veg, or Cheese Pizza.

---

### ✅ Key Points:

* Helps in creating objects **without exposing the creation logic**.
* Promotes **loose coupling**.
* Useful when the exact class of the object is **not known until runtime**.

---

### 🧑‍💻 Simple Example in Java:

```java
// Step 1: Create an interface
interface Shape {
    void draw();
}

// Step 2: Implement the interface with different classes
class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Drawing a Square");
    }
}

// Step 3: Create the Factory
class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) return null;
        if (shapeType.equalsIgnoreCase("CIRCLE")) return new Circle();
        if (shapeType.equalsIgnoreCase("SQUARE")) return new Square();
        return null;
    }
}

// Step 4: Use the Factory
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();  // Output: Drawing a Circle

        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();  // Output: Drawing a Square
    }
}



