package behavioral.strategy;

public class Eating implements Activity{
    @Override
    public void doSomething() {
        System.out.println("Time to take a break for eating....");
    }
}
