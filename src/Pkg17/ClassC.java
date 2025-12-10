package Pkg17;

public class ClassC {

    String a = "Velocity";

    public static void main(String[] args) {
        methodA();
    }

    public static void methodA(){
        String a = "Selenium";

        System.out.println(a);  //Calling local variable

        ClassC obj = new ClassC();
        System.out.println(obj.a); //Calling global variable
    }
}
