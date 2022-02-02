package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        Motorbike motorbike = new Motorbike("ZX", "Black", 1886);
            car.setYear(1990);

        car.infoCar();
        motorbike.infoMoto();

        car.yearCar();
        motorbike.yearMoto();
    }
}
