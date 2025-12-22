package Pkg36;

import java.util.ArrayList;

public class ClassB {


    public static void main(String[] args) {

        //Methods of list
        ArrayList<Object> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        //[100,200,300]
        list.add(1, 500);
        //[100,500,200,300]
        System.out.println(list);
        list.add(2, "Mango");
        System.out.println(list);

        //Set
        //Replace the element at mentioned index
        list.set(2, "Apple");
        System.out.println(list);

        //remove - Remove element at particular index
        list.remove(1);
        System.out.println(list);
        list.remove("Apple");
        System.out.println(list);

        //Size - Get the size of the list
        int listSize = list.size();
        System.out.println(listSize);

        list.add("Mumbai");
        list.add("Delhi");
        list.add("Bangalore");
        System.out.println(list);

        //Print all elements using for loop
        //list index = size -1
        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i)+ ", ");
        }

        System.out.println("Printing all element using for each loop");
        //Print all elements using for each loop
        for(Object element : list){
            System.out.print(element + ", ");
        }

        //Contains - Check required element is present in list or not
        boolean isPresent = list.contains("Delhiee");
        System.out.println(isPresent);

        //is empty method
        System.out.println(list.isEmpty());

        int index = list.indexOf(300);
        System.out.println(index);

        list.clear();
        System.out.println(list);

    }

}
