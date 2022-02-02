package day5;

import java.util.Scanner;

import static java.awt.Color.black;

public class Task1 {
    public static void main(String[] args) {

        Car car = new Car();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Укажите можель авто: ");
        String model = scanner.nextLine();
        System.out.println("Укажите цвет авто: ");
        String color = scanner.nextLine();
        System.out.println("Укажите возраст авто: ");
        int year = scanner.nextInt();

        car.setModel(model);
        car.setColor(color);
        car.setYear(year);
        car.info();
    }
}
        class Car {
            private String model;
            private String color;
            private int year;

            public void setModel(String modelCar) {
                model = modelCar;
            }
            public String getModel() {
                return model;
            }
            public void setColor(String colorCar) {
                color = colorCar;
            }
            public String getColor() {
                return color;
            }
            public void setYear(int yearCar) {
                year = yearCar;
            }
            public int getYear() {
                return year;
            }

            public void info() {
                System.out.println("Название авто " + model + ", " + "цвет авто " + color + ", "
                        + "машина " + year + " года");
            }
        }
