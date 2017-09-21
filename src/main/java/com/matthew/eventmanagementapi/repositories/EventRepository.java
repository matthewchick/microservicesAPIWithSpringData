package com.matthew.eventmanagementapi.repositories;

import com.matthew.eventmanagementapi.entities.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Long>{
}
