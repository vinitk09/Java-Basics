// Copy one Array to another

class main1 {
    public static void main(String[] arg) {
        int data1[] = { 12, 19, 2, 8, 3 };

        int data2[] = data1;

        int size = data2.length; // To calculate the size of the array. In this code the size is 5.
        for (int i = 0; i < size; i++) {
            System.out.println(data2[i]);
        }
    }
}