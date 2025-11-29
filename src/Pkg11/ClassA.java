package Pkg11;

public class ClassA {


    public static int A;
    static int B;
    private static int C;
    protected static int D;


    public static void main(String[] args) {

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);

        method1();
        method2();
        method3();
        method4();

    }


    public static void method1(){
        System.out.println("Method1 called from ClassA");
    }

    static void method2(){
        System.out.println("Method1 called from ClassA");
    }

    private static void method3(){
        System.out.println("Method1 called from ClassA");
    }

    protected static void method4(){
        System.out.println("Method1 called from ClassA");
    }


}
