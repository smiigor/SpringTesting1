package org.example.penetration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "spring/penetrationcontext.xml");
        Car car = (Car) context.getBean("car");
        System.out.printf("model: %s, age = %d%n", car.getCarModel(), car.getCarAge());
        System.out.println(car.getDeviceModel());
    }
}