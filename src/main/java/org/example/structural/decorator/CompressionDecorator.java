package org.example.structural.decorator;

// Конкретный декоратор - Декоратор сжатия
class CompressionDecorator extends StreamDecorator {
    public CompressionDecorator(Stream decoratedStream) {
        super(decoratedStream);
    }

    public void write(String data) {
        super.write(data);
        String compressedData = compress(data);
        System.out.println("Запись сжатых данных: " + compressedData);
    }

    private String compress(String data) {
        // Логика сжатия данных
        return "Compressed-" + data;
    }
}
