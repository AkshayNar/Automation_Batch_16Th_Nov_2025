package Pkg35;

public class ClassC {


    public static void main(String[] args) {

        ClassA  k = new ClassA();  // Super class object

        ClassB l = new ClassB();   // sub class object


        // Up casting
        ClassA p = new ClassB();
        p.methodA();
        System.out.println(p.a);

        //ChromeDriver driver = new ChromeDriver();  //

     //   WebDriver driver = new ChromeDriver();

      //  driver = new FireFixDriver();


    }

}
