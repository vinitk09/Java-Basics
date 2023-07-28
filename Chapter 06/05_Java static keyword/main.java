/* Static keyword :-
In our previous OOP example,we have created objects to access fields and methods. It is because fields and methods are associated with objects.
However,sometimes we want fields and methods that are common to all objects of a class.In such cases,we can use the static keyword to create static fields and methods.
for Example:-
class student {
    //static fields
    static String subject;

    // static method
    static void displaysubject(){

    }
}
 */
class student {
    // static field
    static String subject;

    static void displaysubject() {
        System.out.println("Subject: " + subject);
    }
}

class main {
    public static void main(String[] arg) {
        // access the static fields/method
        student.subject = "Computer Science";
        student.displaysubject();
    }
}