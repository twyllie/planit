package io.planit.models.repositories;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.planit.models.Event;

@Transactional
@Repository
public interface EventRepo extends CrudRepository<Event, Integer>{

	Event findByUid(int uid);
	
}
