package io.planit.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "event")
public class Event extends AbstractEntity {
	
	
	
	@Column(name = "personal")
	private boolean personal;
	
	
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User author;
	
	
	
	@Column(name = "title")
	private String title;
	
	
	
	@Column(name = "description")
	private String description;
	
	
	
	@Column(name = "date")
	private Date date;
	
	
	
	protected Event(){}
	
	
	
	public Event(User author, String title, String description, Date date, boolean personal){
		
		super();
		
		this.author = author;
		this.title = title;
		this.description = description;
		this.date = date;
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
	
	
	
	public String getDescription(){
		return this.description;
	}
	public void setDescription(String description){
		this.description = description;
	}
	
	
	
	public Date getDate(){
		return this.date;
	}
	public void setDate(Date date){
		this.date = date;
	}
	

}
