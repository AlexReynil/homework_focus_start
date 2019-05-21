package com.company;

public class Human implements Comparable<Human> {
    public int age;
    public String name;

    public Human(int age, String name) {
        this.age=age;
        this.name=name;
    }
    @Override
    public int compareTo(Human other) {
        int compareage=((Human)other).age;
        return this.age-compareage;
    }
    @Override
    public String toString() {
        return age +" "+name;
    }


}
