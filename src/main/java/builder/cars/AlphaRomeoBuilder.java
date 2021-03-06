package builder.cars;

import builder.CarBuilder;
import builder.Transmission;

public class AlphaRomeoBuilder extends CarBuilder {
    public void buildMark() {
        car.setMark("AlphaRomeo");
    }

    public void buildTransmission() {
        car.setTransmission(Transmission.MANUAL);
    }

    public void buildMaxSpeed() {
        car.setMaxSpeed(320);
    }
}
