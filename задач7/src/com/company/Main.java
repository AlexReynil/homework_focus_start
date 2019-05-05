package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер месяца: ");
        int k = in.nextInt();
        while (k>12 || k<1)
        {
            System.out.println("Введите номер месяца: ");
            k = in.nextInt();
        }
        if (k == 1 || k == 2 || k == 12) {
            System.out.println("Зима!");
        }
        if (k == 3 || k == 4 || k == 5) {
            System.out.println("Весна!");
        }
        if (k == 6 || k == 7 || k == 8) {
            System.out.println("Лето!");
        }
        if (k == 9 || k == 10 || k == 11) {
            System.out.println("Осень!");
        }
    }
}