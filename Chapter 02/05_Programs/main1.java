
// To print the factorial of the given number
import java.util.Scanner;

class main1 {
    public static void main(String[] arg) {
        int f = 1, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        System.out.println("The Factorial of the number is " + f);
        sc.close();

    }

}