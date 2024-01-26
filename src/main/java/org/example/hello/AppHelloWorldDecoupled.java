package org.example.hello;

public class AppHelloWorldDecoupled {
    public static void main(String[] args) {
        MessageRender render = new MessageRenderStandart();
        MessageProvider provider = new MessageProviderHello();

        render.setMessageProvider(provider);
        render.render();

        render.setMessageProvider(new MessageProviderHelloRus());
        render.render();
    }
}