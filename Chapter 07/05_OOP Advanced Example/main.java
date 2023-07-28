/* 1.Access Attribute of the superclass 
 class Animal {
  String name = "Unknown";
}

class Dog extends Animal {

  // attribute with the same name
  String name = "Piper";

  public void display() {

    // print name field of its class
    System.out.println("name (Dog class): " + name);  // Piper

    // print name field of the superclass
    System.out.println("name (Animal class): " + super.name);  // Unknown
  }
}

class main {
  public static void main(String[] args) {
    Dog dog1 = new Dog();

    dog1.display();
  }
}


02.Access Constructor of the superclass:-
class Animal {

  // constructor
  Animal(String type) {
    System.out.println("Type: " + type);
  }
}

class Dog extends Animal {

  // constructor
  Dog() {
    // calls the constructor of Animal
    super("Mammal");
    System.out.println("I am a Dog");
  }
}

class main {
  public static void main(String[] args) {
    Dog dog1 = new Dog();
  }
}

// Output:
// Type: Mammal
// I am a Dog.


03.Implement two interfaces :-
interface Animal {
  public void printAnimalTraits();
}

interface Mammal {
  public void printMammalTriats();
}

class Dog implements Animal, Mammal {
  // implement printAnimalTraits()
  public void printAnimalTraits() {
    System.out.println("Can eat.");
  }

  // implement printMammalTriats()
  public void printMammalTriats() {
    System.out.println("Warm blood.");
  }
}

class main {
  public static void main(String[] args) {
    Dog dog1 = new Dog();

    dog1.printAnimalTraits();
    dog1.printMammalTriats();
  }
}

// Output:
// Can eat.
// Warm blood.
*/

interface Animal {
    public void printAnimalTraits();
}

interface Mammal {
    public void printMammalTriats();
}

class Dog implements Animal, Mammal {
    // implement printAnimalTraits()
    public void printAnimalTraits() {
        System.out.println("Can eat.");
    }

    // implement printMammalTriats()
    public void printMammalTriats() {
        System.out.println("Warm blood.");
    }
}

class main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();

        dog1.printAnimalTraits();
        dog1.printMammalTriats();
    }
}

// Output:
// Can eat.
// Warm blood.