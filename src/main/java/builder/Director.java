package builder;

public class Director {
    CarBuilder builder;
    void setBuilder(CarBuilder b){builder =b;}

    Car BuildCar(){
        builder.createCar();
        builder.buildMark();
        builder.buildTransmission();
        builder.buildMaxSpeed();
        Car car = builder.getCar();
        return car;
    }
}
