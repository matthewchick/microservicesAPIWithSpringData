package com.matthew.eventmanagementapi.repositories;

import com.matthew.eventmanagementapi.entities.Event;
import com.matthew.eventmanagementapi.entities.Particpant;
import org.springframework.data.repository.CrudRepository;

public interface ParticpantRepository extends CrudRepository<Particpant, Long>{
}
