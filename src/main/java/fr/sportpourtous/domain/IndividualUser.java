package fr.sportpourtous.domain;

public class IndividualUser extends User {
    // Individual-specific attributes and methods

    public IndividualUser(Long userId, String name, String email) {
        super(userId, name, email);
    }

    // Additional methods specific to individual users
}