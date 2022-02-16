package lesson1;

public class Challenge {
    private String type;
    private int distance;

    public Challenge(String type, int distance){
        this.type = type;
        this.distance = distance;
    }

    public boolean isSuccesfull(Member member){
        if (this.type.equals("swimming")){
            return member.getSwimLimit() >= distance;
        }
        else if (this.type.equals("running")){
            return member.getRunLimit() >= distance;
        }
        else{
            return member.getJumpLimit() >= distance;
        }
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
