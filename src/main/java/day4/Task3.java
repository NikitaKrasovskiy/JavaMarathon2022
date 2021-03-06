package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrix = new int[12][8];

        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(50);
            }
        }
        int sum = 0;
        int maxSum = 0;
        int maxSumSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum = matrix[i][j];
            }
            if(sum > maxSum) {
                maxSum = sum;
                maxSumSum = i;
            }
        }
        System.out.println(maxSumSum);
    }
}