package org.example.lesson65_15;

import org.example.lesson65.CollectionsTestXml;
import org.springframework.context.support.GenericXmlApplicationContext;

// This test App corresponds to lesson 65.15
// Spring Framework Java - Внедрение коллекций (Map, List, Set) и Propertoes в контекст приложения
public class AppBeanWithCollections {
    private static final String xmlConfig = "spring/app-context-xml.xml";
    private static final String annotConfig = "spring/app-context-annotation.xml";

    public static void main(String[] args) {
        demoBeanWithCollectionsViaXml();
        demoBeanWithCollectionsViaAnnotation();
    }

    private static void demoBeanWithCollectionsViaXml() {
        System.out.println("Bean with collections via XML-file.");
//        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
//        context.load(xmlConfig);
//        context.refresh();
        // This line below replace three commented lines before.
        GenericXmlApplicationContext context = new GenericXmlApplicationContext(xmlConfig);

        CollectionsTestXml instance = (CollectionsTestXml) context.getBean("collectionsTest");
        instance.displayInfo();
    }

    private static void demoBeanWithCollectionsViaAnnotation() {
        System.out.println("\n\tBean with collections via annotations.");
        GenericXmlApplicationContext context = new GenericXmlApplicationContext(annotConfig);

        CollectionsTestAnnotation instance = (CollectionsTestAnnotation) context.getBean("injectCollectionsAnnotation");
        instance.displayInfo();
    }
}