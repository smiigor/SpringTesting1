package org.example.lesson65_16;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
    private static final String beanConfig1 = "spring/annotation65-16-1-app.xml";
    private static final String beanConfig2 = "spring/annotation65-16-2-app.xml";

    public static void main(String[] args) throws Exception {
        GenericXmlApplicationContext context1 = new GenericXmlApplicationContext(beanConfig1);
        GenericXmlApplicationContext context2 = new GenericXmlApplicationContext(beanConfig2);

        SimpleBean simpleBean1 = getBean("simpleBean1", context1);
        SimpleBean simpleBean2 = getBean("simpleBean2", context1);
        SimpleBean simpleBean3 = getBean("simpleBean3", context1);
        context1.close();
        System.out.println("After close of context: " + simpleBean1 + ", " + simpleBean2);
        // SimpleBean simpleBean21 = getBean("simpleBean2", context1);
        System.out.println("------------------");

        SimpleBeanWithInterface иуфт11 = getBeanWithInterface("simpleBean1", context2);
        SimpleBeanWithInterface иуфт12 = getBeanWithInterface("simpleBean2", context2);
        SimpleBeanWithInterface иуфт13 = getBeanWithInterface("simpleBean3", context2);
        context2.close();
    }

    private static SimpleBean getBean(String beanName, ApplicationContext context) {
        try {
            SimpleBean bean = (SimpleBean) context.getBean(beanName);
            System.out.println(bean);
            return bean;
        } catch (BeanCreationException e) {
            System.out.println("Create bean error");
            return null;
        }
    }

    private static SimpleBeanWithInterface getBeanWithInterface(String beanName, ApplicationContext context) {
        try {
            SimpleBeanWithInterface bean = (SimpleBeanWithInterface) context.getBean(beanName);
            System.out.println(bean);
            return bean;
        } catch (BeanCreationException e) {
            System.out.println("Error сreation bean");
            return null;
        }
    }
}
