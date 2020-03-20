package builder;

public class HondaCRVBuilder extends CarBuilder {
    void buildMark() {
        car.setMark("HondaCRV");
    }

    void buildTransmission() {
        car.setTransmission(Transmission.AUTO);
    }

    void buildMaxSpeed() {
        car.setMaxSpeed(240);
    }
}
