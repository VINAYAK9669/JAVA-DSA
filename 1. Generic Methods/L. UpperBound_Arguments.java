/**
 * Program Objective: This program demonstrates the use of a generic class
 *                    with an upper bound to hold objects of different shapes.
 *
 * Class Hierarchy:
 *   - Shape (Generic shape class with a displayInfo() method)
 *     - Circle (Subclass of Shape, representing a circle shape)
 *     - Rectangle (Subclass of Shape, representing a rectangle shape)
 *
 * Generic Class: Container<T extends Shape>
 *   - The Container class can hold objects of type T, where T is a subclass of Shape.
 *   - It provides a method to display information about the shape held in the container.
 */

// Shape class represents a generic shape.
class Shape {
    // Common properties and methods for all shapes
    // For simplicity, we'll assume that there's a method displayInfo() in the Shape class.
    public void displayInfo() {
        System.out.println("This is a generic shape.");
    }
}

// Circle class is a subclass of Shape and represents a circle shape.
class Circle extends Shape {
    // Properties and methods specific to circles
    // For simplicity, we'll assume that there's a method displayInfo() in the Circle class.
    @Override
    public void displayInfo() {
        System.out.println("This is a circle.");
    }
}

// Rectangle class is a subclass of Shape and represents a rectangle shape.
class Rectangle extends Shape {
    // Properties and methods specific to rectangles
    // For simplicity, we'll assume that there's a method displayInfo() in the Rectangle class.
    @Override
    public void displayInfo() {
        System.out.println("This is a rectangle.");
    }
}

// Container class is a generic class that can hold objects of different shapes.
// The generic type T is bounded to the Shape class, so it can hold Shape and its subclasses.
class Container<T extends Shape> {
    private T shape;

    // Constructor to initialize the Container with a shape object.
    public Container(T shape) {
        this.shape = shape;
    }

    // Method to display information about the shape held in the container.
    public void displayShapeInfo() {
        shape.displayInfo();
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Circle object and use it with the Container class.
        Circle circle = new Circle();
        Container<Circle> circleContainer = new Container<>(circle);
        circleContainer.displayShapeInfo(); // This will call the displayInfo() method of Circle class

        // Create a Rectangle object and use it with the Container class.
        Rectangle rectangle = new Rectangle();
        Container<Rectangle> rectangleContainer = new Container<>(rectangle);
        rectangleContainer.displayShapeInfo(); // This will call the displayInfo() method of Rectangle class

        // The following line will result in a compilation error since String is not a subclass of Shape:
        // Container<String> stringContainer = new Container<>("Hello");
        // Uncomment the above line to see the compilation error.
    }
}
