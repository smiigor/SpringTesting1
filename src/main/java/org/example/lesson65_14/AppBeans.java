package org.example.lesson65_14;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// This test App also corresponds to lesson 65.14
public class AppBeans {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigForUser.class);

        User user2 = (User) context.getBean("user", "Olga", 30);
        System.out.println(user2);
    }
}