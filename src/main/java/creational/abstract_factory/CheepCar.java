package creational.abstract_factory;

public class CheepCar extends Car{

    public CheepCar(CarFactory carFactory) {
        type = "Cheep";
        carEngine = carFactory.installEngine();
        carSalon = carFactory.installSalon();
        carTransmission = carFactory.installTransmission();
    }
}
