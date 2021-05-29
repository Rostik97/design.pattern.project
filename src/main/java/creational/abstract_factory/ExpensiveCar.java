package creational.abstract_factory;

public class ExpensiveCar extends Car{
    public ExpensiveCar(CarFactory carFactory) {
        type = "Expensive";
        carEngine = carFactory.installEngine();
        carSalon = carFactory.installSalon();
        carTransmission = carFactory.installTransmission();
    }
}
