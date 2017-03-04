package io.planit.models.repositories;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.planit.models.Note;

@Transactional
@Repository
public interface NoteRepo extends CrudRepository<Note, Integer>{

	
	Note findByUid(int uid);
}
