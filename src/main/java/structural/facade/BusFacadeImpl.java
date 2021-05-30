package structural.facade;

public class BusFacadeImpl {

    private Vehicle vehicle;

    public BusFacadeImpl(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public void startUseVehicle() {
        vehicle.openDore();
        vehicle.sit();
        vehicle.activateEngine();
        vehicle.startMove();
    }


    public void stopUseVehicle() {
        vehicle.stopMove();
        vehicle.exit();
    }
}
