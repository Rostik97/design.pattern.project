package creational.abstract_factory.transmission;

public class AutomaticTransmission implements CarTransmission{
    @Override
    public String installTransmission() {
        return "Install automatic transmission";
    }
}
