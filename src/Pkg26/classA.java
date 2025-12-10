package Pkg26;

public class classA {

    public static void main(String[] args) {

        Users user = new Users();
        String userName = user.getName();
        System.out.println("User Name: " + userName);

        user.setName("Omkar");
        System.out.println("Updated User Name: " + user.getName());

        user.setAddress("Latur");
        user.setEmail("abc@gmail.com");
        user.setPhoneNumber("456734897");
        user.setPassword("admin123");

        System.out.println("User Details:");
        System.out.println("Name: " + user.getName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Address: " + user.getAddress());
        System.out.println("Phone Number: " + user.getPhoneNumber());



    }


}
