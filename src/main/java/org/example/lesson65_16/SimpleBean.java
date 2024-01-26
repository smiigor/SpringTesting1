package org.example.lesson65_16;

public class SimpleBean {
    private static final String DEFAULT_NAME = "Boris";
    private String name;
    private int age = Integer.MIN_VALUE;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SimpleBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void init() {
        System.out.println("Initialization bean");
        if (name == null) {
            System.out.println("Set default name");
            name = DEFAULT_NAME;
        }
        if (age == Integer.MIN_VALUE) {
            System.out.println("Property 'age' must be set " + SimpleBean.class);
            throw new IllegalArgumentException("Property 'age' must be set. " + SimpleBean.class);
        }
    }

    public void myDestroy() {
        System.out.println("In myDestroy");
    }
}
