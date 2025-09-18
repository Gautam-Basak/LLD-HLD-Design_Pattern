package com.example.designpattern.BuilderDesignPattern.UserBuilderPatternWithValidation;

public class User {
    
    private final String firstName;    // required
    private final String lastName;     // required
    private final int age;             // optional
    private final String phone;        // optional
    private final String address;      // optional
    
    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }
    
    // Getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }
    
    @Override
    public String toString() {
        return "User: " + firstName + " " + lastName + 
               ", Age: " + age + 
               ", Phone: " + phone + 
               ", Address: " + address;
    }

    public static class UserBuilder{

        private final String firstName;
        private final String lastName;
        private int age = 0;
        private String phone = "";
        private String address = "";

         public UserBuilder(String firstName, String lastName) {
            if (firstName == null || lastName == null) {
                throw new IllegalArgumentException("First and last name cannot be null");
            }
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age(int age) {
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative");
            }
            this.age = age;
            return this;
        }
        
        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }
        
        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public User build(){
            User user = new User(this);
            validateUserObject(user);
            return user;
        }

        private void validateUserObject(User user) {
            // Do some basic validation
            if (user.getAge() > 150) {
                throw new IllegalArgumentException("Age cannot be more than 150");
            }
        }
    }
}
