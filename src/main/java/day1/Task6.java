package day1;

import java.util.Scanner;

import static java.lang.System.*;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

    int i = 0;
        while (i <= 10) {
            out.println(i + " x " + k + " = " + i * k);
            i++;
        }
    }
}
