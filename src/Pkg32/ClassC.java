package Pkg32;

public class ClassC {

    public static void main(String[] args) {


        String a = null;
        try {
            System.out.println(a.length());
        }
        catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }

        System.out.println("Value of a: " + a);



    }
}
