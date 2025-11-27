package Pkg10;

import java.util.Arrays;

public class ClassA {


    public static void main(String[] args) {


        //First way to declare and instantiate array
        int[] a = new int[5];


        //Second way to declare instantiate and initialize array
        int[] b = {10,20,30,40,50, 45};

        System.out.println(b.length);

        System.out.println(b[2]);

        b[3] = 100;

        System.out.println(b[3]);

      //  System.out.println(Arrays.toString(b));

        //Print all elements of an array using for loop
        for(int i=1; i<=b.length; i++){
            System.out.println(b[i-1]);
        }

        //Print all elements of an array using for each loop
        for(int k: b){
            System.out.print(k +" ");
        }


    }


}
