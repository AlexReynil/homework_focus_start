package com.company;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество игроков: ");
        int a = in.nextInt();
        while (a < 1 || a > 2) {
            System.out.println("Пожалуйста, введите 1 или 2:");
            a = in.nextInt();
        }
        int n = (int) (Math.random() * 10);
        if (a == 2) {
            System.out.println("Я загадываю число от 0 до 9...");
            System.out.println("Игрок 1: ");
            int p1 = in.nextInt();
            System.out.println("Игрок 2: ");
            int p2 = in.nextInt();
            while (p1 != n && p2 != n) {
                System.out.println("Давайте ещё раз ");
                System.out.println("Игрок 1: ");
                p1 = in.nextInt();
                System.out.println("Игрок 2: ");
                p2 = in.nextInt();
            }
            if (p1 == n) {
                System.out.println("Победа игрока 1!");
            }
            if (p2 == n) {
                System.out.println("Победа игрока 2!");
            }
        }
        if (a == 1) {
            System.out.println("Я загадываю число от 0 до 9...");
            System.out.println("Игрок: ");
            int p1 = in.nextInt();
            while (p1 != n) {
                System.out.println("Давайте ещё раз ");
                System.out.println("Игрок: ");
                p1 = in.nextInt();
                if (p1 == n) {
                    System.out.println("Игрок угадал!");
                }
            }
        }
    }
}