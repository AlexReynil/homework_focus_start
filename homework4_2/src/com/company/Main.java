package com.company;

import java.util.ArrayList;
import java.util.Collections;


public class Main {

    public static void main(String[] args) {
        ArrayList<Human>  humans = new ArrayList<Human>();
        humans.add(new Human (25, "Tom"));
        humans.add(new Human (19, "Liz"));
        humans.add(new Human (22, "Kate"));
        humans.add(new Human (23, "John"));
        humans.add(new Human (26, "Alison"));
        System.out.println(humans);
        Collections.sort(humans);
        System.out.println(humans);
        Collections.reverse(humans);
        System.out.println(humans);
    }
}
