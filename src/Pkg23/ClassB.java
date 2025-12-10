package Pkg23;

public class ClassB extends ClassA{


    public void demo()
    {
        System.out.println("Hello");
    }


    public static void main(String[] args) {
        ClassB x = new ClassB();
        x.demo();

        ClassA y = new ClassA();
        y.demo();
    }

}
