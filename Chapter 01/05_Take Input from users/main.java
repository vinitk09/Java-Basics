// import java.util.Scanner;

// class main {
//     public static void main(String[] arg) {
//         // create object of scanner
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter an integer : ");

//         // take int input
//         int data = input.nextInt();
//         System.out.println("Input Data :" + data);

//         // close scanner
//         input.close();
//     }
// }

// Take text input
// => To take a text input,we use the nextLine() method. 
import java.util.Scanner;

class main {
    public static void main(String[] arg) {
        // create object of scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text : ");

        // take int input
        String data = input.nextLine();
        System.out.println("Input Data :" + data);

        // close scanner
        input.close();
    }
}