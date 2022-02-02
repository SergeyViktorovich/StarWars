package day6;

public class Task2 {
    public static void main(String[] args) {
    Airplane airplane = new Airplane("Air-lance", 2015, 50000, 1000);

        airplane.setYear(2021);
        airplane.setLength(3500);
        airplane.setWeight(1800);

        airplane.fillUp(1500);
        airplane.info();
    }
}

