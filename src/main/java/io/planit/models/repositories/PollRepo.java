package io.planit.models.repositories;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.planit.models.Poll;

@Transactional
@Repository
public interface PollRepo extends CrudRepository<Poll, Integer>{

	
	Poll findByUid(int uid);
}
