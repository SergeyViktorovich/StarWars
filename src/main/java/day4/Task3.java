package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] massiv = new int[3][4];

        for (int i = 0; i < massiv.length; i++) {
            for (int k = 0; k < massiv[i].length; k++) {
                massiv[i][k] = random.nextInt(10);
                System.out.print(massiv[i][k] + " ");
            }
            System.out.println();
        }


        int maxSum = 0;
        int maxSumInd = 0;
        for (int i = 0; i < massiv.length; i++) {
            int sum = 0;
            for (int k = 0; k < massiv[i].length; k++) {
                sum = massiv[i][k] + sum;
            }
            if ( sum > maxSum); {
                maxSum = sum;
                maxSumInd = i;
            }
        }
              System.out.println(maxSumInd + " Индекс строки с макс суммой");
    }
}

