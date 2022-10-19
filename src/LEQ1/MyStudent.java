package LEQ1;

public class MyStudent {

    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    private double score;

    public MyStudent(){

        firstName = "General Name";
        score = 100;
    }

    public MyStudent(String firstName , double score){

        this.firstName = firstName;
        this.score = score;
    }
    @Override
    public String toString(){
        return String.format( "%s:% .2f" ,firstName , score);
    }
}
