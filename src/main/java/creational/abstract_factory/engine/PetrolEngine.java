package creational.abstract_factory.engine;

public class PetrolEngine implements CarEngine{
    @Override
    public String installCarEngine() {
        return "Install petrol engine";
    }
}
