package org.example.structural.decorator;

// Конкретный декоратор - Декоратор шифрования
class EncryptionDecorator extends StreamDecorator {
    public EncryptionDecorator(Stream decoratedStream) {
        super(decoratedStream);
    }

    public void write(String data) {
        super.write(data);
        String encryptedData = encrypt(data);
        System.out.println("Запись зашифрованных данных: " + encryptedData);
    }

    private String encrypt(String data) {
        // Логика шифрования данных
        return "Encrypted-" + data;
    }
}
