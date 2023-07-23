/* An operator is a special Symbol that carries out operation on values and variables. For example 
1. - is an operator that performs subtraction.
In these we will cover these two types of operator
1. assignment operator
2. arithemtic operator
 
 */

// Assignment operator
// class main {
//     public static void main(String[] arg) {
//         int num1=10,num2=24;
//         System.out.println("num1 (before):  " + num1);
//         // assign value of num2 to num1
//         num1=num2;
//        System.out.println("num1 (before):  " + num1);
//     }
// }

// Arithematic operator (+,-,*,/,%)

// import java.util.Scanner;

// class main {
//     public static void main(String[] arg) {
//         Scanner sc = new Scanner(System.in);
//         int num1, num2, sum;
//         System.out.println("Enter num1 ");
//         num1 = sc.nextInt();
//         System.out.println("Enter num2 ");
//         num2 = sc.nextInt();
//         sum = num1 + num2;
//         System.out.println("The sum of num1 and num2 are : " + sum);
//     }

// }

// import java.util.Scanner;

// class main {
//     public static void main(String[] arg) {
//         Scanner sc = new Scanner(System.in);
//         int num1, num2, product;
//         System.out.println("Enter num1 ");
//         num1 = sc.nextInt();
//         System.out.println("Enter num2 ");
//         num2 = sc.nextInt();
//         product = num1 * num2;
//         System.out.println("The product of num1 and num2 are : " + product);
//     }

// }

// import java.util.Scanner;

// class main {
//     public static void main(String[] arg) {
//         Scanner sc = new Scanner(System.in);
//         int num1, num2, quotient;
//         System.out.println("Enter num1 ");
//         num1 = sc.nextInt();
//         System.out.println("Enter num2 ");
//         num2 = sc.nextInt();
//         quotient = num1 / num2;
//         System.out.println("The quotient is  : " + quotient);
//     }

// }

// import java.util.Scanner;

// class main {
//     public static void main(String[] arg) {
//         Scanner sc = new Scanner(System.in);
//         int num1, num2, remainder;
//         System.out.println("Enter num1 ");
//         num1 = sc.nextInt();
//         System.out.println("Enter num2 ");
//         num2 = sc.nextInt();
//         remainder = num1 % num2;
//         System.out.println("The remainder is : " + remainder);
//     }

// }

/*  operator       example           same as
   1. +=           a+=b              a=a+b;
   2. -=           a-=b              a=a-b;
   3. *=           a*=b              a=a*b;
   4. /=           a/=b              a=a/b;
   5. %=           a%=b              a=a%b;
 */

//   Unary operator (++, --):-
class main {
    public static void main(String[] arg) {
        int num = 18;
        // increase value of num by 1
        num++;
        System.out.println("num : " + num); // 19

        // decrease value of num by 1
        // num--;
        // System.out.println("num : "+ num );

    }
}
