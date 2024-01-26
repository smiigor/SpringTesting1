package org.example.hello;

public class AppHelloWorldDecoupledWithFactory {
    public static void main(String[] args) {
        MessageProvider provider = MessageSupportFactory.getFactory().getMessageProvider();
        MessageRender render = MessageSupportFactory.getFactory().getMessageRender();
        render.setMessageProvider(provider);
        render.render();
    }
}