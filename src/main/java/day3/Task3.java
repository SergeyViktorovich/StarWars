package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i<5) {
            System.out.print("Введите делитель: ");
            double delitel = scanner.nextDouble();

            System.out.print("Введите делимое: ");
            double delimoe = scanner.nextDouble();

                if (delimoe == 0) {
                    System.out.println("Деление на ноль запрщено");
                    continue;
                }
                double result = delitel / delimoe;
                System.out.println("Результат: " + result);
                i++;
            }
        }
    }