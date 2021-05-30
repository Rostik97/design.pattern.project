package structural.proxy;

public class HeavyWeightProxy implements HeavyWeightObj{

    private HeavyWeightObj heavyWeightObj;

    @Override
    public void processOperation() {
        if (heavyWeightObj == null) {
            heavyWeightObj = new HeavyWeightImpl();
        }
        heavyWeightObj.processOperation();
    }
}
