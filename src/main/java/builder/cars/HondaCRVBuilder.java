package builder.cars;

import builder.CarBuilder;
import builder.Transmission;

public class HondaCRVBuilder extends CarBuilder {
    public void buildMark() {
        car.setMark("HondaCRV");
    }

    public void buildTransmission() {
        car.setTransmission(Transmission.AUTO);
    }

    public void buildMaxSpeed() {
        car.setMaxSpeed(240);
    }
}
