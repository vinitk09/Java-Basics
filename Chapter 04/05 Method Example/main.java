/* 1. Add and multiply two numbers using method.
 * 2. Compute the sum of natural number using method.
 * 3. Check if a number is prime or not using method.
 */
// class main {
//     static int addnumber(int a, int b) {
//         int sum = a + b;
//         return sum;
//     }

//     static int product(int c, int d) {
//         int p = c * d;
//         return p;
//     }

//     public static void main(String[] arg) {
//         int add, prod;
//         add = addnumber(7, 8);
//         prod = product(3, 5);
//         System.out.println("The addition of two numbers :  " + add);
//         System.out.println("The product of two numbers :  " + prod);

//     }
// }

// Q.2
// class main {
//     static int naturalnumbersum(int n) {
//         int sum = 0;
//         for (int i = 1; i <= n; i++) {
//             sum = sum + i;
//         }
//         return sum;
//     }

//     public static void main(String[] arg) {
//         int add, prod;
//         add = naturalnumbersum(10);

//         System.out.println("The sum of natural number upto 10  :  " + add);

//     }
// }

// q.3

class main {
    static void primecheck(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        }
        if (c == 2) {
            System.out.println("Prime number");
        } else {
            System.out.println(" Not a Prime number");
        }
    }

    public static void main(String[] arg) {

        primecheck(10);

    }
}
// Your task is take the input from the user and check for the prime number.
