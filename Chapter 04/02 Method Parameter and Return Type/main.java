/*We can also pass value to a method.These values we pass to a method are known as argument.
 * Example :-
 */
// class main{
//     // create a method
//     static void printnumber(int number)
//     {
//       System.out.println(number);
//     }
//     public static void main(String[] arg){
//         int n=10;
//         printnumber(n);
//     }
//  }
/*  Working :-
 1.printnumber() method is called with n(10) as an argument.
 2.this value is accepted by the number parameter inside printnumber().
 3.If we print number inside printnumber(),we get 10.

 Note:- The type of value we pass during the function call and the function definition must match.
 */
//  Return Type:-
// class main{
//     // create a method
//     static int addnumber(int a,int b) // return type = int
//     {
//       int sum;
//       sum = a+b;
//       return sum;
//     }
//     public static void main(String[] arg){
//         int result;
//         result=addnumber(4, 9);
//         System.out.println(result);

//     }
//  }
/*Things to notice :-
 1.Before,the return type of the method was void . it means the method didn't return any value.
 2.Now,the return type is int. Meaning,the method must return int value.
 3.To return the value,we have used the return statement : return sum; 
 */

// Program - Check Odd or even:

class main {
    // create a method
    static boolean oddevencheck(int a) // return type = int
    {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] arg) {
        boolean result;
        result = oddevencheck(4);
        System.out.println(result);

    }
}
/*
 * Advantages of using Methods:-
 * 1.It makes our code reusable.we can call the same method again and again as
 * per our needs.
 * 2.Our code is easier to undersatnd and maintain.
 * 3.It allows us to divide a larger program into smaller subprograms.So a
 * larger project can be divided among team member.
 */