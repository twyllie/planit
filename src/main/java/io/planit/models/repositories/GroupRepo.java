package io.planit.models.repositories;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.planit.models.Group;

@Transactional
@Repository
public interface GroupRepo extends CrudRepository<Group, Integer>{

	
	Group findByUid(int uid);
	
}
