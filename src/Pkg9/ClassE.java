package Pkg9;

import java.util.Scanner;

public class ClassE {

    // Login functionality with user can enter 3 wrong password
    public static void main(String[] args) {
        String dbPassword = "admin1234";
        for(int i=1; i<=3; i++){
            Scanner scn = new Scanner(System.in);
            System.out.print("Enter password: ");
            String userPassword = scn.next();

            if(userPassword.equals(dbPassword)){
                System.out.println("Logged in successfully");
                break;
            }else{
                if(i ==3){
                    System.out.println("Account is loacked");
                    break;
                }
                System.out.println("try again");
            }
        }






    }


}
