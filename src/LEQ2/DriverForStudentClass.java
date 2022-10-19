package LEQ2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DriverForStudentClass {

    public static void printHeader(){
        System.out.println("---------------------------------");
        System.out.println("\tLab Exercise 3-Q2");
        System.out.println("\tPrepared By:Ashton");
        System.out.println("\tStudent number: 3333333");
        System.out.println("\tGoal of this Exercise: Working with Comparators!");
        System.out.println("---------------------------------");
    }

    public static void myFooter(){
        System.out.println("======================================================= \nCompletion of Lab Exercise 3-Q2 is successful! Signing off - Ashton \n" +
                "=======================================================");
    }

    public static void main(String args[]){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student());
        printHeader();
        studentList.add(new Student("Harry" ,"Potter" ,75.5));
        studentList.add(new Student("Ronald","Weasley", 86.0));
        studentList.add(new Student("Hermione", "Granger" ,91.7));
        studentList.add(new Student("Parvati" , "Patil" , 93.75));
        System.out.println("Your score card");
        System.out.println(studentList.toString());
        System.out.println("Your score card in sorted order of marks");
        Collections.sort(studentList);
        System.out.println(studentList.toString());
        System.out.println("Your score card in sorted order of last names");
        Collections.sort(studentList , new HelperClassCompareLastNames());
        System.out.println(studentList.toString());
        System.out.println("Your score card in sorted order of first names");
        Collections.sort(studentList , new HelperClassCompareFirstNames());
        System.out.println(studentList.toString());
        myFooter();
    }
}