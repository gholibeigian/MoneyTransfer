package com.company;

public class Person {
    private int Age;
    private String Name;
    private String Address;

    public Person(int age, String name, String address) {
        Age = age;
        Name = "Marry ";
        Address = address + " give it to Marry!";
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
