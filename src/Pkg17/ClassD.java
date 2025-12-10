package Pkg17;

public class ClassD {

    static int a = 10;
    int b = 20;

    public static void methodA(){
        System.out.println(a);
      //  System.out.println(b); //Error: non-static variable b cannot be referenced from a static context
    }

    public void methodB(){
        System.out.println(a);
        System.out.println(b);
    }

}
