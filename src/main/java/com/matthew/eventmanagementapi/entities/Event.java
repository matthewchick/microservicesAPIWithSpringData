package com.matthew.eventmanagementapi.entities;

import javax.persistence.*;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class Event extends AbstractEntity {
    private String name;
    private String description;
    private ZonedDateTime startTime;
    private ZonedDateTime endTime;
    private ZoneId zoneId;
    private Boolean started;
    @OneToMany(fetch= FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Particpant> particpant;  //One particpant has many unique events
    @ManyToOne(fetch= FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(nullable = false)
    private Organizer organizer;   //set relation 1: M -> organizer : events
    @ManyToOne(fetch= FetchType.EAGER, cascade = CascadeType.ALL)

    private Venue venue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ZonedDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(ZonedDateTime startTime) {
        this.startTime = startTime;
    }

    public ZonedDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(ZonedDateTime endTime) {
        this.endTime = endTime;
    }

    public ZoneId getZoneId() {
        return zoneId;
    }

    public void setZoneId(ZoneId zoneId) {
        this.zoneId = zoneId;
    }

    public Boolean getStarted() {
        return started;
    }

    public void setStarted(Boolean started) {
        this.started = started;
    }

    public Organizer getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Organizer organizer) {
        this.organizer = organizer;
    }

    public Set<Particpant> getParticpant() {
        return particpant;
    }

    public void setParticpant(Set<Particpant> particpant) {
        this.particpant = particpant;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }
}
