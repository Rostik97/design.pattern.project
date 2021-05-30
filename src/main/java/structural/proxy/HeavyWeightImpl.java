package structural.proxy;

public class HeavyWeightImpl implements HeavyWeightObj{

    public HeavyWeightImpl(){
        System.out.println("Init heavy object....");
    }

    @Override
    public void processOperation() {
        System.out.println("Start operation...");
    }


}
