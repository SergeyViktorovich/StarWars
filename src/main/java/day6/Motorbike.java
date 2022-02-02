package day6;


class Motorbike {
    private String model;
    private String color;
    private int year;

    public Motorbike(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;

    }
    public void infoMoto (){
        System.out.println("Это мото");
    }

    int inputYear = 2022;
    public void yearMoto(){
        int yearDifference = inputYear - year;
        System.out.println(yearDifference + " года этому мотору");
    }
}

