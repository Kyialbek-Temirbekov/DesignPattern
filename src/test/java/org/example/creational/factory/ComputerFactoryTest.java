package org.example.creational.factory;

import junit.framework.TestCase;
import org.example.creational.singleton.BillPughSingleton;

import java.lang.reflect.InvocationTargetException;

public class ComputerFactoryTest extends TestCase {

    public void testGetComputer() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Computer laptop = ComputerFactory.getComputer(Laptop.class, "4gb");
        Computer pc = ComputerFactory.getComputer(PC.class, "8gb");
        System.out.println(laptop.getClass().getSimpleName() + " ram: " + laptop.getRam());
        System.out.println(pc.getClass().getSimpleName() + " ram: " + pc.getRam());
        ComputerFactory.getComputer(BillPughSingleton.class, "1");
    }
}