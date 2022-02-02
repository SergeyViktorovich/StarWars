package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("Ford", "Black", 1986);
        System.out.println(motorbike);
    }
}
    class Motorbike {
        public String model;
        public String color;
        public int year;

        public Motorbike(String model, String color, int year) {
            this.model = model;
            this.color = color;
            this.year = year;

            System.out.println(" Цвет авто: " + color + "\n Модель авто: " + model + "\n Год выпуска: " + year);
        }
    }

