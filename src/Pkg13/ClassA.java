package Pkg13;

public class ClassA {


    public static void main(String[] args) {
        execute1();
    }




    public static void addFirst10Digits(){
        int sum=0;
        for(int i=1; i<=10; i++){
            sum = sum +i;
            System.out.println("Sum: "+ sum);
        }
        System.out.println("Sum of 10 Digit: "+ sum);
    }


    public static void execute1(){
        addFirst10Digits();
    }



}
