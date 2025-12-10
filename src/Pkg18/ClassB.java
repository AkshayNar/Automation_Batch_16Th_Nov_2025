package Pkg18;

public class ClassB extends ClassA{

    String nameB = "GlobalTech";
    String typeB = "Public Ltd";
    int establishedYearB = 2000;

    public void displayInfoGlobalTech() {
        System.out.println("Company Name: " + nameB);
        System.out.println("Company Type: " + typeB);
        System.out.println("Established Year: " + establishedYearB);
    }


    public static void main(String[] args) {

        ClassB b = new ClassB();
        int estYearA = b.establishedYearA;

        b.displayInfoForPersistent();
        System.out.println("-------------------------");
        b.displayInfoGlobalTech();


    }





}
