package day7;


import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();


        Player player1 = new Player(random.nextInt(100 - 90) + 90);
        Player player2 = new Player(random.nextInt(100 - 90) + 90);
        Player player3 = new Player(random.nextInt(100 - 90) + 90);
        Player player4 = new Player(random.nextInt(100 - 90) + 90);
        Player player5 = new Player(random.nextInt(100 - 90) + 90);
        Player player6 = new Player(random.nextInt(100 - 90) + 90);

        player1.info();

        for (int i = 0; i < 100; i++) {
            player1.run();
        }
        player1.info();
        Player player7 = new Player(random.nextInt(100 - 90) + 90);
        player7.info();//

    }
}
