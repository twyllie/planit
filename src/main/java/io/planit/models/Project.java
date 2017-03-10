package io.planit.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "project")
public class Project extends AbstractEntity{
	
	
	
	@Column(name = "personal")
	private boolean personal;

	
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User author;
	
	
	
	@Column(name = "title")
	private String title;
	
	
	
	@Column(name = "deadline")
	private Date deadline;
	
	
	
	@OneToMany
	@JoinColumn(name = "note_id")
	private List<Note> notes;
	
	
	
	@OneToMany
	@JoinColumn(name = "event_id")
	private List<Event> events;
	
	
	
	@OneToMany
	@JoinColumn(name = "task_id")
	private List<Task> tasks;
	
	
	
	protected Project(){}
	
	
	
	public Project(User author, String title, boolean personal){
		
		super();
		
		this.author = author;
		this.title = title;
		this.personal = personal;
	}
	
	
	
	public boolean getPersonal(){
		return this.personal;
	}
	public void setPersonal(boolean personal){
		this.personal = personal;
	}
	
	
	
	public User getAuthor(){
		return this.author;
	}
	public void setAuthor(User author){
		this.author = author;
	}
	
	
	
	public String getTitle(){
		return this.title;
	}
	public void setTitle(String title){
		this.title = title;
	}
	
	
	
	public Date getDeadline(){
		return this.deadline;
	}
	public void setDeadline(Date deadline){
		this.deadline = deadline;
	}
	
	
	
	public List<Note> getNotes(){
		return this.notes;
	}
	public void setNotes(List<Note> notes){
		this.notes = notes;
	}
	
	
	
	public List<Event> getEvents(){
		return this.events;
	}
	public void setEvents(List<Event> events){
		this.events = events;
	}
	
	
	
	public List<Task> getTasks(){
		return this.tasks;
	}
	public void setTasks(List<Task> tasks){
		this.tasks = tasks;
	}
}
