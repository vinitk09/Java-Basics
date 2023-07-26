/*In the last lesson, we used a for loop to access array elements.
 In Java, there is another version of for loop that makes it really easy to work with arrays.It is known as the for-each loop.
 # Syntax:-
 for(datatype item : array){
    // code inside loop
 }
 Here,
 1. array - an array
 2. item - each element of the array is assigned to this variable one by one.
 3. datatype - the data type of the array.
 */
class main {
    public static void main(String[] arg) {
        int[] data = { 12, 19, 2, 8, 3 };
        // int size = data.length; // To calculate the size of the array. In this code
        // the size is 5.
        for (int i : data) {
            System.out.println("number = " + i);
        }
    }
}