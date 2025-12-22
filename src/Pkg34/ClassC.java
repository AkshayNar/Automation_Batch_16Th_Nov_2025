package Pkg34;

public class ClassC {

    public static void main(String[] args) {

      //  char a = 'A';


        // 1) Numeric to character

        byte a = 120;
        byte k = 88;

        char b = (char) a;
        char l = (char) k;

        System.out.println(b);
        System.out.println(l);


        //2) Character to numeric value

        char p = 'A';       // 2 byte
        int q = p;     // 4 byte
        System.out.println(q);

        byte m = (byte) p;     // 1 byte    //   -128 to 127
        System.out.println(m);




    }


}
