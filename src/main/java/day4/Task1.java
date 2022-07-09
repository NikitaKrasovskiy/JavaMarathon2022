package day4;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int n = sc.nextInt();
        int[] arr = new int[n];

        int max = 0;
        int sum = 0;
        int numNo = 0;
        int num = 0;
        int rav1 = 0;
        for (int i = 0; i < arr.length; i++) {

            arr[i] = random.nextInt(10);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 8) {
                max++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == 1) {
                rav1++;
            }
        }
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] % 2 == 0) {
                num++;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] %2 != 0) {
                numNo++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Длина массива : "+ n);
        System.out.println("Количество чисел больше 8: "+ max);
        System.out.println("Количестве чисел равных 1: "+ rav1);
        System.out.println("Количестве четных чисел: "+ num);
        System.out.println("Количестве нечетных чисел: "+ numNo);
        System.out.println("Сумме всех элементов массива: "+ sum);
    }
}






