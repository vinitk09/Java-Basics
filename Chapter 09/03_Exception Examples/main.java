/* Exception Handling examples :-
 1. Multiple catch blocks
 2. Multiple Exception in a single catch block.

 # Multiple catch block :-
 A try block can have multiple catch blocks which can be used to handle multiple exceptions differently. 

 Example :-

 class main{
    public static void main(String[] args){
        int [] arr = new int[10];
        try{
            arr[10] = 11;
        }
        catch(NumberFormatException e1)
        {
            System.out.println("NumberFormatException: " + e1.getMessage());
        }
        catch(IndexOutOfBoundsException e2)
        {
            System.out.println("IndexOutOfBoundsException:" + e2.getMessage());
        }
    }
 }





 # Catch multiple exceptions :-
 A catch block can be used to
 * handle all exceptions
 * one specific exception
 * one or more exceptions but not all exceptions.
 * 
 * Example :-
 class main{
    public static void main(String[] args){
        try{
            int array[] = new int[10];
            // throws Arithematic Exception
            array[20] = 30;
        }
        catch(ArithematicException | ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
 }
  */

class main {
    public static void main(String[] args) {
        try {
            int array[] = new int[10];
            // throws Arithematic Exception
            array[20] = 30;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}