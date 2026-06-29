package com.example.lab1.model;

import java.time.LocalDateTime;

public class Event {
    private Long id;
    private String title;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private EventStatus status;

    public Event() {
    }

    public Event(Long id, String title, LocalDateTime startTime, LocalDateTime endTime, EventStatus status) {
        this.id = id;
        this.title = title;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitle() { return title; }
    public LocalDateTime getStartTime() { return startTime; }
    public LocalDateTime getEndTime() { return endTime; }
    public EventStatus getStatus() { return status; }
}
