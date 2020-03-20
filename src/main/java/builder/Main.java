package builder;

import builder.cars.AlphaRomeoBuilder;
import builder.cars.HondaCRVBuilder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new AlphaRomeoBuilder());
        Car car = director.BuildCar();

        director.setBuilder(new HondaCRVBuilder());
        Car honda = director.BuildCar();

        System.out.println(car);
        System.out.println(honda);
    }

}
