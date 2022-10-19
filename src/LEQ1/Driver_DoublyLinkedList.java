package LEQ1;



public class Driver_DoublyLinkedList {

    public static void printHeader(){
        System.out.println("---------------------------------");
        System.out.println("\tLab Exercise 3-Q1");
        System.out.println("\tPrepared By:Ashton");
        System.out.println("\tStudent number: 3333333");
        System.out.println("\tGoal of this Exercise: Working with Doubly Linked List!");
        System.out.println("---------------------------------");
    }

    public static void myFooter(int labE_number, int q_number){
        System.out.println("======================================================= \nCompletion of Lab Exercise 3-Q1 is successful! Signing off - Ashton \n" +
                "=======================================================");
    }


    public static void main(String args[]){

        printHeader();

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

        System.out.println("The Node at 2 is :");
        System.out.println(yourFirstNameList.findNode(s2).getElement().toString());
        System.out.println("The Node at 3 is :");
        System.out.println(yourFirstNameList.findNode(s3).getElement().toString());
        System.out.println(String.format("Adding %s in between %s and %s" , s4.getFirstName() , s2.getFirstName() , s3.getFirstName()));
        yourFirstNameList.addInBetween(s4 , s2 , s3);
        System.out.println( yourFirstNameList.toString());
        myFooter(3 ,1);
    }
}
