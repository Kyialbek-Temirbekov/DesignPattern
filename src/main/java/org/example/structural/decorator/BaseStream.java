package org.example.structural.decorator;

// Конкретный компонент - Реализация базового потока данных
class BaseStream implements Stream {
    public void write(String data) {
        System.out.println("Запись данных: " + data);
    }
}
