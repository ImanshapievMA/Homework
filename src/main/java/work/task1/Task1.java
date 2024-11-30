package work.task1;

import work.task2.Task2;

import java.util.Scanner;

import static work.task2.Task2.circle;
import static work.task2.Task2.circle1;


public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите пол");
        String sex = scanner.nextLine();
        if (sex.equals("m") || sex.equals("w")) {
            System.out.println("Вы человек");
        }
        else  {
            System.out.println("Черт");
        }
    }
}