package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyDirs {
    public String nameDir;
    public String stringDir;
    public String nameTXT;

    public String createStringFile() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя файла");
        nameTXT = in.nextLine();
        nameTXT = nameTXT + ".txt";
        File file = new File(nameTXT);
       if (file.exists()) {
           System.out.println("Файл существует и будет перезаписан");
       }
           try (FileWriter writer = new FileWriter(nameTXT, false)) {
                System.out.println("Введите текст");
                String text = in.nextLine();
                writer.write(text);
                writer.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

        return "File "+nameTXT+" created";
    }
    public String createListFile() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя файла");
        stringDir = in.nextLine();
        stringDir = stringDir + ".txt";
        List<String> str = new ArrayList<String>();
        str.add("I");
        str.add("test");
        str.add("Arraylist");
        File file = new File(nameTXT);
        if (file.exists())
        { System.out.println("Файл существует и будет перезаписан"); }
        try (FileWriter writer = new FileWriter(stringDir, false)) {
            for (String line : str) {
                writer.write(line);
                writer.write(System.getProperty("line.separator"));
            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        return "File "+stringDir+" created";
    }

    public String createDir()
    {
        Scanner in1 = new Scanner(System.in);
        System.out.println("Введите имя директории");
        nameDir = in1.nextLine();
        File DirCreate = new File(nameDir);
        if (DirCreate.exists()) {
            System.out.println("DIR is already created");
        }
        else {
            boolean result = false;
            try {
                DirCreate.mkdir();
                result = true;
            } catch (SecurityException se) {
            }
        }
        return  "Directory "+ DirCreate + " created";
    }
    public String removeDir()
    {
        Scanner in2 = new Scanner(System.in);
        System.out.println("Введите имя директории");
        String dir1 = in2.nextLine();
        File DirDel = new File(dir1);
        if (DirDel.exists()) {
            DirDel.delete();
            System.out.println("Directory "+DirDel +" removed");
        }
        else {
            System.out.println("Directory "+DirDel+ " does not exist");
        }
        return "";
    }
}
