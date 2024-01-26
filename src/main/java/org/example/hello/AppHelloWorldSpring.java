package org.example.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppHelloWorldSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/appcontext.xml");
        MessageRender render = context.getBean("render", MessageRender.class);
        render.render();
    }
}