package org.example.lesson65_10;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("application.properties")
public class Rabbit {

    @Value("${rabbit.greeting}")
    private String greeting;

    @Value("#{new org.example.lesson65.NameProvider().name}")
    private String name;

    @Value("#{new org.example.lesson65.NameProvider().name} ${rabbit.greeting}")
    private String combinedValue;
    @Value("#{'${rabbit.greeting} My name is ' + new org.example.lesson65.NameProvider().name }")
    private String combinedValue2;

    @Value("${rabbit.default-age}")
    private int defAge;
    @Value("#{${rabbit.default-age} + 5}")
    private int age;

    @Value("#{T (java.lang.Math).PI}")
    private double number;

    public void sayHello() {
        System.out.printf("%s My name is %s. I am %d year old.%n", greeting, name, age);
        System.out.printf("Default rabbit age is %d. I know that PI = %f.%n", defAge, number);
        System.out.printf("combined values: %s. %s ", combinedValue, combinedValue2);
    }
}