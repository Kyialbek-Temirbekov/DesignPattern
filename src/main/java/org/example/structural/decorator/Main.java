package org.example.structural.decorator;

public class Main {
    public static void main(String[] args) {
        // Создание базового потока данных
        Stream baseStream = new BaseStream();
        baseStream.write("Some data");
        System.out.println("_______________________________");

        // Добавление декоратора шифрования
        Stream encryptedStream = new EncryptionDecorator(baseStream);
        encryptedStream.write("Some data");
        System.out.println("_______________________________");

        // Добавление декоратора сжатия
        Stream compressedStream = new CompressionDecorator(baseStream);
        compressedStream.write("Some data");
        System.out.println("_______________________________");

        // Комбинированное использование декораторов
        Stream compressedAndEncryptedStream = new CompressionDecorator(new EncryptionDecorator(baseStream));
        compressedAndEncryptedStream.write("Some data");
        System.out.println("_______________________________");
    }
}
