/*  The process of converting the data in one type to another type is known as type casting.
for example -> conversion of int data to double.
 */

//  class main{
//     public static void main(String[] arg)
//     {
//         int num=18;
//         double sum ;
//         sum= num +4.5;
//         System.out.println("Sum : "+ sum ); // 22.5
//     }
//  }

// Here , 18 (int value) is converted automatically to 18.0 double value before it is added to 4.5.
// In this case,an int value (4 bytes) is converted to double value (8 bytes).
// This type of casting is known as widening type casting where smaller size type is converted to larger size.

class main {
    public static void main(String[] arg) {
        double num1 = 10.0, num2 = 10.99;
        // convert to int type
        int data1 = (int) num1;
        int data2 = (int) num2;
        System.out.println(data1); // 10
        System.out.println(data2); // 10
    }
}
// Here we are manually converting double values to int values by using (int)in
// front of the data.