package structural.facade;

public class Bus implements Vehicle {
    @Override
    public void openDore() {
        System.out.println("Open door");
    }

    @Override
    public void sit() {
        System.out.println("Sit inside");
    }

    @Override
    public void activateEngine() {
        System.out.println("Activate engine");
    }

    @Override
    public void startMove() {
        System.out.println("Start moving");
    }

    @Override
    public void stopMove() {
        System.out.println("Stop moving");
    }

    @Override
    public void exit() {
        System.out.println("Exit outside");
    }
}
