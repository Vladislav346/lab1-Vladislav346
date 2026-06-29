package com.example.lab1.model;

public class Equipment {
    private Long id;
    private String name;
    private String description;

    public Equipment() {
    }

    public Equipment(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public String getDescription() { return description; }
}
