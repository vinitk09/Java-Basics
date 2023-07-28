/* In Java, a constructor is similar to a method but does not have any return type.
When we create an object, a constructor is automatically called.
 class bicycle{

    // constructor
    bicycle(){
        //body
    }
 }

 Here,the constructor is:
 bicycle(){
    //body
 }

 # Things to notice:
 1.A constructor has the same names as the class name.
 2.It does'not have any return type.
 */

//  Example:-
class student {

   String name;
   int id;

   // constructor with parameters
   student(String student_name, int id) {
      this.name = student_name;
      this.id = id;
   }

   public static void main(String[] arg) {
      student s1 = new student("Alex", 1);
      student s2 = new student("Mary", 2);

      // printing fields
      System.out.println("Student 1 name: " + s1.name);
      System.out.println("Student 1 id: " + s1.id);

      System.out.println("Student 2 name: " + s2.name);
      System.out.println("Student 2 id: " + s2.id);
   }
}

/*
 * this refers to the curren object.
 * Note:- If a class doesn't have any constructor,Java automatically creates a
 * default constructor to assign default values.That is,int fields are assigned
 * with 0 and string fields are assigned null.
 */