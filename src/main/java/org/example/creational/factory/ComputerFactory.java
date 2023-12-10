package org.example.creational.factory;

import java.lang.reflect.InvocationTargetException;

public class ComputerFactory {
    public static <T> T getComputer(Class<T> clazz, String ram) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        if(!Computer.class.isAssignableFrom(clazz)) {
            throw new IllegalArgumentException(clazz.getSimpleName() + " is not assignable from Computer class.");
        }
        return clazz.getDeclaredConstructor(String.class).newInstance(ram);
    }
}
