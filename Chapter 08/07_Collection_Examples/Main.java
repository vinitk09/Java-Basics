/* Collection Example
 Here's a list of example :-
 1.convert an arraylist to array.
 2.check if a set is the subset of another set.
 3.Reverse the linkedlist Elements
 4.Compute Average of Arraylist elements.

 # convert an arraylist to array :-
 import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    ArrayList<String> languages = new ArrayList<>();

    // add elements to ArrayList
    languages.add("Java");
    languages.add("Python");
    languages.add("C++");
    System.out.println("ArrayList: " + languages);

    // define an array
    String[] arr = new String[languages.size()];

    // convert ArrayList to array
    languages.toArray(arr);
    System.out.println("Array elements: ");

    // print array elements
    for (String item : arr) {
      System.out.println(item);
    }
  }
}


# check if a set is the subset of another set.

import java.util.HashSet;

class Main {
  public static void main(String[] args) {

    // create a HashSet
    HashSet<Integer> numbers = new HashSet<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    System.out.println("Set1: " + numbers);

    // create another HashSet
    HashSet<Integer> primeNumbers = new HashSet<>();
    primeNumbers.add(2);
    primeNumbers.add(3);
    System.out.println("Set2: " + primeNumbers);

    // check if primeNumbers is a subset of numbers
    boolean result = numbers.containsAll(primeNumbers);

    if (result) {
      System.out.println("Set2 is a subset of Set1");
    }
    else {
      System.out.println("Set2 is not a subset of Set1");
    }
  }
}


# Reverse the linkedlist Elements.

import java.util.Collections;
import java.util.LinkedList;

class Main {
  public static void main(String[] args) {
    // Creating an LinkedList
    LinkedList<Integer> numbers = new LinkedList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    System.out.println("LinkedList: " + numbers);

    // reverse the order
    Collections.reverse(numbers);
    System.out.println("Reversed LinkedList: " + numbers);
  }
}

# Compute Average of Arraylist elements.

import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    ArrayList<Double> numbers = new ArrayList<>();

    double sum = 0.0, average;
    int length;

    // add elements to ArrayList
    numbers.add(5.6);
    numbers.add(-6.6);
    numbers.add(10.0);
    numbers.add(12.5);

    // number of elements
    length = numbers.size();

    // sum of elements
    for (double number: numbers) {
      sum += number;
    }

    // compute average
    average = sum/length;

    System.out.println("Average: " + average);
  }
}

// Average: 5.375

 */

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();

        double sum = 0.0, average;
        int length;

        // add elements to ArrayList
        numbers.add(5.6);
        numbers.add(-6.6);
        numbers.add(10.0);
        numbers.add(12.5);

        // number of elements
        length = numbers.size();

        // sum of elements
        for (double number : numbers) {
            sum += number;
        }

        // compute average
        average = sum / length;

        System.out.println("Average: " + average);
    }
}

// Average: 5.375
