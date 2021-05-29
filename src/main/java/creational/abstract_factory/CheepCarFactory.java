package creational.abstract_factory;

import creational.abstract_factory.engine.CarEngine;
import creational.abstract_factory.engine.DieselEngine;
import creational.abstract_factory.salon.BasicCarSalon;
import creational.abstract_factory.salon.CarSalon;
import creational.abstract_factory.transmission.CarTransmission;
import creational.abstract_factory.transmission.ManualTransmission;

public class CheepCarFactory implements CarFactory{
    @Override
    public CarTransmission installTransmission() {
        return new ManualTransmission();
    }

    @Override
    public CarEngine installEngine() {
        return new DieselEngine();
    }

    @Override
    public CarSalon installSalon() {
        return new BasicCarSalon();
    }
}
