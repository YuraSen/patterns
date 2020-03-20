package builder;

public class AlphaRomeoBuilder extends CarBuilder {
    void buildMark() {
        car.setMark("AlphaRomeo");
    }

    void buildTransmission() {
        car.setTransmission(Transmission.MANUAL);
    }

    void buildMaxSpeed() {
        car.setMaxSpeed(320);
    }
}
