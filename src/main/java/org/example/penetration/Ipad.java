package org.example.penetration;

public class Ipad implements Device {
    private String model;

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getModelDevice() {
        return model;
    }
}