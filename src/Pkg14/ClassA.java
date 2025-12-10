package Pkg14;

public class ClassA {


    public static void main(String[] args) {
        ClassA obj = new ClassA();
        obj.addTwoDigits(10, 30);
        obj.addTwoDigits(100, 30);

        studentDetails("Rahul", "Mumbai", 25);
        studentDetails("Anita", "Delhi", 22);
        studentDetails("John", "New York", 28);

    }

    //Parameterized Method
    public void addTwoDigits(int firstDigit, int secondDigit){
        int a = firstDigit;
        int b = secondDigit;
        int c = a + b;
        System.out.println("Sum: "+ c);
    }

    public static void studentDetails(String name, String city, int age){
        System.out.println("Name: "+ name);
        System.out.println("City: "+ city);
        System.out.println("Age: "+ age);
    }


}
