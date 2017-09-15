package com.matthew.eventmanagementapi.entities;

import java.util.Set;

public class Organizer extends AbstractEntity {
    private String name;
    // set association - one organizer has many unique events
    private Set<Event> events;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
