package ru.geekbrains.ntr_0202.exceptions;

public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException() {
        super("Размер массива отличен от 4х4");
    }
}
