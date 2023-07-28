/* Interface Introduction :-
 In Java,an interface is fully abstract class.


 An interface 
 1.contain abstract methods
 2.cannot contain fields

 All the abstarct methods defined in the interface must be implemented by its subclasses.

 Basically,an interface defines a set of specification (abstract methods) that other classes must implement;
 they are similar to protocols.

 # Implementing interfaces:-

 // create an interface
interface Language {
  void getName(String name);
}

// implementing the interface in a class
class ProgrammingLanguage implements Language {

  // abstract method implementation
  public void getName(String name) {
    System.out.println("Language: " + name);
  }
}

class main {
  public static void main(String[] args) {

    ProgrammingLanguage language = new ProgrammingLanguage();
    language.getName("Java");
  }
}

// Output: Language: Java

In the above example,we have created an interface named language.It includes an abstract method getName().
The ProgrammingLanguage implements the interface and provides an implementation for the abstract mathod.
Note: We have'nt used the abstract keyword to specify the abstarct method inside an interface.It is not compulsory because interfaces cannot have regular methods.


 */
// create an interface
interface Language {
    void getName(String name);
}

// implementing the interface in a class
class ProgrammingLanguage implements Language {

    // abstract method implementation
    public void getName(String name) {
        System.out.println("Language: " + name);
    }
}

class main {
    public static void main(String[] args) {

        ProgrammingLanguage language = new ProgrammingLanguage();
        language.getName("Java");
    }
}