package shapep;

// ShapeFactory.java
public class ShapeFactory implements AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if ("CIRCLE".equalsIgnoreCase(shapeType)) {
            return new Circle();
        } else if ("RECTANGLE".equalsIgnoreCase(shapeType)) {
            return new Rectangle();
        }
        return null;
    }
}
