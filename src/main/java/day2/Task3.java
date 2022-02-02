package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число №1: ");
        int a = scanner.nextInt();
        System.out.print("Введите число №2: ");
        int b = scanner.nextInt();

        int i = a;
        while(i < b) {
            if (i % 5 == 0 && i % 10 != 0){
                System.out.print(i + " ");
            }
            i++;

        } if ( a == b ) {
            System.out.println("Error");
        }
    }
}
