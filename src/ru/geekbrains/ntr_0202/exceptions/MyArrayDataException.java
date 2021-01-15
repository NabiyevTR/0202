package ru.geekbrains.ntr_0202.exceptions;

public class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException(int i, int j) {
        super(String.format("Значение ячейки [%d,%d] не является целым числом.", i,j));
    }
}
