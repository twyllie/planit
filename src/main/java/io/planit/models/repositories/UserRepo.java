package io.planit.models.repositories;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.planit.models.User;

@Transactional
@Repository
public interface UserRepo extends CrudRepository<User, Integer>{

	
	User findByUid(int uid);
}
