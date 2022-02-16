package lesson1;

public class Main {

    public static void main(String[] args) {

        Member[] members = new Member[4];
        members[0] = new Member("Петя", 4, 4, 3);
        members[1] = new Member("Вася", 3, 4, 2);
        members[2] = new Member("Вова", 1, 6, 4);
        members[3] = new Member("Дима", 4, 5, 2);

        Team team = new Team("dream team", members);

        Challenge[] challenges = new Challenge[3];
        challenges[0] = new Challenge("swimming", 3);
        challenges[1] = new Challenge("jumping", 2);
        challenges[2] = new Challenge("running", 4);

        Course course = new Course(challenges);

        team.showTeam();
        course.doIt(team);
        team.showResults();

    }
}
