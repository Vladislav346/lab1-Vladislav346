package com.example.lab1.model;

public class Hall {
    private Long id;
    private String name;
    private Integer capacity;
    private Integer floor;

    public Hall() {
    }

    public Hall(Long id, String name, Integer capacity, Integer floor) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.floor = floor;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public Integer getCapacity() { return capacity; }
    public Integer getFloor() { return floor; }
}
