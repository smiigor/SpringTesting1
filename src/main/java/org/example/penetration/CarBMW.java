package org.example.penetration;

public class CarBMW implements Car {
    private String model;
    private int age;
    Device device;

    public void setDevice(Device device) {
        this.device = device;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getCarModel() {
        return model;
    }

    @Override
    public int getCarAge() {
        return age;
    }
    @Override
    public String getDeviceModel() {
        return device.getModelDevice();
    }
}