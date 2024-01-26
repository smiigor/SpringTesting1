package org.example.lesson65;

public class AppOwnBeanFactory {
    public static void main(String[] args) {
        BeanFactory factory = new BeanFactory("org.example.lesson65");
        Tiger tiger1 = (Tiger) factory.getBean("Tiger");
        Tiger tiger2 = (Tiger) factory.getBean("tiger");
        System.out.printf("tiger1: %s, tiger2: %s.%n", tiger1, tiger2);

        Animal animal3 = (Tiger) factory.getBean("tiger");
        animal3.setName("Tiger 3");
        animal3.setId(3);
        Animal fox = (Fox) factory.getBean("fox");
        fox.setName("my fox");
        fox.setId(8);
        System.out.printf("amimals: %s, %s", animal3, fox);
    }
}