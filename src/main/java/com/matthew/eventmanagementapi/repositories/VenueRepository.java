package com.matthew.eventmanagementapi.repositories;

import com.matthew.eventmanagementapi.entities.Event;
import com.matthew.eventmanagementapi.entities.Venue;
import org.springframework.data.repository.CrudRepository;

public interface VenueRepository extends CrudRepository<Venue, Long>{
}
