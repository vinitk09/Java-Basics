/* Introduction to Method :-
=> A method is a block of code that performs a specific task.
Suppose we need to write a program to create a circle and color it.We can create two methods to solve this problem:
1.create a circle method
2.create a color method.
Example:-
 void printnumber(){
    System.out.println(34);
 }
 1.printnumber() is the name of the method.
 2.The code inside curly braces {} is the method body.
 3.void is the return type of the method.It means the function does not return any value.

 # Methods exist inside the class. 
 Example:-
 class main{
    // create a method
    static void printnumber()
    {
      System.out.println(34);
    }
    public static void main(String[] arg){
        //code
    }
 }

 Note:- 1.We have used the static keyword before our method . Static indicates our method belongs to the main class.
        2.We can also create  methods without the static keyword which we wil cover in later lessons.For now we will use static methods for simplicity. 
 */

class main {
    // create a method
    static void printnumber() {
        System.out.println(34);
    }

    public static void main(String[] arg) {
        printnumber();// calling the function
    }
}
