package fr.sportpourtous.domain;

import java.util.Objects;

public class User {
    private UserId userId;
    private String firstName;

    private String lastName;
    private int age;
    private String email;
    private String numberBankAccount;

    public User(UserId userId, String firstName, String lastName, int age, String email, String password, String numberBankAccount ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.password = password;
        this.numberBankAccount = numberBankAccount;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNumberBankAccount() {
        return numberBankAccount;
    }

    public void setNumberBankAccount(String numberBankAccount) {
        this.numberBankAccount = numberBankAccount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userId, user.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + firstName + '\'' + lastName +
                ", age=" + age +
                ", email=" + email +
                '}';
    }
}
