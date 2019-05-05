package com.company;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите k: ");
        int k = in.nextInt();
        char m;
        String s="";
        while (k < 0 || k > 180) {
            System.out.println("Пожалуйста, введите k от 1 до 180:");
            k = in.nextInt();
        }
        for (int i=0;i<90;i++) {
            s = s + (int) (Math.random()*(90)+10);
        }
        System.out.println(s);
        m = s.charAt(k);
        System.out.print("Цифра: ");
        System.out.println( m );
    }
}