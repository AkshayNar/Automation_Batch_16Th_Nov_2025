package Pkg31;

public class ClassB {


    public static void main(String[] args) {

        String s = "Find elements using x path";

//        for(int i = s.length(); i>0; i--)
//        {
//            System.out.print(s.charAt(i-1));
//        }

//        String rev = "";
//        for(int i = s.length(); i>0; i--){
//            rev = rev + s.charAt(i-1);
//        }
//        System.out.println(rev);


        // path x using elements Find

        String[] arr = s.split(" ");

        for(int i = arr.length; i>0; i--){
            System.out.print(arr[i-1] + " ");
        }





    }

}
