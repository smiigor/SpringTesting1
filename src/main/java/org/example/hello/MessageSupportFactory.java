package org.example.hello;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class MessageSupportFactory {
    private static MessageSupportFactory factory;

    private Properties properties;
    private MessageProvider provider;
    private MessageRender render;

    public MessageSupportFactory() {
        properties = new Properties();
        try {
            properties.load(new FileReader("src\\main\\resources\\my.properties"));
            //properties.load(new FileReader("/my.properties"));
            // "/testData/json/requestBodyNoteSimpleText.json"
            String providerClass = properties.getProperty("provider.class");
            String renderClass = properties.getProperty("render.class");

            provider = (MessageProvider) Class.forName(providerClass).newInstance();
            render = (MessageRender) Class.forName(renderClass).newInstance();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
            //throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    static {
        factory = new MessageSupportFactory();
    }

    public static MessageSupportFactory getFactory() {
        return factory;
    }
    public MessageProvider getMessageProvider() {
        return provider;
    }
    public MessageRender getMessageRender() {
        return render;
    }
}