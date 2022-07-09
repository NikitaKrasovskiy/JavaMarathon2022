package day4;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++)
            arr[i] = random.nextInt(10000);

        int max = 0;
        for (int j : arr) {
            if (j > max)
                max = j;
        }
        System.out.println("наибольший элемент массива : " + max);

        int min = 10000;
        for (int j : arr) {
            if (j < min)
                min = j;
        }
        System.out.println("наименьший элемент массива: " + min);

        int na0 = 0;
        for (int j : arr) {
            if (j % 10 == 0)
                na0 = j;
        }
        System.out.println("количество элементов массива, оканчивающихся на 0: " + na0);

        int sum = 0;
        for (int j : arr) {
            if (j % 10 == 0)
                sum += j;
        }
            System.out.println("сумму элементов массива, оканчивающихся на 0: " + sum);
    }
}


