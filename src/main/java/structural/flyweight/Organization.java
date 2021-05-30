package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Organization {

    private List<Employee> employeeList;

    public String recruit(Employee employee) {
        if (employeeList == null) {
            employeeList = new ArrayList<>();
        }
        if (employeeList.contains(employee)){
            return "Данный сотрудник уже принят на работу";
        } else {
            employeeList.add(employee);
            return "Сотрудник принят на работу";
        }
    }

    public Employee getEmployee(Employee person){
        return employeeList.stream()
                .filter(employee -> employee.equals(person))
                .findAny()
                .orElse(null);
    }
}
