package ll;

import java.util.Iterator;
import java.util.LinkedList;

public class A {

    public static void main(String[] args) {
        // Create some Employee objects

        Employee emp1 = new Employee("John", "Doe", 1);
        Employee emp2 = new Employee("Jane", "Smith", 2);
        Employee emp3 = new Employee("Michael", "Johnson", 3);

       LinkedList<Employee> emplDetails = new LinkedList<Employee>();

        emplDetails.add(emp1);
        emplDetails.add(emp2);
        emplDetails.add(emp3);

        Iterator<Employee> it = emplDetails.iterator();
        while (it.hasNext()) {
            Employee employee = it.next();
            System.out.println(employee);
        }

        for(Employee employee: emplDetails){
            System.out.println(employee.getFirstName());
            System.out.println(employee.getLastName());
            System.out.println(employee.getId());
        }



    }
}

