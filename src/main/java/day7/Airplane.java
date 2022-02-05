package day7;

public class Airplane {
        private String manufacture; // изготовитель
        private int year; // год
        private int length; // длина
        private int weight; // вес
        private int fuel; // топливо

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public Airplane(String manufacture, int year, int length, int weight) {
        this.fuel = 0;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.manufacture = manufacture;
    }
    public void fillUp(int n){
        fuel = n + fuel;
    }
    public void info(){
        System.out.println("Изготовитель: " + manufacture + ", " + "год выпуска: " + year + ", "
                + "длина: " + length + ", " + "вес: " + weight + ", " + "количество топлива в баке: " + fuel);
    }
    public static void compareAirplanes (Airplane a1, Airplane a2){
    if (a1.length > a2.length ) {
        System.out.println(a1.manufacture + " длинее конкурентов");
    } else {
        System.out.println(a2.manufacture + " длинее конкурентов");
    }
    }
}