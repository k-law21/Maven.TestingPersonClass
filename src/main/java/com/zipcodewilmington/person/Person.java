package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String race;
    private String nationality;
    private boolean athlete;
    private String favSport;
    private boolean onlyChild;
    private int numSiblings;
    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
    }
    public Person(int age) {
        this.age = 5;
    }

    public Person(String name) {
        this.name = "Leon";

    }

    public Person(String name, int age) {
        this.name = "Leon";
        this.age = 5;
    }


    public void setName(String name) {
        this.name = "Leon";
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
}
