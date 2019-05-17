package com.company;

import java.util.*;

public class strings {

public String s;
    //reverse string

     public StringBuilder reverse() {
        Scanner in = new Scanner(System.in);
       // String s = in.nextLine();
       // String ResultS = new StringBuilder(s).reverse().toString();
        StringBuilder  ResultS = new StringBuilder(s);
        ResultS.reverse();
        System.out.print("В средиземье: ");
        System.out.println(ResultS);
        ResultS.toString();
      /*  String reverseS = "";
       System.out.print("И обратно:  ");
        for (int i = ResultS.length() - 1; i >= 0; i--) {
            reverseS = reverseS + ResultS.substring(i, i + 1);
        }*/
        return  reverse();
    }

    public String trim()
    {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.print("Возвращаемое значение: ");
        return s.trim();
    }
    public String substring(int beginIndex, int endIndex)
    {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
       /* System.out.println("введите начало");
        beginIndex = in.nextInt();
        System.out.println("введите конец");
        endIndex = in.nextInt();*/
        String name = s.substring(beginIndex,endIndex);
        System.out.println(name);
        return name;
    }
    public static void main(String[] args) {
       /* Scanner in = new Scanner(System.in);
        System.out.println("d");
        String s = in.nextLine();
        System.out.println(s.trim());
        System.out.println(s.substring(3,6));*/
     //   System.out.println(s.);
    }
}
