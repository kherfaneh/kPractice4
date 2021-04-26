package com.company;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Voting {
    //filed
    private int type;
    private int numberVote;
    private String Question;
    private ArrayList<Person> voters;
    private ArrayList<String> polls;

    //constructor
    public Voting(int type , int numberVote){
        this.type = type;
        this.numberVote = numberVote;
        HashMap<String, HashSet<Vote>> polls = new HashMap<String, HashSet<Vote>>();
        HashSet<Vote> hashset = new HashSet<Vote>();
        ArrayList<String> Option= new ArrayList<String>();
    }

    //method
    public ArrayList<String>getQuestion(){
       return Question;
    }
    public void creatPoll(String VotingOption){
        option.add(VotingOption);
    }
    public void vote(int numberVote, Person Name, ArrayList<String>option){
        HashMap<Integer, HashMap<Person, ArrayList<String>>> vote = new HashMap<Integer, HashMap<Person, ArrayList<String>>>();
        HashMap<Person, ArrayList<String>> voter = new HashMap<Person, ArrayList<String>>();
        vote.put(numberVote, voter);
    }
    public ArrayList<Person> getVoters(){
       return voters;
    }
    public void printResult(){

    }
    public HashMap<String, HashSet<Vote>> getPolls(){
       return polls;
    }
}
