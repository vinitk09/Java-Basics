/* In this chapter we will learn about two fundamental programming concepts:
* decision making - run different codes in different situation 
* loop - repeat a block of code as per our requirement.

# Comparison operator :-
=> A comparison operator compares two opernds (values and variables) and determine wheather the comparison is true or false 
consider this code:-
int number = 2;
boolean result = number > 6; // false

Here , > is a comparison operator . It is comparing 2 and 6 . Since " 2 is greater than 6" is wrong , the result is false.
int number = 2;
boolean result = number < 6; // true


# Logical operator :-
=> logical operator performs logical operations on values and variables.
There are three logical operators in java :

operator                Example                 Meaning
 
&&(AND)               exp1 && exp2            true if both exp1 and exp2 are true
 
||(OR)                exp1 || exp2           true if either exp1 and exp2 are true

!(NOT)                 !expression            true if expression is false and vice versa
 
 */

// && AND operator

// class main {
//     public static void main(String[] arg) {
//         int age = 24,salary = 950;
//         boolean result;
//         result = (age >=18 && salary>600);
//         System.out.println(result); //true


//         result = (age >=18 && salary>1000);
//         System.out.println(result); //false

//     }
// }

// ! NOT opeerator
class main {
    public static void main(String[] arg) {
        int age = 24;
        boolean result;
        result = !(age>=24);
        System.out.println(result); // false
    }
}


// now implement the OR operator . It's a quiz.

