package behavioral.observer;

import java.util.List;

public class Director implements Observer{
    @Override
    public void report(List<Student> students) {
        System.out.println("------------------");
        System.out.println("The list of students changed: ");
        students.forEach(System.out::println);
        System.out.println("------------------");

    }
}
