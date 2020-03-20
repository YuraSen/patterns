package builder;

public abstract class CarBuilder {
    public Car car;

    public void createCar() {
        car = new Car();
    }

    public abstract void buildMark();

    public abstract void buildTransmission();

    public abstract void buildMaxSpeed();

    Car getCar() {
        return car;
    }

}
