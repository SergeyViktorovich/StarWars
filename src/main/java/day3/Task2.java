package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Ведите делитель: ");
            double a = scanner.nextDouble();

            System.out.print("Введите делимое: ");
            double b = scanner.nextDouble();

            if (b == 0) {
                System.out.println("Деление на 0 запрещено");
                System.exit(0);
            }
            double result = a / b;
            System.out.println("Результат равен: " + result);
        }
    }
}
