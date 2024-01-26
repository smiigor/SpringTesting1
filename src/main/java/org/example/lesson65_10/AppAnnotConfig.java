package org.example.lesson65_10;

import org.example.lesson65_10.Rabbit;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

// This test App corresponds to lesson 65.10
// https://www.youtube.com/watch?v=eAe_0bcEkq4&list=PL81zTpL449O1_1WD07XrmUcqzmeBoVHVG&index=11&t=265s
// Java - урок 65.10 (GenericXmlApplicationContext, AnnotationConfigApplicationContext, @ComponentScan)
// Здесь конфигурация задается в xml-файле.
public class AppAnnotConfig {
    private static final String rabbitConfig = "spring/annotation65-10.xml";

    private static final String rabbitConfig2 = "classpath:spring/annotation65-10.xml";
    // так тоже можно, т.к. classpath указывает на "target\classes". Но вроде как ни к чему.

    public static void main(String[] args) {
        demoGetBean1();
        demoGetBean2();
    }

    private static void demoGetBean1() {
        ApplicationContext context = new ClassPathXmlApplicationContext(rabbitConfig);

        Rabbit rabbit = (Rabbit) context.getBean("rabbit");
        rabbit.sayHello();
    }

    private static void demoGetBean2() {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load(rabbitConfig);
        context.refresh();

        Rabbit rabbit = (Rabbit) context.getBean("rabbit");
        rabbit.sayHello();
    }
}
