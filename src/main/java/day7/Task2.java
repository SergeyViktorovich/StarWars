package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

    Player a1 = new Player(100);
    Player a2 = new Player(70);
    Player a3 = new Player(78);

    Player.info();

    Player a4 = new Player(54);
    Player a5 = new Player(90);
    Player a6 = new Player(79);

    Player.info();

    Player a7 = new Player(100);

    Player.info();

    for (int i = 0; i < 78; i++)
    a3.run();

    Player.info();

    }
}
