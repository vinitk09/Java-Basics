// print the object of a class
// class main {
//     public static void main(String[] arg) {

//         // create an object of data
//         main d1 = new main();

//         System.out.println(d1);
//     }
// }

// 2. Compute the area of a rectangle.
// class rectangle {
//     int length, breadth;

//     rectangle(int a, int b) {
//         this.length = a;
//         this.breadth = b;
//     }

//     // calculate area
//     public int getarea() {
//         int area = this.length * this.breadth;
//         return area;
//     }
// }

// class main {
//     public static void main(String[] arg) {
//         rectangle r = new rectangle(5, 8);
//         System.out.println("The area of the recatngle : " + r.getarea());

//     }
// }

// output : 40

// 3. Add two Complex number :-
class complex {
    private double real;
    private double img;

    public complex(double real, double img) {
        this.real = real;
        this.img = img;
    }

    public complex add(complex n2) {
        complex temp = new complex(0.0, 0.0);
        temp.real = this.real + n2.real;
        temp.img = this.img + n2.img;
        return temp;

    }

    public static void main(String[] arg) {
        complex n1, n2, result;
        n1 = new complex(2.9, 4.5);
        n2 = new complex(3.1, 5.0);

        // add complex numbers
        result = n1.add(n2);
        System.out.println("Sum = " + result.real + " " + result.img + "i");
    }
}
