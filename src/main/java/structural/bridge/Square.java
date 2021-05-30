package structural.bridge;

public class Square implements Shape {
    @Override
    public void drawShape(Color color) {
        System.out.println("Draw square. " + color.getColor());
    }
}
