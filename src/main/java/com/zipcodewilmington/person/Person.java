package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;

    private String hairColor;
    private Boolean allAppendages;
    private String eyeColor;
    private int shoeSize;
    private int schoolYear;



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

    public Person(String name, int age, String hairColor) {
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
    }

    public Person(String name, int age, String hairColor, Boolean allAppendages) {
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
        this.allAppendages = allAppendages;
    }

    public Person(String name, int age, String hairColor, Boolean allAppendages, Integer shoeSize) {
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
        this.allAppendages = allAppendages;
        this.shoeSize = shoeSize;
    }

    public Person(String name, int age, String hairColor, Boolean allAppendages, Integer shoeSize, Integer schoolYear) {
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
        this.allAppendages = allAppendages;
        this.shoeSize = shoeSize;
        this.schoolYear = schoolYear;
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

    public String getHairColor(){
        return this.hairColor;
    }

    public void setHairColor(String hairColor){
        this.hairColor = hairColor;
    }



    public void setAllAppendages(Boolean allAppendages){
        this.allAppendages = allAppendages;
    }

    public Boolean getAllAppendages() {
        return this.allAppendages;
    }

    public void setEyeColor(String eyeColor){
        this.eyeColor = eyeColor;
    }

    public String getEyeColor(){
        return this.eyeColor;
    }

    public Integer getShoeSize(){
        return this.shoeSize;
    }

    public void  setShoeSize(Integer shoeSize){
        this.shoeSize = shoeSize;

    }

    public Integer getSchoolYear() {
        return this.schoolYear;
    }

    public void setSchoolYear(int schoolYear) {
        this.schoolYear = schoolYear;

    }
}
