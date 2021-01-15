package ru.geekbrains.ntr_0202;

import ru.geekbrains.ntr_0202.exceptions.*;

public class Utils {

    /**
     * Преобразует строковые элементы масива в целое число и вычисляет их сумму.
     *
     * @param array двухмерный массив {@code String[][]} с размером 4х4;
     * @return Возвращает сумму целых значений элементов массива;
     * @throws MyArraySizeException размер массива {@code array}
     *                              не 4х4;
     * @throws MyArrayDataException какой-либо элемент массива не
     *                              является целым числом.
     */
    public static int arraySum(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int arraySize = 4;
        int arraySum = 0;

        if (array.length != arraySize) throw new MyArraySizeException();

        for (int i = 0; i < array.length; i++) {
            if (array[i].length != arraySize) throw new MyArraySizeException();
            for (int j = 0; j < array[i].length; j++) {
                try {
                    arraySum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return arraySum;
    }

}
