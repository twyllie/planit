package io.planit.models.repositories;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.planit.models.Task;

@Transactional
@Repository
public interface TaskRepo extends CrudRepository<Task, Integer>{

	
	Task findByUid(int uid);
}
