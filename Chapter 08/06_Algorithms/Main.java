/*
 * Algorithm Introduction :-
 * The Java collection framework provides static methods that provide the
 * functionality of different types of algorithms.
 * These methods are used to manipulate data stored in different types of
 * collection.
 * 
 * Here's a list of popular methods for different operation:-
 * 1.sort() - sorts the elements
 * 2.shuffle() - shuffle the elements to destroy any kind of order.
 * 3.binarysearch() - searches for the specified elements.
 * 4.min()/max() - finds the minimum and maximum elements.
 * 
 * 
 * # Sorting Algorithms :-
 * import java.util.ArrayList;
 * import java.util.Collections;
 * 
 * class Main {
 * public static void main(String[] args) {
 * 
 * // Creating an ArrayList
 * ArrayList<Integer> numbers = new ArrayList<>();
 * 
 * // Add elements
 * numbers.add(4);
 * numbers.add(2);
 * numbers.add(3);
 * System.out.println("Unsorted ArrayList: " + numbers);
 * 
 * // sorting the arraylist
 * Collections.sort(numbers);
 * System.out.println("Sorted ArrayList: " + numbers);
 * 
 * }
 * }
 * 
 * # Shuffling Algorithm :-
 * import java.util.ArrayList;
 * import java.util.Collections;
 * 
 * class Main {
 * public static void main(String[] args) {
 * 
 * // Creating an array list
 * ArrayList<Integer> numbers = new ArrayList<>();
 * 
 * // Add elements
 * numbers.add(1);
 * numbers.add(2);
 * numbers.add(3);
 * System.out.println("Sorted ArrayList: " + numbers);
 * 
 * // Using the shuffle() method
 * Collections.shuffle(numbers);
 * System.out.println("ArrayList using shuffle: " + numbers);
 * 
 * }
 * }
 * 
 * # Searching Algorithms :-
 * import java.util.Collections;
 * import java.util.ArrayList;
 * 
 * class Main {
 * public static void main(String[] args) {
 * 
 * // creating an ArrayList
 * ArrayList<Integer> numbers = new ArrayList<>();
 * numbers.add(1);
 * numbers.add(2);
 * numbers.add(3);
 * 
 * // search for element 3
 * int pos = Collections.binarySearch(numbers, 3);
 * System.out.println("Position of 3 is " + pos);
 * }
 * }
 * 
 * // Output: Position of 3 is 2
 * 
 * 
 * # Min and max element :-
 * 
 * import java.util.Collections;
 * import java.util.ArrayList;
 * 
 * class Main {
 * public static void main(String[] args) {
 * 
 * // creating an ArrayList
 * ArrayList<Integer> numbers = new ArrayList<>();
 * numbers.add(9);
 * numbers.add(2);
 * numbers.add(7);
 * System.out.println("ArrayList: " + numbers);
 * 
 * // find the minimum element
 * int min = Collections.min(numbers);
 * System.out.println("Minimum Element: " + min);
 * 
 * // find the maximum element
 * int max = Collections.max(numbers);
 * System.out.println("Maximum Element: " + max);
 * }
 * }
 * 
 */
