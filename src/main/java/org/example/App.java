package org.example;

import org.example.configuration.MyConfig;
import org.example.entity.Communication;
import org.example.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);
        List<Employee> allEmployees = communication.getAllEmployees();
        System.out.println(allEmployees);

        Employee emp = new Employee("Boss", "Level 5", "IT", 34000);
        emp.setId(9);
        communication.saveEmployee(emp);
    }
}
