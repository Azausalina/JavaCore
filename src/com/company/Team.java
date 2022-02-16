package com.company;

public class Team {
    private String name;
    private Member[] members;
    private boolean doneFlag = false;

    public Team(String name, Member[] members){
        this.name = name;
        this.members = members;
    }

    public Member[] getMembers() {
        return members;
    }


    public void setDoneFlag(boolean flag){
        this.doneFlag = flag;
    }

   public void showTeam() {
       System.out.println("Состав команды " + name + ":");
       System.out.println("*************");
       for (Member member : this.members) {
           System.out.println(member.getName());
       }
       System.out.println("*************");
   }

    public void showResults() {
        if (doneFlag) {
            System.out.println("Результат команды " + name + ":");
            System.out.println("*************");
            for (Member member: this.members) {
                if (member.getStatus()) {
                    System.out.println(member.getName() + " прошёл дистанцию");
                }
                else{
                    System.out.println(member.getName() + " не прошёл дистанцию");
                }
            }
        }
        else {
            System.out.println("Команда" + name + " еще не прошла!");
        }
        System.out.println("*************");
    }
}
