package org.example.lesson65;

import org.example.lesson65.annotation65.ComponentMy;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class BeanFactory {
    private static Map<String, Object> beansPool = new HashMap<>();

    public BeanFactory(String basePackage) {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        try {
            Enumeration<URL> resources = classLoader
                    .getResources(basePackage.replace('.', '/'));
            while (resources.hasMoreElements()) {
                File dir = new File(resources.nextElement().toURI());
                for (File file : dir.listFiles()) {
                    String fileName = file.getName();
                    if (fileName.endsWith("class")) {
                        String className = fileName.substring(0, fileName.lastIndexOf("."));
                        Class classObj = Class.forName(basePackage + "." + className);
                        if (classObj.isAnnotationPresent(ComponentMy.class)) {
                            Object obj = classObj.newInstance();
                            beansPool.put(className.toLowerCase(), obj);
                        }
                    }
                }
            }
        } catch (IOException | URISyntaxException | ClassNotFoundException |
                 InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public Object getBean(String beanName) {
        return beansPool.get(beanName.toLowerCase());
    }
}