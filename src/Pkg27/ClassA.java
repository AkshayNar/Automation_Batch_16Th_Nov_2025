package Pkg27;

public abstract class ClassA {

    //Abstract method which don't have body
    abstract public void m1();


    public void m2(){
        System.out.println("This is a concrete method in abstract class");
    }

    public static final void m3() {
        System.out.println("This is a static final method in abstract class");
    }


}
