package Pkg35;

public class ClassD {


    public static void main(String[] args) {

        //ClassA  - Super class
        //ClassB  - Sub class

        //Down casting

        ClassA  k = new ClassB();    // Upcating

        ClassB l = (ClassB) k;    //Expicite casting (Forcefull cating)

        l.methodA();
        l.methodB();
        System.out.println(l.a);
        

        //Example
     //   WebDriver driver = new ChromeDriver();

     //   driver = new FireFixDriver();

     //   ChromeDriver d1 = (ChromeDriver) driver;






    }

}
