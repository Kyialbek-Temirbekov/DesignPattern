package org.example.structural.decorator;

// Базовый декоратор - Абстрактный класс декоратора
abstract class StreamDecorator implements Stream {
    protected Stream decoratedStream;

    public StreamDecorator(Stream decoratedStream) {
        this.decoratedStream = decoratedStream;
    }

    public void write(String data) {
        decoratedStream.write(data);
    }
}