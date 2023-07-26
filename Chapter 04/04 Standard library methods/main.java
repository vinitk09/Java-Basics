/* Standard library Methods are built in methods that can be directly used in our program.
 For Example:-
 * println() - used to print.
 * sqrt() - computes the square root of a number.
 
 Library methods are bundled together inside a class and we can use them using the name of their class name.
 For example -  the method definition of sqrt() is inside the Math class.
 */
class main {

    public static void main(String[] arg) {
        int number = 25;
        double squareroot;
        squareroot = Math.sqrt(number);
        System.out.println(squareroot);

    }
}

/*
 * Similarly for pow() function - it computes the power of the number .
 * For example -
 * class main{
 * 
 * public static void main(String[] arg){
 * double power = Math.pow(5,2);
 * System.out.println(power);
 * }
 * }
 */