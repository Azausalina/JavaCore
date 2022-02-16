package com.company;

public class Course {
    private Challenge[] challenges;

    public Course(Challenge[] challenges) {
        this.challenges = challenges;
    }

    public void doIt(Team team) {
        for (Member member: team.getMembers()){
            boolean done = true;
            for(Challenge challenge: this.challenges) {
                if (!challenge.isSuccesfull(member)) {
                    done = false;
                    break;
                }
            }
            member.setStatus(done);
        }

        team.setDoneFlag(true);
    }
}
