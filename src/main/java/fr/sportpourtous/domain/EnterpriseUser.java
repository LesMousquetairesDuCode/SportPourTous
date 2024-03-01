package fr.sportpourtous.domain;

import fr.sportpourtous.domain.User;

public class EnterpriseUser extends User {
    private double discountRate; // Specific to enterprise users

    public EnterpriseUser(Long userId, String name, String email, double discountRate) {
        super(userId, name, email);
        this.discountRate = discountRate;
    }

    // Getter and setter for discountRate

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    // Additional methods specific to enterprise users
}

