package Pkg17;

public class ClassB {

    String a = "Hello";   //non-static global variable
    static String b = "World";   //static global variable


    public static void main(String[] args) {
        methodA();
        methodB();
    }

    public static void methodA(){
        ClassB obj = new ClassB();  // It will load all non-static elements
        System.out.println(obj.a);
        System.out.println(b);
    }

    public static void methodB(){
        ClassB obj = new ClassB();
        System.out.println(obj.a);
        System.out.println(b);
    }


}
