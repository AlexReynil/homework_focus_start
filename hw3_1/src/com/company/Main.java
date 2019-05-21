package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Работа со строками(1) или с файлами(2)? ");
        Scanner in = new Scanner(System.in);
        int choose = in.nextInt();
        while (choose != 1 && choose != 2) {
            System.out.println("Ошибка! Введите 1 или 2. Работа со строками(1) или с файлами(2)? ");
            choose = in.nextInt();
        }
        if (choose == 1) {
            Scanner in1 = new Scanner(System.in);
            MyString string1 = new MyString("");
            System.out.println("Введите строку s: ");
            string1.enterString();
            System.out.println("1-переворот строки, 2 - переворот строки другим способом, 3 - убрать пробелы в начале и в конце, 4 - подстрока, 5- в верхний регистр");
            int opt1 = in1.nextInt();
            switch (opt1) {
                case 1:
                    System.out.println("Переворот s = " + string1.reverse());
                    break;
                case 2:
                    System.out.println("Переворот другим способом s = " + string1.reverse2());
                    break;
                case 3:
                    System.out.println("Убираем пробелы в начале и конце s = " + string1.trim());
                    break;
                case 4:
                    System.out.println("Подстрока s = " + string1.substring(0, 0));
                    break;
                case 5:
                    System.out.println("В верхний регистр s = " + string1.up());
                    break;
                    default:
                        System.out.println("Такого варинта в меню нет" );
                        break;
            }
        }
        if (choose == 2) {
            Scanner in1 = new Scanner(System.in);
            MyDirs file1 = new MyDirs();
            System.out.println("1-ввод строки в файл, 2 - ввод списка в файл, 3 - создание директории, 4 - удаление директории");
            int opt2 = in1.nextInt();
            switch (opt2) {
                case 1:
                    System.out.println(file1.createStringFile());
                    break;
                case 2:
                    System.out.println(file1.createListFile());
                    break;
                case 3:
                    System.out.println(file1.createDir());
                    break;
                case 4:
                    System.out.println(file1.removeDir());
                    break;
                default:
                    System.out.println("Такого варинта в меню нет" );
                    break;

            }
        }
    }
}
