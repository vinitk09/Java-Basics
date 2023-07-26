/* Previously, we learned to store a single data in a variable. Now we will laern about arrays which allow us to store multiple values at once.
 Array -> Collection of items of same data type stored at a contiguous memory locations.
 To access elements of an array, we use indexes which starts from 0.
 int data[]={12,19,2,8,3};
 Then, 
 1. The indexes of the first element is 0 . To access its value we use, data[0]. 
 2. The indexes of the second element is 1 . To access its value we use, data[1].
 
 To access the last element of the array we use data[n-1] where n is the size of the given array.
 */
// To print all the element of the array
class main {
    public static void main(String[] arg) {
        int data[] = { 12, 19, 2, 8, 3 };
        int size = data.length; // To calculate the size of the array. In this code the size is 5.
        for (int i = 0; i < size; i++) {
            System.out.println(data[i]);
        }
    }
}
// Things to remember :
// 1.Array indexes start from 0. That is, the first element of the array will be
// at position 0 and the last element of the array will be at size - 1.
// 2. we use length property to get the size of an array.

// Your task : Find the sum of elements in the array.
// Hint : sum = sum + data[i];