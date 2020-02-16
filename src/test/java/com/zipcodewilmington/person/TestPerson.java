package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {


    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testConstructorWithHairColor (){
        //when
        Person person = new Person();
         person.setHairColor("red");
        //then
        String actual = person.getHairColor();
        Assert.assertEquals("red", actual);
    }
    @Test
    public void testSetHairColor (){
        Person person = new Person();
        String expected = "blue";

        person.setHairColor(expected);

        String actual = person.getHairColor();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public  void testConstructorWithAllAppendages(){
        //given
        Boolean allAppendages = true;
        //when
        Person person = new Person();
        //then
        Boolean actual = person.getAllAppendages();
        Assert.assertEquals(true, true);
    }
    @Test
    public void testSetAllAppendages (){
        //given
        Person person = new Person();
        Boolean expected = true;
        //when
        person.setAllAppendages(true);
        //then
        Boolean actual = person.getAllAppendages();
        Assert.assertEquals(true, true);
    }

   @Test
    public void testConstructorWithEyeColor(){

        //when
        Person person = new Person();
        person.setEyeColor("purple");
        //then
        String actual = person.getEyeColor();
        Assert.assertEquals("purple", actual);
    }

    @Test
    public void testSetEyeColor(){
        //given
        Person person = new Person();

        person.setEyeColor("blue");
        //then
        String actual = person.getEyeColor();
        Assert.assertEquals("blue", actual);
    }

    @Test
    public void testConstructorWithSHoeSize(){
        //given
        Person person = new Person();
        person.setShoeSize(13);

        //then
        Integer actual = person.getShoeSize();
        Assert.assertTrue(13 == actual);

    }
    @Test
    public void testSetShoeSize(){
        //when
        Person person = new Person();
        person.setShoeSize(13);
        //then
        Integer actual = person.getShoeSize();
        Assert.assertTrue(13 == actual);
    }

    @Test
    public void testGetAndSetWithSchoolYear(){
        //given
        Person person = new Person();
        person.setSchoolYear(10);

        //then
        Integer actual = person.getSchoolYear();
        Assert.assertTrue(10 == actual);

    }

    /*@Test
    public void testTest(){
        //given

        //when

        //then
        Assert.assertEquals(1, 2);
    }*/
}
