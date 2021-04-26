package com.company;

public class Person {
    //filed
    private String firstName;
    private String lastName;

    //constructor
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //method
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String toString(){
        return "FirstName:" +firstName + "LastName:" + lastName;
    }
}
