/*
 * As we know, loops over a block of code until the test condition is false.
 * However, sometimes we may need to terminate the loop immediately without
 * checking the test condition . in such cases, the break statement is used.
 * class main
 * {
 * public static void main(String[] arg)
 * {
 * for(int i=1;i<=5;i++)
 * {
 * System.out.println(i +" ");
 * if(i==4)
 * {
 * break;
 * }
 * }
 * }
 * }
 * 
 * # Continue statement -> The continue statement is used to skip the rest of
 * the code inside a loop for that current iteration.Loop does not terminate but
 * continues with next iteration.
 * class main
 * {
 * public static void main(String[] arg)
 * {
 * for(int i=1;i<=5;i++)
 * {
 * System.out.println(i +" ");
 * if(i%2==0)
 * {
 * continue;
 * }
 * }
 * }
 * }
 * output:
 * 1
 * 3
 * 5
 * 
 * # Break and continue :-
 * Break - ends the entire loop.
 * Continue - Skips the code after it for that iteration of the loop.
 */