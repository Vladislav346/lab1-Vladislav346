package com.example.lab1.controller;

import com.example.lab1.model.Event;
import com.example.lab1.model.EventStatus;
import com.example.lab1.model.Organizer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/organizers")
public class OrganizerController {

    private Organizer stub() {
        return new Organizer(1L, "Vladyslav", "Tkachenko", "tkachenko@example.com", "+380501112233");
    }

    @PostMapping
    public ResponseEntity<Organizer> create() {
        return ResponseEntity.ok(stub());
    }

    @GetMapping
    public ResponseEntity<Organizer> getAll() {
        return ResponseEntity.ok(stub());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Organizer> getById(@PathVariable Long id) {
        return ResponseEntity.ok(stub());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Organizer> update(@PathVariable Long id) {
        return ResponseEntity.ok(stub());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        return ResponseEntity.ok("Organizer deleted");
    }

    @GetMapping("/{id}/events")
    public ResponseEntity<Event> getOrganizerEvents(@PathVariable Long id) {
        Event event = new Event(1L, "IT Conference", LocalDateTime.now(), LocalDateTime.now().plusHours(3), EventStatus.ACTIVE);
        return ResponseEntity.ok(event);
    }
}
