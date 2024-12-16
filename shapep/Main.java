package shapep;

// Main.java
public class Main {
    public static void main(String[] args) {
        // Get Shape Factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory();

        // Get a Circle and call draw method
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        // Get a Rectangle and call draw method
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
    }
}

