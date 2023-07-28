/* Abstract Method :-
 In Java we can create a method that doesn't have a body.These methods are called abstract methods.
 We use the abstract keyword to create abstract methods.
 For Example:-

 abstract void getArea();

 Here,getArea() is an abstract method.The body of an abstract method is replaced by ;.
 A class containing abstract methods must also be abstract .Otherwise,it will generate an error.

 # Abstract class :-
 Similar to abstract method we use the abstract keyword to declare an abstract class.For example,
 abstract class polygon{
    // code inside class
 }
 An abstract class cannot be instantiated.That is,we cannot create objects of an abstract class.
 For example:-
 // error code
 Polygon obj = new Polygon();

Here this code will generate an error because Polygon is an abstract class.

An abstract class can have both regular methods and abstract methods.


# Implementing abstract class/Method

abstract class Polygon {
  // abstract method
  abstract void getArea();

  // regular method
  void printSides(int side) {
    System.out.println("This polygon has " + side + " sides.");
  }
}

class Rectangle extends Polygon {

  // implement abstract method
  void getArea() {
    System.out.println("Area of Rectangle");
  }
}

class main {
  public static void main(String[] args) {

    // create object of Rectangle
    Rectangle obj = new Rectangle();

    // call regular method
    obj.printSides(4);

    // call abstract method
    obj.getArea();
  }
}
 */

abstract class Polygon {
    // abstract method
    abstract void getArea();

    // regular method
    void printSides(int side) {
        System.out.println("This polygon has " + side + " sides.");
    }
}

class Rectangle extends Polygon {

    // implement abstract method
    void getArea() {
        System.out.println("Area of Rectangle");
    }
}

class main {
    public static void main(String[] args) {

        // create object of Rectangle
        Rectangle obj = new Rectangle();

        // call regular method
        obj.printSides(4);

        // call abstract method
        obj.getArea();
    }
}