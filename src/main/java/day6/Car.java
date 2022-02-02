package day6;

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
    public void infoCar(){
        System.out.println("Это автомобиль");
    }

    int inputYear = 2022;
    public void yearCar(){
        int yearDifference = inputYear - year;
        System.out.println(yearDifference + " года возраст авто");
    }
}
