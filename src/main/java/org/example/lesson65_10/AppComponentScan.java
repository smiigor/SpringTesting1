package org.example.lesson65_10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

// This test App also corresponds to lesson 65.10
// Java - урок 65.10 (GenericXmlApplicationContext, AnnotationConfigApplicationContext, @ComponentScan)
@ComponentScan
public class AppComponentScan {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppComponentScan.class);
        Rabbit rabbit = (Rabbit) context.getBean("rabbit");
        rabbit.sayHello();
    }
}