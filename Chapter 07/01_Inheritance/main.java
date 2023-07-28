/* Inheritance is onee of the key feature of object-oriented programming.
 * It allows us to derive new classes(subclasses)from an existing class (superclass).
 For Example:-
 class animal
 {
    //code of superclass
 }
 class dog extends animal
 {
    // code of subclass
 }
 Here we derived the dog class from the animal class.To derive a class,we use the extends keyword.
 The dog class inherits all the feature from the animal class.In addition to that we can add dog specific features to the dog class.


 class Animal {
  String name;

  public void eat() {
    System.out.println("I am an animal");
    System.out.println("I can eat");
  }
}

class Dog extends Animal {
  public void display() {
    System.out.println("My name is " + name);
  }
}

class main {
  public static void main(String[] args) {

    // create an object of the subclass
    Dog dog1 = new Dog();

    // access inherited superclass members
    dog1.name = "Fenton";
    dog1.eat();

    dog1.display();
  }
}


 Working:-
 1.we have inherited the dog class from the animal class.
 2.Inside the main class,we have created an object dog1 of the dog subclass.
 Dog dog1 = new Dog();
 3.Now,dog1 (object of the subclass) can access fields and methods of both the Dog class and Animal class.
 */

/* is-a Relationship :-
 In Java,inheritance is an is-a relationship.That is,we use inheritance only if there exists an is-a relationship between two classes.
 For example:-
* Rectangle is a polygon
* Orange is a fruit
* Dog is an animal

Here,Rectangle can inherit from polygon,orangecan inherit from fruit and dog can inherit from animal.
 */

class Animal {
    String name;

    public void eat() {
        System.out.println("I am an animal");
        System.out.println("I can eat");
    }
}

class Dog extends Animal {
    public void display() {
        System.out.println("My name is " + name);
    }
}

class main {
    public static void main(String[] args) {

        // create an object of the subclass
        Dog dog1 = new Dog();

        // access inherited superclass members
        dog1.name = "Fenton";
        dog1.eat();

        dog1.display();
    }
}