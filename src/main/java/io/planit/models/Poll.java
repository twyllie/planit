package io.planit.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "poll")
public class Poll extends AbstractEntity{

	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User author;
	
	
	
	@Column(name = "deadline")
	private Date deadline;
	
	
	
	@Column(name = "options")
	private List<String> options;
	
	
	
	@Column(name = "votes")
	private List<String> votes;
	
	
	
	public Poll(){}
	
	
	
	public Poll(User author, Date deadline, List<String> options, List<String> votes){
		
		super();
		
		this.author = author;
		this.deadline = deadline;
		this.options = options;
		this.votes = votes;
	}
	
	
	
	public User getAuthor(){
		return this.author;
	}
	public void setAuthor(User author){
		this.author = author;
	}
	
	
	
	public Date getDeadline(){
		return this.deadline;
	}
	public void setDeadline(Date deadline){
		this.deadline = deadline;
	}
	
	
	
	public List<String> getOptions(){
		return this.options;
	}
	public void setOptions(List<String> options){
		this.options = options;
	}
	
	
	
	public List<String> getVotes(){
		return this.votes;
	}
	public void setVotes(List<String> votes){
		this.votes = votes;
	}
}
