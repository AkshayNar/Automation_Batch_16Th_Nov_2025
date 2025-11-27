package Pkg9;

public class ClassB {

    //Continue statement

    public static void main(String[] args) {

        // Sum first 10 numbers except 5

        int sum =0;

        for(int i=1; i<=10; i++){
            if(i ==5 || i==7){
                continue;
            }
            sum = sum + i;
        }

        System.out.println("Sum :" + sum);

    }


}
