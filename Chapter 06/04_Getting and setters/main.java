/* As we know, we cannot access private members from outside of a class.To access private members of a class,we can create getters and setters methods.
 * Getters and setters methods are used to get and set values of private fields.For example,
 class test{
    //private variable
    private String name;

    // getter method
    public String getname(){
        return this.name;
    }

    // setter method
    public void setname(String name)
    {
        this.name=name;
    }
 }
 class main{
    public static void main(String[] arg)
    {
        // create an object of test
        test t1 = new test();

        // access the private variable.
        t1.setname("Java programming");
        System.out.println(t1.getname());
    }
 }

 Output : Java programming

 Working :- 
* Inside the main class 
1. t1 is an object of the test class.
2.t1.setname() calls the public setname() method of the test class.
3.t1.getname() calls the public getname() method of the test class.

* Inside the test class 
1.setname() sets the value of the private name field to "Java programming".
2.getname() returns the value of the name field.


# Java this keyword :-
In java,this keyword is used to refer to the current object inside a method or a constructor.For example,
class main{
    int a;
    main(int a){
        this.a=a;

        //print this keyword
        System.out.println("this refrence = "+ this);
    }
    public static void main(String[] arg)
    {
        // call the constructor
        main obj = new main(8);

        //print the object
        System.out.println("Object reference  = " + obj);
    }
}
 */
class main {
    int a;

    main(int a) {
        this.a = a;

        // print this keyword
        System.out.println("this refrence = " + this);
    }

    public static void main(String[] arg) {
        // call the constructor
        main obj = new main(8);

        // print the object
        System.out.println("Object reference  = " + obj);
    }
}

/*
 * When we print obj and this,we get the same output.
 * this refrence = main@15db9742
 * Object reference = main@15db9742
 * It means this is nothing but a reference to the current object accessing the
 * method/constructor.
 */
