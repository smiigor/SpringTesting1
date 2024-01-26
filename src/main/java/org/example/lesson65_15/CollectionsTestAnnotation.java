package org.example.lesson65_15;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Component("injectCollectionsAnnotation")
public class CollectionsTestAnnotation {
    @Value("#{myMap}")
    private Map<String, Object> myMap;
    @Value("#{myProps}")
    private Properties myProps;
    @Value("#{mySet}")
    private Set<String> mySet;
    @Value("#{myList}")
    private List<String> myList;

    public void displayInfo() {
        System.out.println("Map context:");
        for (Map.Entry<String, Object> entry : myMap.entrySet()) {
            System.out.println("key: " + entry.getKey() + " -> value: " + entry.getValue());
        }
        System.out.println("----------------------------");
        System.out.println("Properties context:");
        for (Map.Entry<Object, Object> entry : myProps.entrySet()) {
            System.out.println("key: " + entry.getKey() + " -> value: " + entry.getValue());
        }
        System.out.println("----------------------------");
        System.out.println("Set context:");
        for (Object object : mySet) {
            System.out.println("Value: " + object);
        }
        System.out.println("----------------------------");
        System.out.println("List context:");
        for (Object object : myList) {
            System.out.println("Value: " + object);
        }
    }
}