package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int home = scanner.nextInt();

        if ( 1 <= home && home <= 4 ) {
            System.out.println("Малоэтажный дом");
        } else if ( 5 <= home && home <= 8) {
            System.out.println("Средженеэтажный дом");
        } else if ( 9 <= home ){
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("ERROR");
        }
    }
    }