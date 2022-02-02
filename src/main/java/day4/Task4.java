package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

        int array[] = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int maxSum = 0;
        int maxInd = 0;
        for (int i = 0; i < array.length - 2; i++) {
            int sum = 0;
            for (int k = i; k < i + 3; k++){
                sum = array[k] + sum;
            }
            if(sum > maxSum) {
                maxSum = sum;
                maxInd = i;
            }
        }
        System.out.println("Сумма макс тройки: " + maxSum);
        System.out.println("Индекс максимальной тройки: " + maxInd);
    }
}
