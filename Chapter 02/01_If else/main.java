/*  Decision Making :-
=> In programming,there may arise a situation where we may need to run a block of code among multiple alternatives .
For exmaple,assigning grades A,B,C based on the marks obtained by the student.
In such a situation we use the if statement to create programs that can make decision.
 */
class main {
    public static void main(String[] arg) {
        int number = 12;
        if (number > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Code outside if statement ");
        }
    }
}
// Here number>0 is true,the body of the if statement is executed
// and if the condition becomes false then the else condition will be executed.

// Quiz
// => write a program in java to check even or odd.(A number divisible by 2 is
// said to be even number and the number which not divisible by 2 is odd number)