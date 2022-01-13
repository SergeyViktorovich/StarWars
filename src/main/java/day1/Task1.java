package day1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner value = new Scanner(System.in);
        int num = value.nextInt();

        int a = 10;
        while (a >= num) {
            System.out.print(" JAVA №" + num);
            num++;
        }
    }
}