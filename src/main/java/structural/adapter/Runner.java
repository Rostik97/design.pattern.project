package structural.adapter;

public class Runner {
    private Road road;

    public Runner(Road road){
        this.road = road;
    }

    public void runOnTheRoad() {
        road.run();
    }
}
