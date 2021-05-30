package structural.decorator;

public class Earth implements Planet{

    @Override
    public String getSize() {
        return "6371";
    }

    @Override
    public String getArea() {
        return "510100000";
    }
}
