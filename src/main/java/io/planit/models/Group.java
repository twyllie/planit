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
	
	
	
	@Column(name = "personal")
	private boolean personal;
	
	
	
	@Column(name = "title")
	private String title;
	
	
	
	@Column(name = "admin_list")
	private List<User> admins;
	
	
	
	@ManyToMany(mappedBy = "groups")
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
	
	
	
	protected Group(){}
	
	
	
	public Group(User author, String title, boolean personal){
		
		super();
		
		
		this.admins.add(author);
		this.participants.add(author);
		this.title = title;
		this.personal = personal;
	}
	
	
	
	public boolean getPersonal(){
		return this.personal;
	}
	public void setPersonal(boolean personal){
		this.personal = personal;
	}
	
	
	
	public String getTitle(){
		return this.title;
	}
	public void setTitle(String title){
		this.title = title;
	}
	
	
	
	public List<User> getAdmins(){
		return this.admins;
	}
	public void setAdmins(List<User> admins){
		this.admins = admins;
	}
	
	
	
	public List<User> getParticipants(){
		return this.participants;
	}
	public void setParticipants(List<User> participants){
		this.participants = participants;
	}
	
	
	
	public List<Event> getEvents(){
		return this.events;
	}
	public void setEvents(List<Event> events){
		this.events = events;
	}
	
	
	
	public List<Project> getProjects(){
		return this.projects;
	}
	public void setProjects(List<Project> projects){
		this.projects = projects;
	}
	
	
	
	public List<Note> getNotes(){
		return this.notes;
	}
	public void setNotes(List<Note> notes){
		this.notes = notes;
	}
	
	
	
	public List<Task> getTasks(){
		return this.tasks;
	}
	public void setTasks(List<Task> tasks){
		this.tasks = tasks;
	}
	
	
	
	public List<Message> getMessages(){
		return this.messages;
	}
	public void setMessages(List<Message> messages){
		this.messages = messages;
	}

}
