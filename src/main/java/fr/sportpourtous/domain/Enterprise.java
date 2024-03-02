package fr.sportpourtous.domain;

import java.util.List;

public class Enterprise {
    private Long id;

    private String name;

    private Boolean isClient;

    private List<EnterpriseUser> employees;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getClient() {
        return isClient;
    }

    public void setClient(Boolean client) {
        isClient = client;
    }

    public List<EnterpriseUser> getEmployees() {
        return employees;
    }

    public void setEmployees(List<EnterpriseUser> employees) {
        this.employees = employees;
    }


    // Constructors, Getters and Setters...
}