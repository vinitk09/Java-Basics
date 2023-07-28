/* Before we learn about method overriding,let's take an example.
 
class Animal {

  public void makeSound() {
    System.out.println("Making animal sound");
  }
}

class Dog extends Animal {
}

class main {
  public static void main(String[] args) {
    Dog dog1 = new Dog();
    dog1.makeSound();
  }
}

// Output: Making animal sound

Here,we have created an object dog1 of the Dog class.We then used the dog1 object to call the method makeSound()
Since the method is not present in the Dog class,the makeSound() method of the Animal superclass is called.



class Animal {

  public void makeSound() {
    System.out.println("Making animal sound");
  }
}

class Dog extends Animal {
  public void makeSound() {
    System.out.println("Woof woof");
  }
}

class main {
  public static void main(String[] args) {
    Dog dog1 = new Dog();
    dog1.makeSound();
  }
}

// Output: Woof woof


Here the same method makeSound() is present in both the Dog class and the Animal class.
Now,when we call the makeSound() method using the object of the Dog subclass,the method of the Dog class is called.
In this case,the makeSound() method of the Dog subclass overrides the same method of the Animal superclass.This is called method overriding (the subclass method overrides the superclass method).

# super keyword :-
 From the last example,we know that the method in the subclass overrides the same method in the superclass.

// Accessing the superclass method:-
If we need to access the superclass method from the subclass,we use the super keyword.
The super keyword is used to access the members(method and fields) of superclass from subclasses.
For example:-

 class Animal {

  public void makeSound() {
    System.out.println("Making animal sound");
  }
}

class Dog extends Animal {
  public void makeSound() {

    // access makeSound() of the Animal class
    super.makeSound();
    System.out.println("Woof woof");
  }
}

class main {
  public static void main(String[] args) {
    Dog dog1 = new Dog();
    dog1.makeSound();
  }
}

// Output:
// Making animal sound
// Woof woof
 */

class Animal {

    public void makeSound() {
        System.out.println("Making animal sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof woof");
    }
}

class main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.makeSound();
    }
}