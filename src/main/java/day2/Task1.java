package day2;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int floors = sc.nextInt();
    if(floors <= 4 && floors > 1){
    System.out.println("Малоэтажный дом");
    }else if(floors <= 8 && floors >4){
    System.out.println("Среднеэтажный дом");
    }else if(floors == 9 || floors > 9 ){
        System.out.println("Многоэтажный дом");
    }else if(floors != 0){
        System.out.println("Ошибка ввода");
    }
    }
}
