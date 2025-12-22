package Pkg33;

public class ClassC {


    public static void main(String[] args) throws ClassNotFoundException{
        loadDriver();
    }


    public static void loadDriver() throws ClassNotFoundException{

        Class.forName("lang.String");


    }


}
