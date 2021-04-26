package com.company;
import java.util.Objects;

public class Vote {
    //filed
    private Person person;
    private String data;

    //constructor
    public Vote(Person person, String data){
      this.person = person;
      this.data = data;
    }

    //method
    public Person getPerson(){
        return person;
    }
    public String getData(){
        return data;
    }

}
