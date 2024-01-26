package org.example.hello;

public class MessageProviderHello implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello world from provider.";
    }
}