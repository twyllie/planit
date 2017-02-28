package io.planit.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "note")
public class Note extends AbstractEntity{

	
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User author;
	
	
	
	@Column(name = "title")
	private String title;
	
	
	
	@Column(name = "body")
	private String body;
	
	
	
	public Note(){}
	
	
	
	public Note(User author, String title, String body){
		
		super();
		
		this.author = author;
		this.title = title;
		this.body = body;
	}
	
	
	
	public User getAuthor(){
		return this.author;
	}
	public void setAuthor(User user){
		this.author = user;
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
}
