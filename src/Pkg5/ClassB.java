package Pkg5;

public class ClassB {


    public static void main(String[] args) {

        int a = 20;

        boolean result1 = a > 10;  //Condition 1
        boolean result2 = a > 30;  //Condition 2


        // AND Operator
        boolean andResult = result1 && result2; //
        System.out.println("AND Result: " + andResult);  // false

        //OR Operator
        boolean orResult = result1 || result2; //
        System.out.println("OR Result: " + orResult);  // false


        //NOT Operator
        boolean notResult = !result1; //
        System.out.println("NOT Result: " + notResult);  // false


    }


}
