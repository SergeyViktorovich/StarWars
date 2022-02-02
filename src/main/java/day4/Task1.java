package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {

            String stop = scanner.nextLine();
            if (stop.equals("Stop")) {
                break;
            }

            int b = scanner.nextInt();
            int[] massive = new int[b];
            for (int i = 0; i < massive.length; i++) {
                massive[i] = random.nextInt(10);
            }
            System.out.println("Длинна массива: " + b);

            int sum = 0;
            for (int x : massive) {
                sum = sum + x;
            }
            System.out.print("Сумма всех элементов массива: " + sum);

            int nechet = 0;
            for (int i = 0; i < massive.length; i++) {
                if (massive[i] % 2 != 0) {
                    nechet++;
                }
            }
            System.out.print("\nКол-во нечетных чисел: " + nechet);

            int chet = 0;
            for(int i = 0; i < massive.length; i++) {
                if (massive[i] % 2 == 0) {
                    chet++;
                }
            }
            System.out.print("\nКол-во четных чисел: " + chet);

            int counter8 = 0;
            for( int i = 0; i< massive.length; i++) {
                if(massive[i] > 8)
                    counter8++;
            }

            int counter1 = 0;
            for( int i = 0; i< massive.length; i++) {
                if(massive[i]==1)
                    counter1++;
            }
            System.out.print("\nКол-во чисел больше 1: " + counter1);
            System.out.print("\nКол-во чисел больше 8: " + counter8);
            System.out.print("\nВаш массив: " + Arrays.toString(massive));
            System.out.println();
            System.out.print("\nУкажите новую длинну массива: ");
        }
    }
}
