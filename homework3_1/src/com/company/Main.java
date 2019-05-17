package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

	System.out.println("1 - работа со строками, 2 - работа с файлами, что выберем?");
        int a = in.nextInt();
	/*while (a < 1 || a > 2) {
            System.out.println("Пожалуйста, введите 1 или 2:");
            a = in.nextInt();
        }*/
        Scanner in1 = new Scanner(System.in);
        String s = in1.nextLine();
        System.out.println("s= " + s);
        System.out.println("s= " + s.reverse);
        System.out.println("s= [" + s.trim()+ "]");
        System.out.println("s = [" + s.substring(3,6)+ "]");

    }
}
