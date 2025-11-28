package Pkg10;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassB {

    public static void main(String[] args) {
        //Students
        // Marks in subject

        int[][] marksOfStudents = {{90, 92, 85}, {75, 85, 65, 50},  {89, 92, 70}};

        String[] subjectName = {"Science", "Maths", "Social Science", "English"};

        System.out.println(marksOfStudents[1][1]);

        for(int i=0; i<marksOfStudents.length; i++){
            System.out.println("Student: "+ (i+1));
            for(int j=0; j<marksOfStudents[i].length; j++){
                System.out.println(subjectName[j] +": Marks: " + marksOfStudents[i][j]);
            }
        }

    }
}
