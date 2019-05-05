package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число a: ");
        int a = in.nextInt();
        System.out.println("Введите число b: ");
        int b = in.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Число a: "+a);
        System.out.println("Число b: "+b);
    }
}