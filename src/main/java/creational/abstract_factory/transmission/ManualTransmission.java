package creational.abstract_factory.transmission;

public class ManualTransmission implements CarTransmission{
    @Override
    public String installTransmission() {
        return "Install mechanical transmission";
    }
}
