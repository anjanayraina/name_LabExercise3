package LEQ2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DriverForStudentClass {

    public static void main(String args[]){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student());
        studentList.add(new Student("Harry" ,"Potter" ,75.5));
        studentList.add(new Student("Ronald","Weasley", 86.0));
        studentList.add(new Student("Hermione", "Granger" ,91.7));
        studentList.add(new Student("Parvati" , "Patil" , 93.75));
        System.out.println(studentList.toString());
        Collections.sort(studentList);
        System.out.println(studentList.toString());
        Collections.sort(studentList , new HelperClassCompareLastNames());
        System.out.println(studentList.toString());
        Collections.sort(studentList , new HelperClassCompareFirstNames());
        System.out.println(studentList.toString());
    }
}