package Pkg14;

public class ClassC {


    public static void main(String[] args) {
        int multiplyResult1 = multiPlyGivenNumbers(5, 10);
        System.out.println("Multiplication of two integers: " + multiplyResult1);

        int multiplyResult2 = multiPlyGivenNumbers(5, "20");
        System.out.println("Multiplication of integer and string: " + multiplyResult2);

        int multiplyResult3 = multiPlyGivenNumbers(2, 3, 4);
        System.out.println("Multiplication of three integers: " + multiplyResult3);
    }



    //Method Overloading
    public static int multiPlyGivenNumbers(int firstNumber, int secondNumber){
        int result = firstNumber * secondNumber;
        return result;
    }

    public static int multiPlyGivenNumbers(int firstNumber, String secondNumber){
        int result = firstNumber * Integer.parseInt(secondNumber);
        return result;
    }

    public static int multiPlyGivenNumbers(int firstNumber, int secondNumber, int thirdNumber){
        int result = firstNumber * secondNumber * thirdNumber;
        return result;
    }


}
