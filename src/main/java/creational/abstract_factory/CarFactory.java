package creational.abstract_factory;

import creational.abstract_factory.engine.CarEngine;
import creational.abstract_factory.salon.CarSalon;
import creational.abstract_factory.transmission.CarTransmission;

public interface CarFactory {
    CarTransmission installTransmission();
    CarEngine installEngine();
    CarSalon installSalon();
}
