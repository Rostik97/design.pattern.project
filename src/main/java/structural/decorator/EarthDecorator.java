package structural.decorator;

public class EarthDecorator implements Planet {

    private Planet planet;

    public EarthDecorator(Planet planet) {
        this.planet = planet;
    }

    @Override
    public String getSize() {
        return planet.getSize() + " km";
    }

    @Override
    public String getArea() {
        return planet.getArea() + " km";
    }

    public String getSatelliteCount() {
        return "1";
    }
}
