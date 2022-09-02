package com.learning.spring.di;

import com.learning.spring.di.pojo.Employee;
import com.learning.spring.di.pojo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDIDemo {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("person.xml");
        System.out.println("Setter Injection");
        Person p1= (Person) context.getBean("person1");
        System.out.println(p1);
        System.out.println("Constructor Injection");
        Person p2= (Person) context.getBean("person2");
        System.out.println(p2);

        ApplicationContext context2 = new ClassPathXmlApplicationContext("employee.xml");
        System.out.println("Constructor Injection");
        Employee employee= (Employee) context2.getBean("employee");
        System.out.println(employee);








    }
}
