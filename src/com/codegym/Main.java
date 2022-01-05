package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;

        do {
            System.out.print("Nhập số phần tử của mảng: ");
            size = scanner.nextInt();

            if (size > 5)
                System.out.println("Số phần tử không quá 10");
        } while (size > 5);

        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử vị trí thứ " + i + " mảng: ");
            arr[i] = scanner.nextInt();
        }
        int min = minValue(arr);
        System.out.println("Giá trị nhỏ nhất của mảng là: " + min);
    }

    public static int minValue(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}