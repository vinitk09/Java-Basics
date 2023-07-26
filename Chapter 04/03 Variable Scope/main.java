/*
 * Any variable that is defined inside a method is local to it.when the method
 * ends ,these variables are destroyed.
 * For Example :-
 * class main{
 * // create a method
 * static void addnumber(int a,int b) // return type = int
 * {
 * int sum;
 * sum = a+b;
 * 
 * }
 * public static void main(String[] arg){
 * 
 * addnumber(4, 9);
 * System.out.println(sum);
 * 
 * }
 * }
 * 
 * Here the sum variable is defined inside the addnumber() method and this
 * varibale exist inside it.
 * That's why we are getting an error.
 * Note: If we need to use the value of the sum varible in the main() method,we
 * need to return the value using the return statement.
 */

/*
 * Block Scope :-
 * class main{
 * 
 * public static void main(String[] arg){
 * 
 * int number =10;
 * if(number>0)
 * {
 * boolean flag=true;
 * }
 * System.out.println(flag); //error
 * }
 * }
 * 
 * Here,the flag variable is defined inside curly braces of the if statement.
 * If you try to access flag from outside of the if statement we get an error.
 */