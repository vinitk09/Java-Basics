
/* ArrayList Introduction :-
 The Arraylist class of the collection framework  provides the functionality of resizable-arrays.
 As we know,the size of the array must be declared before we can use it.And,once the size is declred,its hard to change it.

 To solve this issue,we can use the Arraylist class.It allows us to create arrays that can adjust the capacity when we add or remove elements from it.

 */
// import java.util.ArrayList;

// class main {
//     public static void main(String[] arg) {
//         // create an arraylist
//         ArrayList<String> languages = new ArrayList<>();

//         // add() method without the index parameter.
//         languages.add("Java");
//         languages.add("C");
//         languages.add("Python");

//         System.out.println("ArrayList: " + languages);

//     }
// }

// import java.util.ArrayList;

// class main {
//   public static void main(String[] args){

//     // create an ArrayList
//     ArrayList<String> languages = new ArrayList<>();

//     languages.add("Java");
//     languages.add("C");
//     languages.add("Python");
//     System.out.println("ArrayList: " + languages);

//    // add element at the second position
//    languages.add(1, "JavaScript");

//     System.out.println("Updated ArrayList: " + languages);
//   }
// }

// Output:
// ArrayList: [Java, C, Python]
// Updated ArrayList: [Java, JavaScript, C, Python]

// To access Elements from the array.
// import java.util.ArrayList;

// class main {
//     public static void main(String[] args) {

//         ArrayList<String> languages = new ArrayList<>();

//         // add elements
//         languages.add("Python");
//         languages.add("C");
//         languages.add("Java");
//         System.out.println("ArrayList: " + languages);

//         // access arraylist element
//         String element = languages.get(2);
//         System.out.println("Accessed Element: " + element);
//     }
// }

// To change elements from an ArrayList 
// import java.util.ArrayList;

// class main {
//     public static void main(String[] args) {

//         ArrayList<String> languages = new ArrayList<>();

//         // add elements
//         languages.add("Python");
//         languages.add("C");
//         languages.add("Java");
//         System.out.println("ArrayList: " + languages);

//         // change element at index 1
//         languages.set(1, "Kotlin");
//         System.out.println("Updated Arraylist: " + languages);
//     }
// }

// To remove elements from the array

// import java.util.ArrayList;

// class main {
//     public static void main(String[] args) {

//         ArrayList<String> languages = new ArrayList<>();

//         // add elements
//         languages.add("Python");
//         languages.add("Kotlin");
//         languages.add("Java");
//         System.out.println("ArrayList: " + languages);

//         // remove element at index 1
//         String element = languages.remove(1);
//         System.out.println("Removed Element: " + element);
//         System.out.println("Updated Arraylist: " + languages);
//     }
// }

// Example : ArrayList of Integer Type
// import java.util.ArrayList;

// class main {
//     public static void main(String[] args) {

//         // create an ArrayList of Integer type
//         ArrayList<Integer> languages = new ArrayList<>();

//         // add elements
//         languages.add(5);
//         languages.add(10);
//         languages.add(15);

//         System.out.println("ArrayList: " + languages);
//     }
// }

/* ArrayList Methods :-
 Commonly used Arraylist methods :-

 Method                             Description
 1.size()                       returns the length of the arraylist
 2.sort()                       sorts the elements of the arraylist
 3.contains()                   returns true if the specified element is present in the arraylist
 4.clear()                      removes all the elements of the arraylist
 5.isEmpty()                    returns true if the arraylist is empty 
 6.toString()                   converts the whole arraylist into a string and returns it.
 */

//  Iterate through ArrayList :-
import java.util.ArrayList;

class main {
    public static void main(String[] args) {

        ArrayList<String> languages = new ArrayList<>();

        // add elements
        languages.add("Python");
        languages.add("Kotlin");
        languages.add("Java");
        System.out.println("ArrayList: " + languages);

        System.out.println("ArrayList Elements:  ");

        // access elements one by one
        for (String language : languages) {
            System.out.println(language);
        }
    }
}