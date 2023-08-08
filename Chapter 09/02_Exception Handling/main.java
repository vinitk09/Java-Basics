
/* # Java Exception Handling :-
 1. try... catch block is used to catch and throw exception.Its synatx is :
 try {
    // code that might cause exception
 }
 catch (Exception e) {
    // code that runs if exceptions occurs.
 }

 Here is how try... catch block works:-
 * The code that might generate an exception is placed inside the try block
 * if an exception occurs,the code inside the catch block is executed .
 * however if an exception do not occurs,the catch block is skipped.

 Example:-

 import java.util.Scanner;
 class main{
    public static void main(String[] args)
   { int numerator ,denominator;
    double result;
    
    // take input

    System.out.println("Enter numerator and denominator");
    Scanner input = new Scanner(System.in);
    numerator = input.next.Int();
    denominator = input.next.Int();
    try{
        result = numerator / denominator;
        System.out.println("Result: " + result);
    }
    catch(Exception e){
        System.out.println("Denominator cannot be zero .");
        System.out.println("Exception: " + e);
    }
 }
}



# Java finally block :-
The try statement can also have an optional finally block.
The finally block is always executed; it does'nt matter whether an exception is occurred or not.
The basic syntax of the finally block is :-
try{
    // code
}
catch(Exception e){
    // code
}
finally{
    // code
}

# Example :-
class main{
    public static void main(String[] args)
    {
        // create an array
        int []arr = {1,2,3};
        try{
            System.out.println("Array elements:");
            for(int i=0; i<=3; i++){
                System.out.println(arr[i]);
            }
        }
        catch(Exception e){
            System.out.println("Inside catch :-");

            // print the exception message
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Finally:Always Executed");
        }
    }
}


 */
// import java.util.Scanner;

// class main {
//     public static void main(String[] args) {
//         int numerator, denominator;
//         double result;

//         // take input

//         System.out.println("Enter numerator and denominator");
//         Scanner input = new Scanner(System.in);
//         numerator = input.nextInt();
//         denominator = input.nextInt();
//         try {
//             result = numerator / denominator;
//             System.out.println("Result: " + result);
//         } catch (Exception e) {
//             System.out.println("Denominator cannot be zero .");
//             System.out.println("Exception: " + e);
//         }
//     }
// }

class main {
    public static void main(String[] args) {
        // create an array
        int[] arr = { 1, 2, 3 };
        try {
            System.out.println("Array elements:");
            for (int i = 0; i <= 3; i++) {
                System.out.println(arr[i]);
            }
        } catch (Exception e) {
            System.out.println("Inside catch :-");

            // print the exception message
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally:Always Executed");
        }
    }
}
