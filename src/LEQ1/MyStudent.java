package LEQ1;

public class MyStudent {

    private String firstName;
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
