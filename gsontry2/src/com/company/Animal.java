package com.company;

public class Animal {

   private  String animal_type;
    private String name;
    private int age;
    private boolean has_tail;
    private String[] colors;
    private int friends;

    public Animal(String animal_type, String name, int age, boolean has_tail, String[] colors, int friends){
        this.animal_type = animal_type;
        this.name = name;
        this.age = age;
        this.has_tail = has_tail;
        this.colors = colors;
        this.friends = friends;
    }
    public Animal() {}
   public  String getAnimal_type()
    {
        return animal_type;
    }

    public  String getName()
    {
        return name;
    }

    public  int getAge()
    {
        return age;
    }

    public  boolean isHas_tail()
    {
        return has_tail;
    }

    public String[] getColors()
    {
        return colors;
    }

    public  int getFriends()
    {
        return friends;
    }

    @Override

    public String toString() {

        return  animal_type+" "+name+" "+age+" "+has_tail+ " "+colors+ " "+friends;


    }

}