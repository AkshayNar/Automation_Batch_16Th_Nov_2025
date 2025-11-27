package Pkg9;

public class ClassA {


    public static void main(String[] args) {


        int sum = 0;

        for(int i=1; i<=10; i++){
            if(i==6){
                System.out.println("Breaking for loop at "+ i);
                break;
            }
            sum = sum + i;
        }

        System.out.println("Sum :" + sum);

    }


}
