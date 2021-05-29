package creational.abstract_factory;

import creational.abstract_factory.engine.CarEngine;
import creational.abstract_factory.engine.PetrolEngine;
import creational.abstract_factory.salon.CarSalon;
import creational.abstract_factory.salon.LeatherCarSalon;
import creational.abstract_factory.transmission.AutomaticTransmission;
import creational.abstract_factory.transmission.CarTransmission;

public class ExpensiveCarFactory implements CarFactory{
    @Override
    public CarTransmission installTransmission() {
        return new AutomaticTransmission();
    }

    @Override
    public CarEngine installEngine() {
        return new PetrolEngine();
    }

    @Override
    public CarSalon installSalon() {
        return new LeatherCarSalon();
    }
}
