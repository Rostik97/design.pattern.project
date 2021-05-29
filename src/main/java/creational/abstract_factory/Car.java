package creational.abstract_factory;

import creational.abstract_factory.engine.CarEngine;
import creational.abstract_factory.salon.CarSalon;
import creational.abstract_factory.transmission.CarTransmission;


public abstract class Car {

    protected String type;
    protected CarEngine carEngine;
    protected CarSalon carSalon;
    protected CarTransmission carTransmission;

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", carEngine=" + carEngine.installCarEngine() +
                ", carSalon=" + carSalon.installSalon() +
                ", carTransmission=" + carTransmission.installTransmission() +
                '}';
    }
}
