package ru.denis.java.homework4;

import static java.lang.Integer.parseInt;

public class HomeWorkApp4 {
    public static void main(String[] args) {

        try {
            String[][] arr = {
                    {"5", "AB", "18", "19"},
                    {"6", "10", "15", "58"},
                    {"9", "15", "15", "56"},
                    {"8", "17", "20", "50"}
            };

            int result = sumArr(arr);
            System.out.println(result);

        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }


    }

    public static int sumArr(String[][] arr) {
        if (arr.length != 4) {
            throw new MyArraySizeException("Размер массива должен быть 4*4");
        }
        for (String[] row : arr) {
            if (row.length != 4) {
                throw new MyArraySizeException("Размер массива должен быть 4*4");
            }
        }

        int sum = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                try {
                    int a = Integer.parseInt(arr[i][j]);
                    sum += a;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Ошибка преобразования элемента на позиции: " + i + "x" + j);
                }
            }
        }
        return sum;

    }
}
