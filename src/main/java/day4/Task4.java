package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++)
            arr[i] = random.nextInt(10000);

        int maxSum = 0;
        int sumInd = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += arr[j];
            }
            if(sum > maxSum){
                maxSum = sum;
                sumInd = i;
            }
        }
        System.out.println(maxSum);
        System.out.println(sumInd);
    }
}
