package com.kushnirmark.spring.rest;

import com.kushnirmark.spring.rest.configuration.MyConfig;
import com.kushnirmark.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {//создаем AnnotationContext с помощью JAVA
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);

//        //Выводим всех работников
//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

//        //Выводим выбранного работника
//        Employee employee = communication.getEmployee(1);
//        System.out.println(employee);


//        //добавляем нового сотрудника в БД
//        Employee emp = new Employee("Sveta","Petrova","IT",1300);
//        emp.setId(8);
//        communication.saveEmployee(emp);


        //Удаляем сотрудника из БД
        communication.deleteEmployee(8);
    }
}
