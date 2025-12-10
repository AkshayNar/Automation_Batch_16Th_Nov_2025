package Pkg26;

public class ClassB {


    public static void main(String[] args) {

        Users user1 = new Users();
        user1.setName("Omkar");
        user1.setEmail("abc@gmail.com");
        user1.setAddress("Latur");
        user1.setPhoneNumber("456734897");
        user1.setPassword("admin123");



        Users user2 = new Users();
        user2.setName("John");
        user2.setEmail("efg@gmail.com");
        user2.setAddress("Pune");
        user2.setPhoneNumber("987654321");
        user2.setPassword("password456");

        Object[] userArray = {user1, user2};

        for(int i = 0; i < userArray.length; i++) {
            Users user = (Users) userArray[i];
            printUserDetails(user);
        }



    }


    public static void printUserDetails(Users user) {
        System.out.println("Name: " + user.getName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Address: " + user.getAddress());
        System.out.println("Phone Number: " + user.getPhoneNumber());
        System.out.println("Password: " + user.getPassword());
    }




}
