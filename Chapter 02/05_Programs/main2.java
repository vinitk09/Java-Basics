
// To print all the factors of a number.
import java.util.Scanner;

class main2 {
    public static void main(String[] arg) {
        int f = 1, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
        System.out.println("The factors of the number are : ");
        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                System.out.println(i);
            }
        }

        sc.close();

    }

}