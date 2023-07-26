/* Java has several string methods readily available for us to use.This makes working with strings much easier.
  Methods                         Description
1.length()                     finds the length of the string
2.charAt()                     get character from a string
3.concat()                     join two string
4.equals()                     compare two strings
5.replace()                    replace character of a string

 */
// 1.length() :-
// class main {
//     public static void main(String[] args) {

//         String name1 = "Java";
//         String name2 = "is a good programming language";
//         int len = name1.length();
//         int len2 = name2.length();
//         System.out.println(len); // 4
//         System.out.println(len2); // 30
//     }
// }

// 2.charAt()

// class main {
//     public static void main(String[] args) {

//         String name1 = "Java";
//         String name2 = "is a good programming language";
//         // int len = name1.length();
//         // int len2 = name2.length();

//         System.out.println(name1.charAt(3)); // 4
//         System.out.println(name2.charAt(5)); // 30
//     }
// }

// 3.concat()
// class main {
//     public static void main(String[] args) {

//         String name1 = "Java";
//         String name2 = "is a good programming language";
//         System.out.println(name1.concat(name2)); // Java is a good programming language.
//     }
// }

// 3.replace()
class main {
    public static void main(String[] args) {

        String name1 = "Java";
        String name2 = "is a good programming language";
        String text = name1.replace('J', 'L'); // replaces the J alphabet with L.
        System.out.println(text); //
    }
}

// implement the equals() function by yourself and also check the return type of
// equals() function.
