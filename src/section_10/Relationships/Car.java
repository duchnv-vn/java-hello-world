package Relationships;

public class Car extends Verhicle {// is-a relationship (Car is a Verhicle)
    private Engine engine; // has-a relationship (Car has an engine)

    public Car(Engine engine) {
        this.engine = engine;

    }
}
