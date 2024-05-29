package com.ambiguity_problem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        System.out.println( "Hello World! App2" );
        ApplicationContext context = new ClassPathXmlApplicationContext("additionconfig.xml");
        Addition add = (Addition) context.getBean("add");

//        System.out.println(add);
        add.doAdd();
    }
}
