package com.company;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class VotingSystem {
    //filed
    private ArrayList<Voting>votingList;
    private ArrayList<ArrayList<String>>option;
    private ArrayList<String>Question;

    //constructor
    public VotingSystem(){
        votingList = new ArrayList<Voting>();
        Question = new ArrayList<String>();
    }
    //method
    public void creatVoting(String question, int type, int numberVote){
        Voting newVote = new Voting(type, numberVote);
        Question.add(question);
    }
    public void getListOfVotings(){
        for(int i = 0; i < Question.size(); i++){
            System.out.println(Question.get(i));
        }
    }
    public void getVoting(int numberVote) {
        System.out.println(Question.get(numberVote));
        for(int i = 0; i < option.size(); i++){
            System.out.println(option.get(numberVote));
        }
    }
    public void vote(int type,int numberVote, Person voterName, String choiceVotingOption) {
        if (type == 0) {
            HashMap<Integer, HashMap<HashSet<Person>, String>> vote = new HashMap<Integer, HashMap<HashSet<Person>, String>>();
            HashMap<HashSet<Person>, String> voter = new HashMap<HashSet<Person>, String>();
            HashSet<Person> voters = new HashSet<Person>();
            vote.put(numberVote, voter);
        } else if (type == 1) {
            HashMap<Integer, HashMap<Person, ArrayList<String>>> vote = new HashMap<Integer, HashMap<Person, ArrayList<String>>>();
            HashMap<Person, ArrayList<String>> voter = new HashMap<Person, ArrayList<String>>();
            vote.put(numberVote, voter);
        }
    }
    public void RandomVote(int numberVote, Person voterName){
        Random RandomVote = new Random();
        int randomNumber = RandomVote.nextInt();
        ArrayList<String> choiceVote = option.get(randomNumber);
        vote(0, numberVote, voterName, choiceVote.get(randomNumber));
    }
    public void getResult(int numberVote){

    }
}
