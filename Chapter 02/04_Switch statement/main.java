/* The if else statement allows us to run a block of code among the multiple alternatives.
 In certain situation, we can replace an if...else statement with a switch statement.
 The advantage of using a switch statement is that it makes our code more readable.

 Example:-
 class main
{
    public static void main(String[] arg)
    {
        double a=42.5,b=6.5;
        char operator = '-';
        switch(operator)
        {
            case '+':
            System.out.println("Result = " + (a+b));
            break;
        
            case '-':
            System.out.println("Result = " + (a-b));
            break;
        
            case '*':
            System.out.println("Result = " + (a*b));
            break;
        
            case '/':
            System.out.println("Result = " + (a/b));
            break;
            default:
            System.out.println("Invalid Operator");
        }
    }
}

Quiz : Yoour task is to print the operation using input by the user.
 */
class main {
    public static void main(String[] arg) {
        double a = 42.5, b = 6.5;
        char operator = '-';
        switch (operator) {
            case '+':
                System.out.println("Result = " + (a + b));
                break;

            case '-':
                System.out.println("Result = " + (a - b));
                break;

            case '*':
                System.out.println("Result = " + (a * b));
                break;

            case '/':
                System.out.println("Result = " + (a / b));
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}