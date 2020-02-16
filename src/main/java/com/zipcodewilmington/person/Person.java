package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;

    private String hairColor;
    private Boolean allAppendages;



    public Person() {
    this.name = "";
    this.age = Integer.MAX_VALUE;
    }


    public Person(int age) {
        this.age = age;
    }

   public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {

        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setHairColor(String hairColor){
        this.hairColor = hairColor;
    }

    public String getHairColor(){
        return this.hairColor;
    }

    public void setAllAppendages(Boolean allAppendages){
        this.allAppendages = allAppendages;
    }

    public Boolean getAllAppendages() {
        return this.allAppendages;
    }


}
