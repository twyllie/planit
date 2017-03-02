package io.planit.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "group")
public class Group extends AbstractEntity{
	
	
	
	@Column(name = "title")
	private String title;
	
	
	
	@Column(name = "admin_list")
	private List<User> admins;
	
	
	//TODO: Figure out bi-directional manytomany
	@ManyToMany
	private List<User> participants;
	
	
	
	@OneToMany
	@JoinColumn(name = "event_id")
	private List<Event> events;
	
	
	
	@OneToMany
	@JoinColumn(name = "project_id")
	private List<Project> projects;
	
	
	
	@OneToMany
	@JoinColumn(name = "note_id")
	private List<Note> notes;
	
	
	
	@OneToMany
	@JoinColumn(name = "task_id")
	private List<Task> tasks;
	
	
	
	@OneToMany
	@JoinColumn(name = "message_id")
	private List<Message> messages;

}
