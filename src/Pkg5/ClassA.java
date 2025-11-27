package Pkg5;

public class ClassA {


    public static void main(String[] args) {


        //Arithmetic Operators in Java

        int a = 20;
        int b = 30;

        //Addition
        int c = a + b;   //Addition operation

        System.out.println("Addition: " + c);  // 50

        //Subtraction
        int d = b - a;   //Subtraction operation

        System.out.println("Subtraction: " + d);  // 10

        //Multiplication
        int e = a * b;   //Multiplication operation

        System.out.println("Multiplication: " + e);  // 600

        //Division
        double f = (double) b / a;   //Division operation     -  1.5

        System.out.println("Division: " + f);

        //Modulus
        int g = b % a;   //Modulus operation  // 10

        System.out.println("Modulus: " + g);


        //Increment
      //  a++;   //Increment operation
      //  System.out.println("Incremented a: " + a);

        ++a;
        System.out.println("Incremented a again: " + a);


        //Decrement
       // b--;   //Decrement operation
      //  System.out.println("Decremented b: " + b);

        --b;
        System.out.println("Decremented b again: " + b);


        //
         // a++ and ++a
        

        int k = 40;
        int l = k++;    // Post-increment - Assign the current value first then increment
        System.out.println("Value of k: " + k);  // 41
        System.out.println("Value of l (k++): " + l);  // 40

        int m = 50;
        int n = ++m;    // Pre-increment - Increment first then assign the value
        System.out.println("Value of m: " + m);  // 51
        System.out.println("Value of n (++m): " + n);  // 51


        int p = 60;
        int q = p--;    // Post-decrement - Assign the current value first then decrement
        System.out.println("Value of p: " + p);  // 59
        System.out.println("Value of q (p--): " + q);  // 60

        int r = 70;
        int s = --r;    // Pre-decrement - Decrement first then assign the value
        System.out.println("Value of r: " + r);  // 69
        System.out.println("Value of s (--r): " + s);  // 69

    }



}
