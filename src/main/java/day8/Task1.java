package day8;

public class Task1 {
    public static void main(String[] args) {
        String number = "";

       long startTime = System.currentTimeMillis();

        for (int i = 0; i <= 20_000; i++) {
            number += i + " ";
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Длительность работы в мс: " + (endTime - startTime));
        System.out.println(number);

        StringBuilder sb = new StringBuilder("");

       startTime = System.currentTimeMillis();

        for (int i = 0; i < 20_000; i++) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
       endTime = System.currentTimeMillis();

        System.out.println("Длительность работы в мс: " + (endTime - startTime));
        System.out.println(sb);
    }
}
