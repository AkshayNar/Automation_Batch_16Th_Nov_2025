package Pkg32;

public class ClassB {


    public static void main(String[] args) {


        int a = 10;
        int b = 0;
        int c = 0;
        try{
            c = a/b;  //Runtime Exception - Arithmetic Exception
        }catch (Exception e){
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Result is: " + c);


    }


}
