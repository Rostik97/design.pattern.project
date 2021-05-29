package creational.prototype;

public class PrototypeEmployee implements Cloneable {

    private String name;
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public PrototypeEmployee clone() throws CloneNotSupportedException {
        System.out.println("Cloning employee object...");
        return (PrototypeEmployee) super.clone();
    }

    @Override
    public String toString() {
        return "PrototypeEmployee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
