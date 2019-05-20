package com.company;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        TreeSet<Human> set = new TreeSet<Human>();
        set.add(new Human(25, "Tom"));
        set.add(new Human(19, "Liz"));
        set.add(new Human(26, "Alison"));
            System.out.println(set);
    }
}
