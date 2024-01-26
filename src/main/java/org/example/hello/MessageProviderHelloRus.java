package org.example.hello;

public class MessageProviderHelloRus implements MessageProvider {
    @Override
    public String getMessage() {
        return "Привет от provider.";
    }
}