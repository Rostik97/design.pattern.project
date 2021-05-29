package creational.abstract_factory.salon;

import creational.abstract_factory.salon.CarSalon;

public class BasicCarSalon implements CarSalon {
    @Override
    public String installSalon() {
        return "Install basic cloth salon";
    }
}
