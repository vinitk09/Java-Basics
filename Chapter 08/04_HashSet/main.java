/* Java Hashset :-
 The Java Hashset class provides the functionality of mathematically set (no duplicate elements)
 */

// //  Add elements to a Hashset.
//  import java.util.HashSet;

// class Main {
//   public static void main(String[] args) {
//     HashSet<Integer> primeNumbers = new HashSet<>();

//     // add elements
//     primeNumbers.add(2);
//     primeNumbers.add(3);
//     primeNumbers.add(5);
//     System.out.println("HashSet: " + primeNumbers);
//   }
// }

/* Set Operation :-
Since Hashset implements the functionalities of a mathematical set,it is commonly used for performing set operation.
1.union set - The union of two sets a and B is a set of all elements in both set A and set B (Excluding duplicates).
2.Intersection set - The intersection of two set A and B is the set of all elements that is common in both set A and B.
3.Differnce of sets - The differnce between two sets A and B is the set of all elements that are in A but not in B.
*/
//1.Union set:-
// import java.util.HashSet;

// class main {
//   public static void main(String[] args) {
//     HashSet<Integer> numbers = new HashSet<>();
//     numbers.add(2);
//     numbers.add(4);
//     System.out.println("Set1: " + numbers);

//     HashSet<Integer> primeNumbers = new HashSet<>();
//     primeNumbers.add(2);
//     primeNumbers.add(3);
//     primeNumbers.add(5);
//     System.out.println("Set2: " + primeNumbers);

//     // Union of two sets
//     numbers.addAll(primeNumbers);

//     System.out.println("Union: " + numbers);
//   }
// }

// 2.Intersection Set
// import java.util.HashSet;

// class main {
//     public static void main(String[] args) {
//         HashSet<Integer> primeNumbers = new HashSet<>();
//         primeNumbers.add(2);
//         primeNumbers.add(3);
//         primeNumbers.add(5);
//         System.out.println("Set1: " + primeNumbers);

//         HashSet<Integer> oddNumbers = new HashSet<>();
//         oddNumbers.add(1);
//         oddNumbers.add(3);
//         oddNumbers.add(5);
//         System.out.println("Set2: " + oddNumbers);

//         // Intersection of two sets
//         oddNumbers.retainAll(primeNumbers);
//         System.out.println("Intersection: " + oddNumbers);
//     }
// }

// 3.Difference of sets:- 
import java.util.HashSet;

class main {
    public static void main(String[] args) {
        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        System.out.println("Set1: " + primeNumbers);

        HashSet<Integer> oddNumbers = new HashSet<>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        System.out.println("Set2: " + oddNumbers);

        // Difference between HashSet1 and HashSet2
        primeNumbers.removeAll(oddNumbers);
        System.out.println("Difference : " + primeNumbers);
    }
}