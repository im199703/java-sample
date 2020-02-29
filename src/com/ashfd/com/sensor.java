package com.ashfd.com;

public class sensor {

    private String name;

    public sensor() {
    }

    private double value;

    public sensor(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "sensor{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
