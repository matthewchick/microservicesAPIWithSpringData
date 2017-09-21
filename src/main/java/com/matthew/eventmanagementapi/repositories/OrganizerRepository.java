package com.matthew.eventmanagementapi.repositories;

import com.matthew.eventmanagementapi.entities.Event;
import com.matthew.eventmanagementapi.entities.Organizer;
import org.springframework.data.repository.CrudRepository;

public interface OrganizerRepository extends CrudRepository<Organizer, Long>{
}
