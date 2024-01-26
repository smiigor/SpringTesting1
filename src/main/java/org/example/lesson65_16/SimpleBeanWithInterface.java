package org.example.lesson65_16;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SimpleBeanWithInterface implements InitializingBean, DisposableBean, BeanNameAware {
    private final static String DEFAULT_NAME = "Boris";
    private String name;
    private int age = Integer.MIN_VALUE;
    private String beanName;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SimpleBeanWithInterface{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet for bean");
        if (name == null) {
            System.out.println("Use default name.");
            name = DEFAULT_NAME;
        }
        if (age == Integer.MIN_VALUE) {
            System.out.println("'Age' must be set " + SimpleBean.class);
            throw new IllegalArgumentException("Age is not set" + SimpleBean.class);
        }
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Inside destroy for " + name);
    }

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
        System.out.println("beanName: " + beanName);
    }
}
