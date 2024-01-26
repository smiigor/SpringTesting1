package org.example.lesson65;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionsTestXml {
    private Map<String, Object> myMap;
    private Properties myProps;
    private Set<String> mySet;
    private List<String> myList;

    public void setMyMap(Map<String, Object> myMap) {
        this.myMap = myMap;
    }

    public void setMyProps(Properties myProps) {
        this.myProps = myProps;
    }

    public void setMySet(Set<String> mySet) {
        this.mySet = mySet;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

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