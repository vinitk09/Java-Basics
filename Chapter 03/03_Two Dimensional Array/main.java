/*In the previous lesson, we learned about arrays. The arrays we have seen so far are known as one-dimensional arrays.
 In Java, we can create an array of arrays. These arrays are known as two-dimensional arrays.
 # Create a 2-D array
 => Here's how we can create multidimensional arrays.
 int [][] data = new int[3][4];
 Here, data is a two dimensional array where each 3 element of the array is also an array that has 4 elements.
 hence the array can hold 12 elements in total. 
 */
class main {
    public static void main(String[] arg) {
        int[][] data = { { 12, 3 }, { 4, 19 }, { 2, 5 }, { 8, 3 } };
        int size = data.length; // To calculate the size of the array. In this code the size is 5.
        for (int[] inner : data) {
            for (int value : inner) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

    }
}
// The first loop will store the value of the first index i.e 12,3 and the next
// loop will print its data. Similarly for the next ietration.
// Your task : implement this logic using for loop.(In this code we have use for
// each loop)