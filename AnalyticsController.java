package com.example.lab1.model;

public class Building {
    private Long id;
    private String name;
    private String city;
    private String address;

    public Building() {
    }

    public Building(Long id, String name, String city, String address) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.address = address;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public String getCity() { return city; }
    public String getAddress() { return address; }
}
