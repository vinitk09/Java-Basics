/*In programming, loops are used to repeat a block of code.
There are three types of loops in Java programming.
1.for loop
2.while loop
3.do while loop

# for loop :-
class main
{
    public static void main(String[] arg)
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(i +" ");
        }
    }
}
Output :-
1
2
3
4
5
 Note:- for(int i=1;;i++)
 This will run the infinte loop.


 #While Loop :-
 //To print the sum of natural numbers using while loop
 class main
{
    public static void main(String[] arg)
    {
        int i=1 , sum=0;
        while(i<=10)
        {
            sum=sum+i;
            i++;
            
        }
        System.out.println(sum +" ");
    }
}

# Do-While loop :-
//To print the sum of natural numbers using do-while loop
 class main
{
    public static void main(String[] arg)
    {
        int i=1, sum=0;
       do
        {
            sum=sum+i;
            i++;
            
        } while(i<=10);
        System.out.println(sum +" ");
    }
}

 */
class main {

    public static void main(String[] arg) {
        int i = 1, sum = 0;
        do {
            sum = sum + i;
            i++;

        } while (i <= 10);
        System.out.println(sum + " ");
    }
}