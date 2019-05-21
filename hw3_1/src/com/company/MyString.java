package com.company;

import java.util.Scanner;

public class MyString {
    public String line;
    public String s;
    MyString(String s)
    {
        line=s;
    }
    StringBuilder st = new StringBuilder();
    public String enterString()
    {
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        return line;
    }
    //reverse string

    public StringBuilder reverse() {
        StringBuilder  ResultS = new StringBuilder(s);
        ResultS.reverse();
        return ResultS;
    }
    public String reverse2(){
        char[] a = s.toCharArray();
        char[] b = new char[a.length];
        for (int i=0;i<a.length;i++) {
            b[(a.length - 1) - i] = a[i];
        }
        return new String(b);
    }
    //killing spaces
    public String trim() {
        return s.trim();
    }

    public int length()
    {
        return line.length();
    }
    public String up()
    {
        return s.toUpperCase();
    }

    public String substring(int beginIndex, int endIndex)
    {
       Scanner in = new Scanner(System.in);
        System.out.println("Введите начало: ");
        beginIndex = in.nextInt();
          while ( beginIndex < 0 || beginIndex > s.length()) {
             System.out.println("Ошибка! Введите начало больше 0 или меньше конца строки:");
           beginIndex = in.nextInt();
          }
        System.out.println("Введите конец: ");
        endIndex = in.nextInt();
           while (endIndex < beginIndex || endIndex > s.length() || endIndex <= 0 ) {
            System.out.println("Ошибка! Введите конец больше начала или меньше длины строки");
            endIndex = in.nextInt(); }
        String name = s.substring(beginIndex,endIndex);
        return name;
    }
    @Override
    public String toString() {
        return s;
    }
}
