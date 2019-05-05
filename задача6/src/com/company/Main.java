package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число k: ");
        int k = in.nextInt();
        while (k<=0)
        {
            System.out.println("Введите положительное число k: ");
            k = in.nextInt();
        }
        int n=0;
        for (int x = 1; x < k; x++) {
            if ( n<k ) {
                n = n + x;
            }
        }
        if (n==k) {
            System.out.println("Такое число n существует");
        }
        else
        {System.out.println("Такое число n не существует");}
    }
}