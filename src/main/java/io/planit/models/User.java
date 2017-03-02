package io.planit.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User extends AbstractEntity{
	
	
	
	@Column(name = "email")
	private String email;
	
	
	
	@Column(name = "username")
	private String username;
	
	
	
	@Column(name = "pwhash")
	private String pwhash;
	
	
	
	@OneToMany
	@JoinColumn(name = "event_id")
	private List<Event> events;
	
	
	
	@OneToMany
	@JoinColumn(name = "message_id")
	private List<Message> messages;
	
	
	//TODO: Figure out bi-directional manytomany
	@ManyToMany
	private List<Group> groups;
	
	
	
	public User(){}
	
	
	
	public User(String email, String username, String pwhash){
		
		super();
		
		this.email = email;
		this.username = username;
		this.pwhash = pwhash;
	}
	
	
	
	public String getEmail(){
		return this.email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	
	
	
	public String getUsername(){
		return this.username;
	}
	public void setUsername(String username){
		this.username = username;
	}
	
	
	
	public String getPwhash(){
		return this.pwhash;
	}
	public void setPwhash(String pwhash){
		this.pwhash = pwhash;
	}
	
	
	
	public List<Event> getEvents(){
		return this.events;
	}
	public void setEvents(List<Event> events){
		this.events = events;
	}
	
	
	
	public List<Message> getMessages(){
		return this.messages;
	}
	public void setMessages(List<Message> messages){
		this.messages = messages;
	}
	
	
	
	public List<Group> getGroups(){
		return this.groups;
	}
	public void setGroups(List<Group> groups){
		this.groups = groups;
	}

}
