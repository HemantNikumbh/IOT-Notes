package shapep;

// FactoryProducer.java
public class FactoryProducer {
    public static AbstractFactory getFactory() {
        return new ShapeFactory();
    }
}

