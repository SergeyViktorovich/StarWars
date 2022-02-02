package day4;

import java.util.Random;
import java.util.Scanner;

public class Traning {
    public static void main(String[] args) {
     Random random = new Random();
     int[] array = new int [15];

     for (int i = 0; i < array.length; i++) {
         array[i] = random.nextInt(50);
         System.out.print(array[i] + " ");
     }
        System.out.println();

     int maxSum = 0;
     int maxInd = 0;
     for (int i = 0; i < array.length - 2; i++ ){
         int sum = 0;
         for (int k = i; k < i + 3; k++) {
             sum = array[k] + sum;
         }
         if (sum > maxSum) {
             maxSum = sum;
             maxInd = i;
         }
     }
        System.out.println("Макс сумма тройки: " + maxSum);
        System.out.println("Макс инд сум: " + maxInd);
    }
}