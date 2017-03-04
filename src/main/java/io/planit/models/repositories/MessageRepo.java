package io.planit.models.repositories;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.planit.models.Message;

@Transactional
@Repository
public interface MessageRepo extends CrudRepository<Message, Integer>{

	
	Message findByUid(int uid);
}
