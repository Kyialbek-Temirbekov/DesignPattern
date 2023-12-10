package org.example.creational.factory;

public class Laptop implements Computer{
    private String ram;

    public Laptop(String ram) {
        this.ram = ram;
    }

    @Override
    public String getRam() {
        return ram;
    }
}
