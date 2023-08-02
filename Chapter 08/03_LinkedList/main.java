/* The LinkedList class :-
 The Linkedlist class provides the functionality of a doubly linkedlist data structure in Java.
 A doubly linkedlist node consists of 3 fields.
 1.prev - store the address of the previous element.null for the first element.
 2.next - stores the address of the next element.null for the last elements
 3.Data - Stores the actusl data.
 */

// Add elements to linkedlist
//  import java.util.LinkedList;

// class main {
//   public static void main(String[] args) {

//     // create a LinkedList
//     LinkedList<String> languages = new LinkedList<>();

//     // add elements
//     languages.add("Java");
//     languages.add("C");
//     languages.add("JavaScript");
//     System.out.println("LinkedList: " + languages);

//     // add elements at the specified index
//     languages.add(1, "Python");
//     System.out.println("Updated  LinkedList: " + languages);
//   }
// }

// Access Elements from Linkedlist :-
// import java.util.LinkedList;

// class main {
//   public static void main(String[] args) {
//     LinkedList<String> languages = new LinkedList<>();

//     // add elements
//     languages.add("Python");
//     languages.add("Java");
//     languages.add("JavaScript");
//     System.out.println("LinkedList: " + languages);

//     // get the element
//     String str = languages.get(1);
//     System.out.print("Element at index 1: " + str);
//   }
// }

// Change elements of linkedList :-
// import java.util.LinkedList;

// class main {
//     public static void main(String[] args) {
//         LinkedList<String> languages = new LinkedList<>();

//         // add elements
//         languages.add("Java");
//         languages.add("Python");
//         languages.add("JavaScript");
//         System.out.println("LinkedList: " + languages);

//         // change the third element
//         languages.set(2, "Kotlin");
//         System.out.println("Updated LinkedList: " + languages);
//     }
// }

// Remove Elements from Linkedlist :-

// import java.util.LinkedList;

// class main {
//   public static void main(String[] args){

//     LinkedList<String> languages = new LinkedList<>();

//     // add elements
//     languages.add("Python");
//     languages.add("Kotlin");
//     languages.add("Java");
//     System.out.println("LinkedList: " + languages);

//     // remove the second element
//     String element = languages.remove(1);
//     System.out.println("Removed Element: " + element);
//     System.out.println("Updated LinkedList: " + languages);
//   }
// }

// Iterating through LinkedList 

// import java.util.LinkedList;

// class main {
//   public static void main(String[] args){

//     LinkedList<String> languages = new LinkedList<>();

//     // add elements
//     languages.add("Python");
//     languages.add("Kotlin");
//     languages.add("Java");
//     System.out.println("LinkedList: " + languages);

//     System.out.println("Access Each Element:  ");

//     // access elements one by one
//     for (String language : languages) {
//       System.out.println(language);
//     }
//   }
// }

// LinkedList as queue :-

import java.util.LinkedList;

class main {
    public static void main(String[] args) {
        LinkedList<String> languages = new LinkedList<>();

        // add elements
        languages.add("Python");
        languages.add("Java");
        languages.add("JavaScript");
        System.out.println("LinkedList: " + languages);

        // remove elements from the front
        String str1 = languages.poll();

        // print the removed element
        System.out.println("Removed Element: " + str1);

        System.out.println("LinkedList after poll(): " + languages);

        // add element at the back
        languages.offer("Swift");
        System.out.println("LinkedList after offer(): " + languages);
    }
}
