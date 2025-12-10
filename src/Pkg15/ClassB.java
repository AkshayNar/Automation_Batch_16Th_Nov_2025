package Pkg15;

public class ClassB {


    int a;
    int b;



    public ClassB(){     //Without parameter constructor
        a = 50;
        b = 40;
    }


    public ClassB(int a, int b){   //With parameter constructor
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {

        ClassB obj1 = new ClassB();    //Object created and constructor called
        System.out.println("Value of a: "+ obj1.a);
        System.out.println("Value of b: "+ obj1.b);

        ClassB obj2 = new ClassB(100, 200);   //Object created and constructor called
        System.out.println("Value of a: "+ obj2.a);
        System.out.println("Value of b: "+ obj2.b);

    }


}
