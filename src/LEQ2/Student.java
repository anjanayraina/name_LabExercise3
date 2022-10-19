package LEQ2;

import LEQ1.MyStudent;

import java.util.Comparator;

public class Student  implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private double score;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student(){
        firstName  = "General";
        lastName = "Name";
        score = 100;
    }

    public Student(String firstName , String lastName , double score){
        this.firstName = firstName;
        this.lastName= lastName;
        this.score  = score;
    }
    @Override
    public String toString(){
        return String.format("%s %s: %.2f" , firstName , lastName , score);
    }





    @Override
    public int compareTo(Student o2) {
        if(this.score < o2.score)return 1;
        else if(this.score > o2.score)return -1;
        return 0;
    }
}
