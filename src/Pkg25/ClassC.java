package Pkg25;

public class ClassC extends ClassB{




    public void demo(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        ClassC obj = new ClassC();
        obj.demo();  // Calls ClassC's demo method

        ClassB objB = new ClassB();
        objB.demo();  // Calls ClassB's demo method
    }



}
