package Pkg36;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassA {


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Mumbai");
        list1.add("Delhi");
        list1.add("Bangalore");
        list1.add("Chennai");
        System.out.println(list1);



        ArrayList<Object> list2 = new ArrayList<>();
        list2.add(100);
        list2.add("India");
        list2.add(99.99);
        list2.add('A');
        list2.add(100);
        list2.add(Arrays.asList("One", "Two", "Three"));
        System.out.println(list2);



    }



}
