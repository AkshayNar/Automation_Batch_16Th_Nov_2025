package Pkg8;

import java.util.Scanner;

public class ClassB {

    public static void main(String[] args) {

        String dbPin = "Oracle123";
        String enteredPin;
        int currentAttempt = 0;
        int maxAttempts = 3;

        Scanner scn = new Scanner(System.in);

        do{
            System.out.print("Enter PIN: " );
            enteredPin = scn.next();
            currentAttempt++;
            if(!enteredPin.equals(dbPin)){
                System.out.println("Entered wrong pin, try again..!");
            }
        }while (enteredPin != dbPin && currentAttempt < maxAttempts);



        if(enteredPin.equals(dbPin)){
            System.out.println("You can withdraw cash");
        }else{
            System.out.println("Max attempts reached, account is locked");
        }



    }




}
