package fr.sportpourtous.domain;

public class Category {
    private Long id;

    private String name;

    //@OneToMany(mappedBy = "category")
    private List<Sport> sports;

    // Constructors, Getters, and Setters...
}