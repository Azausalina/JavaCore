package lesson1;

public class Member {
    private String name;
    private int swimLimit;
    private int runLimit;
    private int jumpLimit;
    private boolean status;

    public Member(String name, int swimLimit, int runLimit, int jumpLimit) {
        this.name = name;
        this.swimLimit =  swimLimit;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        this.status = false;
    }

    public String getName() {
        return name;
    }

    public int getSwimLimit() {
        return swimLimit;
    }

    public int getRunLimit() {
        return runLimit;
    }


    public int getJumpLimit() {
        return jumpLimit;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
