
package com.company;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int b = 99;

        while(b > 1) {
            System.out.println(b + " bottles of beer on the wall,");
            System.out.println(b + " bottles of beer!");
            System.out.println("take one down, pass it around");
            --b;
            if (b == 1) {
                System.out.println(b + " bottle of beer on the wall!");
            } else {
                System.out.println(b + " bottles of beer on the wall");
            }
        }

        if (b == 1) {
            System.out.println(b + " bottle of beer on the wall,");
            System.out.println(b + " bottle of beer!");
            System.out.println("take one down, pass it around");
            System.out.println("No more bottles of beer on the wall,");
            System.out.println("No more bottles of beer!");
            System.out.println("Go to the store and buy some more");
            System.out.println("99 bottles of beer on the wall!");
        }

    }
}
