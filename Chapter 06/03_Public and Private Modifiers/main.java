/*
 * In this learn we will learn about two keywords: public and private
 * These keywords (access modifiers) determine whether a method/field can be
 * accessed from other classes or not.
 * 
 * 1.Private members can be accessed only from within the class.
 * 2.public members can be accessed from anywhere.
 * 
 * # Public Modifiers :-
 * class data{
 * //public field
 * public String name;
 * }
 * class main{
 * public static void main(String[] arg){
 * 
 * // create an object of data
 * data d1 = new data();
 * d1.name= "Java";
 * System.out.println(d1.name); // java
 * }
 * }
 * 
 * # Private Modifiers
 * 
 * class data{
 * //private field
 * private String name;
 * }
 * class main{
 * public static void main(String[] arg){
 * 
 * // create an object of data
 * data d1 = new data();
 * d1.name= "Java";
 * System.out.println(d1.name); // java
 * }
 * }
 * 
 * Inside the main class we have created an object of the data class and
 * accessed the name field.
 * Since the name field is private to the data class, it cannot be accessed from
 * the main class.That's why the program throws an error.
 * 
 * 
 */
