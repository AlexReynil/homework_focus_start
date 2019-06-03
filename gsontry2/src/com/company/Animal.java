package com.company;

import java.util.List;

import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


public class Animal {
   // private List<AnimalList> animalLists;
    @SerializedName("animal_type")
    @Expose
    private String animal_type;
    @JsonIgnoreProperties
    @SerializedName("name")
    @Expose
    private String name;
    @JsonIgnoreProperties
    @SerializedName("age")
    @Expose
    private Integer age;
    @JsonIgnoreProperties
    @SerializedName("has_tail")
    @Expose
    private Boolean has_tail;
    @JsonIgnoreProperties
    @SerializedName("colors")
    @Expose
    private List<String> colors = null;
    @JsonIgnoreProperties
    @SerializedName("friends")
    @Expose
    private Friends friends;

    public String getAnimal_type() {
        return animal_type;
    }

    public void setAnimal_type(String animal_type) {
        this.animal_type = animal_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getHas_tail() {
        return has_tail;
    }

    public void setHas_tail(Boolean has_tail) {
        this.has_tail = has_tail;
    }

    public List<String> getColors() {
        return colors;
    }

    public void setColors(List<String> colors) {
        this.colors = colors;
    }

    public Friends getFriends() {
        return friends;
    }

    public void setFriends(Friends friends) {
        this.friends = friends;
    }

   @Override
    public String toString() {
        return new ToStringBuilder(this).append("animalType: ", animal_type).append(" name: ", name).append(" age: ", age).append(" hasTail: ", has_tail).append(" colors: ", colors).append(" friends: ", friends).toString();
    }

}