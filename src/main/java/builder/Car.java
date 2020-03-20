package builder;

public class Car {
    public String mark;
    public Transmission transmission;
    public int maxSpeed;

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", transmission=" + transmission +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
