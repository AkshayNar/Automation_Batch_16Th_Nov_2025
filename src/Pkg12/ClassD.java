package Pkg12;

import Pkg11.ClassA;

public class ClassD {


    public static void main(String[] args) {

        System.out.println(ClassA.A);    // Public
      //  System.out.println(ClassA.B);    // Default
      //  System.out.println(ClassA.C);    // Private
     //   System.out.println(ClassA.D);    // Protected


        ClassA.method1();   //Public
     //   ClassA.method2();   //Default
     //   ClassA.method3();   //Private
     //   ClassA.method4();   //Protected

    }



}
