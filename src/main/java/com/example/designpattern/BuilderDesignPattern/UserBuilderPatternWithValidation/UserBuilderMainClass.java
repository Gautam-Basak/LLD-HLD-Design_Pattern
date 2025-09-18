package com.example.designpattern.BuilderDesignPattern.UserBuilderPatternWithValidation;

public class UserBuilderMainClass {

    public static void main(String[] args) {

        try {
            User user1 = new User.UserBuilder("John", "Doe")
                    .age(30)
                    .phone("1234567890")
                    .address("123 Main St")
                    .build();
            System.out.println(user1);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            User user2 = new User.UserBuilder("Jane", "Smith")
                    .age(25)
                    .build();

            System.out.println(user2);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // This will throw an exception
        try {
            User invalidUser = new User.UserBuilder("Test", "User")
                    .age(-5)
                    .build();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            User invalidUser1 = new User.UserBuilder("Test", "User")
                    .age(160)
                    .build();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
