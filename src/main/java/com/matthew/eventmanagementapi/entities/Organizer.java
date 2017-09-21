package com.matthew.eventmanagementapi.entities;

import javax.persistence.OneToMany;
import java.util.Objects;
import java.util.Set;

public class Organizer extends AbstractEntity {
    private String name;
    // set association - one organizer has many unique events
    @OneToMany(mappedBy = "organizer")     //inverse of the relationship -> 1:M (one organizer has many events
    private Set<Event> events;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        return Objects.equals(id, ((Organizer) obj).id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
