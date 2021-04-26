package com.company;

public class Main {

    public static void main(String[] args) {
	VotingSystem vote = new VotingSystem();
	Person personName = new Person("erfaneh", "khanmohammadi");
	vote.creatVoting("entekhabat riasat jomhori", 0, 0);
	vote.creatVoting("entekhabat shora", 1, 0);
	vote.getListOfVotings();
	vote.vote(0, 1, personName, "kalantari");
	vote.vote(1, 1, personName, "kalantari");
	vote.vote(1, 1, personName, "ahmadi");
//	vote.RandomVote(1, personName);
    vote.getVoting(0);
    }
}
