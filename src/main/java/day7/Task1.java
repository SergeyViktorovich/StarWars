package day7;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
    Airplane a1 = new Airplane("Air-Lane", 1985, 2800, 1856);
    Airplane a2 = new Airplane("Air-AOA", 2010, 2000, 1700 );

    a1.fillUp(1000);
    a2.fillUp(1500);

    Airplane.compareAirplanes(a1, a2);
    }
}