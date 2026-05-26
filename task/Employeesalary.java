package day4and5;

import java.util.*;
import java.util.stream.*;

class Employee2 {

    int id;
    String name;
    int salary;

    Employee2(int id, String name, int salary) {

        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class Employeesalary {

    public static void main(String[] args) {

        List<Employee2> list = Arrays.asList(

                new Employee2(1,"Sai",50000),
                new Employee2(2,"Anu",90000),
                new Employee2(3,"prasad",70000)
        );

        list.stream()
            .filter(e -> e.salary > 40000)
            .forEach(e ->
                    System.out.println(
                            e.id + " " +
                            e.name + " " +
                            e.salary));
    }
}
