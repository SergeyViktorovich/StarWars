package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число №1: ");
        int a = scanner.nextInt();
        System.out.print("Введите число №2: ");
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            if (i % 5 == 0 && i % 10 != 0)

            System.out.print(i + " ");

            if ( a == b) {
                System.out.println("Error");
            }
        }
        System.out.println("\nОперация заввершена.");
    }
}
