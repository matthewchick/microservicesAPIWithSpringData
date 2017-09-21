package com.matthew.eventmanagementapi.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Particpant extends AbstractEntity{

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String email;
    private Boolean checkedIn;
    // LAZY = fetch when needed
    // EAGER = fetch immediately
    @ManyToOne(fetch= FetchType.EAGER)
    @JoinColumn(referencedColumnName = "ID", nullable = false, updatable = false)
    private Event event;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getCheckedIn() {
        return checkedIn;
    }

    public void setCheckedIn(Boolean checkedIn) {
        this.checkedIn = checkedIn;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }


    @Override
    public boolean equals(Object obj) {
        return Objects.equals(id, ((Particpant) obj).id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
