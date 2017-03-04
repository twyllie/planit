package io.planit.models.repositories;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.planit.models.Project;

@Transactional
@Repository
public interface ProjectRepo extends CrudRepository<Project, Integer>{

	
	Project findByUid(int uid);
}
