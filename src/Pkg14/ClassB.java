package Pkg14;

public class ClassB {

    public static void main(String[] args) {
        multiPlyGivenNumbers(5, 10);
        multiPlyGivenNumbers(5, "20");
        multiPlyGivenNumbers(2, 3, 4);

    }

    //Method Overloading
    public static void multiPlyGivenNumbers(int firstNumber, int secondNumber){
        int result = firstNumber * secondNumber;
        System.out.println("Multiplication Result: "+ result);
    }

    public static void multiPlyGivenNumbers(int firstNumber, String secondNumber){
        int result = firstNumber * Integer.parseInt(secondNumber);
        System.out.println("Multiplication Result: "+ result);
    }

    public static void multiPlyGivenNumbers(int firstNumber, int secondNumber, int thirdNumber){
        int result = firstNumber * secondNumber * thirdNumber;
        System.out.println("Multiplication Result: "+ result);
    }




}
