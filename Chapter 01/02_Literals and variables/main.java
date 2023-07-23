// * Literals are fixed values that we can use irectly in our program.For example- 5,-12,'c' etc.
// * Variables -> there are two things needed to create a Variable
//                1. Variable name - a unique name to indicate the variable.
//                2. Data type - the type of data variable can store

/*  Rules for naming  a variable 
1. A variable name can consist of alphabets,digits,dollar sign,and underscore.
2. A variable name cannot start with numbers.
3. A varibale name cannot be a keyword(reserve word used for syntax).For example int,double. 
 */

class main {
    public static void main(String[] arg) {
        int age = 24;
        System.out.println("age (before) : " + age);
        age = 18;
        System.out.println("age (after) : " + age);

    }
}