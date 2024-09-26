package ru.denis.java.homework1;

import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) {

        System.out.println(rangeSum(0, 5));
        positiveNegative(0);
        System.out.println(negative(5));
        helloName("Джейсон Стэтхэм");
        switchArr();
        fillArray();
        updateArray();
        fillDiagonal();
        maxMinArray();
        isLeapYear(2002);
        System.out.println(checkBalance(new int[]{2, 1, 1, 2, 2}));
    }

    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Task1
    public static boolean rangeSum(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    //Task2
    public static void positiveNegative(int a) {
        if (a >= 0) {
            System.out.println("Число " + a + " положительное");
        } else System.out.println("Число " + a + " отрицательное");

    }

    //Task3
    public static boolean negative(int a) {
        return (a < 0);
    }

    //Task4
    public static void helloName(String name) {
        System.out.println("Привет, " + name);

    }

    //Task5
    public static void switchArr() {
        int[] arr = {1, 0, 1, 0, 1, 0, 0, 1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));

    }

    //Task6
    public static void fillArray() {
        int[] arr = new int[8];
        int c = 2;

        arr[0] = 2;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = c += 3;
        }
        System.out.println(Arrays.toString(arr));
    }

    //Task7
    public static void updateArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 6;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //Task8
    public static void fillDiagonal() {
        int[][] arr = new int[3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }

            }

        }
        printArr(arr);
    }

    //Task9
    public static void maxMinArray() {
        int[] arr = {1, 2, 3, 4, 56, 78, 9, 3, 6, 100};
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Максимальный элемент массива " + max);
        System.out.println("Минимальный элемент массива " + min);
    }

    //Task10
    public static void isLeapYear(int year) {
        if (year % 4 == 0) {
            System.out.println("Год высокостный!");
        } else if (year % 100 == 0) {
            System.out.println("Год не высокостный!");
        } else if (year % 400 == 0) {
            System.out.println("Год высокостный!");
        } else System.out.println("Год не высокостный!");
    }

    //Task11
    private static boolean checkBalance(int[] arr) {
        int right = 0;
        int left = 0;

        for (int i = 0; i < arr.length; i++) {
            left += arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                right += arr[j];
            }
            if (left == right) {
                return true;
            }
            right = 0;
        }
        return false;
    }


}













