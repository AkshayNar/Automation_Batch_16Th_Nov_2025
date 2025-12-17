package Pkg27;

public class ClassB extends ClassA{



    public void m1(){
        System.out.println("This is the implementation of abstract method m1");
    }

    public void m2(){
        System.out.println("This is the overridden concrete method m2 in ClassB");
    }

    public static void main(String[] args) {
        ClassB obj = new ClassB();
        obj.m1();
        obj.m2();
        ClassA.m3();
    }

}
