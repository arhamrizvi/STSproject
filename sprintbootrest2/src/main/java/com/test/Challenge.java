package com.test;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Challenge {
	@Id
	private int id;
	private String name;
	private String level;
	
	
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}
	public void setId(int id) {
		// TODO Auto-generated method stub
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getlevel() {
		return level;
	}
	public void setlevel(String level) {
		this.level = level;
	}
	

}
