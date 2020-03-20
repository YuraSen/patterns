package builder.cars;

import builder.CarBuilder;
import builder.Transmission;

public class UAZ extends CarBuilder {
    public void buildMark() {
        car.setMark("UAZ");
    }

    public void buildTransmission() {
        car.setTransmission(Transmission.MANUAL);
    }

    public void buildMaxSpeed() {
        car.setMaxSpeed(120);
    }
}
