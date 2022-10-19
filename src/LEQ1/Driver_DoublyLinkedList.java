package LEQ1;

public class Driver_DoublyLinkedList {

    public static void myHeader(int labE_number, int q_number){


    }

    public static void myFooter(int labE_number, int q_number){

    }


    public static void main(String args[]){

        myHeader(3 , 1);
        MyStudent s0, s1, s2, s3 , s4;
        DoublyLinkedList<MyStudent>yourFirstNameList = new DoublyLinkedList<>();
        s0  = new MyStudent();
        s1 = new MyStudent("Harry", 67.35);
        s2  = new MyStudent("Luna",
                87.5);
        s3  = new MyStudent("Vincent", 60.5);
        s4 = new MyStudent("Hermione", 89.2);
        yourFirstNameList.addLast(s0);
        yourFirstNameList.addLast(s1);
        yourFirstNameList.addLast(s2);
        yourFirstNameList.addLast(s3);
        yourFirstNameList.addLast(s4);
        System.out.println( yourFirstNameList.toString());
        myFooter(3 ,1);
    }
}
