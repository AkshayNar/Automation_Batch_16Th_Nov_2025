package Pkg6;

public class ClassA {


    public static void main(String[] args) {


        int a = 40;
        int b = 20;

        //if statement
//        if(a < b)
//        {
//            System.out.println("a is greater than b");
//        }


        //if-else statement
//        if(a < b)
//        {
//            System.out.println("a is greater than b");
//        }
//        else
//        {
//            System.out.println("a is less than or equal to b");
//        }



        //ladder if-else statement or if-else-if statement
//        if(a < b){
//            System.out.println("a is greater than b");
//        }
//        else if(a == b)
//        {
//            System.out.println("a is less than b");
//        }
//        else{
//            System.out.println("a is equal to b");
//        }




        // Nested if-else statement
//        if(a >= b)
//        {
//            if(a == b){
//                System.out.println("a is equal to b");
//            }
//            else{
//                System.out.println("a is greater than b");
//            }
//        }





        String userName = "admin11";
        String password = "admin12";

        if(userName == "admin"){

            if(password == "admin123"){
                System.out.println("Logged in successfully");

            }else {
                System.out.println("Incorrect password");
            }

        }else {
            System.out.println("User not found");
        }



    }


}
