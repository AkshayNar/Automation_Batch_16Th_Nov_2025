package Pkg31;

public class ClassA {


    public static void main(String[] args) {


        String a = "Hello";
        String b = "Hello";

        // == Compare the addereess
        System.out.println(a == b);   //true

        //equals() Compare the content
        System.out.println(a.equals(b)); //true

        //.equalsIgnoreCase() Compare the content ignoring case
        String c = "hello";
        String d = "HELLO";
        System.out.println(c.equals(d)); //false
        System.out.println(c.equalsIgnoreCase(d)); //true

        //,length() method   , returns type is int
        String e = "Hello World";
        System.out.println(e.length()); //11

        //.toUpperCase() method
        System.out.println(e.toUpperCase()); //HELLO WORLD

        //.toLowerCase() method
        System.out.println(e.toLowerCase()); //hello world

        //.indexOf() method
        System.out.println(e.indexOf("o")); //4

        //.replace() method
        System.out.println(e.replace('o', 'k')); //Hellk Wkrld

        //.replace() method
        System.out.println(e.replace("World", "Java")); //Hello Java


        //.endsWith() method
        System.out.println(e.endsWith("ld")); //true

        //.startsWith() method
        System.out.println(e.startsWith("He")); //true

        String f = "Hello";
        //.concat() method
        System.out.println(f.concat(" python")); //Hello python


        String g = "i_am_learning_java";
        //.split() method
        String[] parts = g.split("am");

        for(String part : parts) {
            System.out.println(part);
        }


        String h = "We are learning selenium";
        //.contains() method
        boolean check = h.contains("selenium");
        System.out.println(check);


        //.intern() method
        String i = new String("hello");   // non-constant pool
        String j = i.intern();            // constant pool
        System.out.println(i == j); // false
        String k = "hello";               // constant pool

        System.out.println(j == k);  // true




    }


}
