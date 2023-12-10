package org.example.creational.factory;

public class PC implements Computer{
    private String ram;

    public PC(String ram) {
        this.ram = ram;
    }

    @Override
    public String getRam() {
        return ram;
    }
}
