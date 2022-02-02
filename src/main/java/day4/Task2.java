package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] massiv = new int[100];

        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = random.nextInt(10000);
            System.out.print(massiv[i] + " ");
        }
        System.out.println();

        int max = 0;
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] >= max) {
                max = massiv[i];
            }
        }
        int min = 10000;
        for ( int i = 0; i < massiv.length; i++) {
            if ( massiv[i] <= min) {
                min = massiv[i];
            }
        }
        int zero = 0;
        for (int k : massiv) {
            if (k % 10 == 0) {
                zero++;
            }
        }
        int sumZero = 0;
        for (int j : massiv) {
            if (j % 10 == 0) {
                sumZero = sumZero + j;
            }
        }

        System.out.println("Максимальное зеначение: " + max);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Кол - во элементов оканчивающихся на 0: " + zero);
        System.out.println("Сумма элементов оканч. на 0: " + sumZero);
    }
}
