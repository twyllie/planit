package io.planit.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "message")
public class Message extends AbstractEntity{
	
	
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User author;
	
	
	@NotNull
	@Column(name = "body")
	private String body;
	
	
	
	@Column(name = "edited")
	private boolean edited;
	
	
	
	public Message(){}
	
	
	
	public Message(User author, String body){
		
		super();
		
		this.author = author;
		this.body = body;
	}
	
	
	public User getAuthor(){
		return this.author;
	}
	public void setAuthor(User user){
		this.author = user;
	}
	
	
	
	public String getBody(){
		return this.body;
	}
	public void setBody(String body){
		this.body = body;
	}
	
	
	
	public boolean getEdited(){
		return this.edited;
	}
	public void setEdited(boolean edited){
		this.edited = edited;
	}
	
	
	public void updateBody(String newBody){
		this.body = newBody;
		this.edited = true;
	}
}
