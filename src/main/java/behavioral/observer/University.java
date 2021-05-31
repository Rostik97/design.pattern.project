package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class University {
    private Observer observer;
    private final List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        notifyObservers();
    }
    public void removeStudent(Student student) {
        students.remove(student);
        notifyObservers();
    }
    public void setObserver(Observer observer){
        this.observer = observer;
    }
    public void removeObserver(Observer observer) {
        this.observer = null;
    }

    public void notifyObservers(){
        observer.report(students);
    }
}
