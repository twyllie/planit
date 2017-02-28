package io.planit.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "task")
public class Task extends AbstractEntity{

	
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User author;
	
	
	
	@Column(name = "title")
	private String title;
	
	
	
	@Column(name = "body")
	private String body;
	
	
	
	@Column(name = "deadline")
	private Date deadline;
	
	
	
	@Column(name = "assigned")
	private List<User> assigned;
	
	
	
	public Task(){}
	
	
	
	public Task(User author, String title, String body){
		
		super();
		
		this.author = author;
		this.title = title;
		this.body = body;
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
	
	
	
	public String getBody(){
		return this.body;
	}
	public void setBody(String body){
		this.body = body;
	}
	
	
	
	public Date getDeadline(){
		return this.deadline;
	}
	public void setDeadline(Date deadline){
		this.deadline = deadline;
	}
	
	
	
	public List<User> getAssigned(){
		return this.assigned;
	}
	public void setAssigned(List<User> assigned){
		this.assigned = assigned;
	}
}
