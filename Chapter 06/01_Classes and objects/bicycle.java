/* Classes and Objects :-
Java is an object oriented programming language.

In object oriented  programming language (OOP), we solve a complex problem by dividing them into objects.

To work with objects,we need to do two things:-
1.create a class
2.create objects from the class


# Java Classes :-
Before we acn create objects,we need to define a class.It acts as a blueprint for the objects.
A class can contain:
1.fields - to store data.
2.methods - to perform task on fields.

Example:
class bicycle{
    //fields
    int gear = 5;
     
    //methods
    void applybreaks(){
        System.out.println("Applying Break.");
    }
}

# Java Objects:-
To access the fields and methods of a class we need to create objects of the class.
An object is called the instance of the class.

Syntax:
classname object = new classname();

Let's create an object from the bicycle class we created above:
bicycle bike1 = new bicycle();

Now,the bike1 objects acn access fields and methods of the class.We will see a working example of it.
 */
class bicycle {
    // fields
    int gear = 5;

    // methods
    void applybreaks() {
        System.out.println("Applying Breaks");
    }

    // main method
    public static void main(String[] arg) {
        // create object of bicycle
        bicycle bike1 = new bicycle();

        // access fields and methods
        System.out.println("No. of gears: " + bike1.gear);
        bike1.applybreaks();
    }
}