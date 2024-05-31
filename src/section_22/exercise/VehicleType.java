package exercise;

public enum VehicleType {
    CAR(5.0),
    MOTORCYCLE(3.0),
    BUS(10.0),
    TRUCK(15.0);

    private double price;

    VehicleType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
