/*
 * In a hash table data structure,an element is a key/value pair.
 * keys - unique identifier that are associated with each value on a map.
 * Values - actual data that can be accessed using keys.
 * In Java,the HashMap class also provides the functionality of the hash table
 * data structure.
 * 
 * 
 * Adding Elements to HashMap :-
 * import java.util.HashMap;
 * 
 * class main {
 * public static void main(String[] args) {
 * 
 * // create a hashmap
 * HashMap<Integer, String> students = new HashMap<>();
 * System.out.println("Initial HashMap: " + students);
 * 
 * // put() method to add elements
 * students.put(1, "Jack");
 * students.put(5, "Jill");
 * students.put(3, "Miller");
 * System.out.println("Updated HashMap: " + students);
 * }
 * }
 * 
 * 
 * 
 * # Access HashMap :-
 * import java.util.HashMap;
 * 
 * class main {
 * public static void main(String[] args) {
 * 
 * // create a hashmap
 * HashMap<Integer, String> students = new HashMap<>();
 * 
 * // put() method to add elements
 * students.put(1, "Jack");
 * students.put(5, "Jill");
 * students.put(3, "Miller");
 * System.out.println("students: " + students);
 * 
 * // getting value of key 5
 * String value = students.get(5);
 * System.out.println("student (key 5): " + value);
 * }
 * }
 * 
 * 
 * #Change Hashmap Elements :-
 * import java.util.HashMap;
 * 
 * class main {
 * public static void main(String[] args) {
 * 
 * // create a hashmap
 * HashMap<Integer, String> languages = new HashMap<>();
 * languages.put(1, "Java");
 * languages.put(2, "Python");
 * languages.put(3, "C");
 * System.out.println("Original HashMap: " + languages);
 * 
 * // change value associated with key 3
 * languages.replace(3, "C++");
 * System.out.println("Updated HashMap: " + languages);
 * }
 * }
 * 
 * # Remove Hashmap elements :-
 * import java.util.HashMap;
 * 
 * class main {
 * public static void main(String[] args) {
 * 
 * // create a HashMap
 * HashMap<Integer, String> languages = new HashMap<>();
 * languages.put(1, "Java");
 * languages.put(2, "Python");
 * languages.put(3, "JavaScript");
 * System.out.println("HashMap: " + languages);
 * 
 * // remove element associated with key 3
 * String value = languages.remove(3);
 * System.out.println("Removed value: " + value);
 * 
 * System.out.println("Updated HashMap: " + languages);
 * }
 * }
 * 
 * 
 * # Iterate Through Hashmap :-
 * import java.util.HashMap;
 * 
 * class main {
 * public static void main(String[] args) {
 * 
 * // create a HashMap
 * HashMap<Integer, String> languages = new HashMap<>();
 * languages.put(5, "Java");
 * languages.put(10, "Python");
 * languages.put(15, "JavaScript");
 * 
 * 
 * // iterate through keys only
 * System.out.println("Elements: ");
 * for (Integer key : languages.keySet()) {
 * System.out.println(key + ": " + languages.get(key));
 * }
 * }
 * }
 * 
 */