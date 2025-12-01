package Pkg13;

public class ClassD {


    public static void main(String[] args) {
        ClassD obj = new ClassD();  // Object of classD
        obj.addTwoDigits();
    }


    public void addTwoDigits(){
        int a = 10;
        int b = 30;
        int c = a + b;
        System.out.println("Sum of two digits: "+ c);
    }


}
