package ru.geekbrains.ntr_0202;

import ru.geekbrains.ntr_0202.exceptions.MyArrayDataException;
import ru.geekbrains.ntr_0202.exceptions.MyArraySizeException;

import static ru.geekbrains.ntr_0202.Utils.*;

public class Main {

    public static void main(String[] args) {

        String[][] testStringArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            System.out.println(String.format("Сумма элементов массива = %d", arraySum(testStringArray)));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}
