package io.planit.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

@MappedSuperclass
public abstract class AbstractEntity {

	
	@Id
    @GeneratedValue
    @NotNull
    @Column(name = "uid", unique = true)
	private int uid;
	
	@NotNull
	@Column(name = "created")
	private Date created;
	
	@NotNull
	@Column(name = "updated")
	private Date updated;
	
	public AbstractEntity(){
		this.created = new Date();
		this.updated = this.created;
	}
	
	public int getUid() {
		return this.uid;
	}
	protected void setUid(int uid) {
        this.uid = uid;
    }
	
	public void updated(){
		this.updated = new Date();
	}
	
	
}