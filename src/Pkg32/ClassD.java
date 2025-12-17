package Pkg32;

public class ClassD {


    public static void main(String[] args) {

        String[] arr = {"Apple", "Banana", "Cherry"};


        System.out.println(arr[2]);

        try {
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds!");
        }

        System.out.println(arr[0]);

    }

}
