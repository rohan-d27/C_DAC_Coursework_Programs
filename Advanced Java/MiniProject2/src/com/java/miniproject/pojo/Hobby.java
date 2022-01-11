package com.java.miniproject.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name="hobby2")
public class Hobby {
	@Id
	@Column
	private int HobbyID;
	@Column
	private int UserID;
	@Column
	private String hobby;
	@ManyToOne
	private User userid;
	public Hobby(int hobbyID, int userID, String hobby) {
		super();
		HobbyID = hobbyID;
		UserID = userID;
		this.hobby = hobby;
	}
	public Hobby() {
		super();
	}
	
	public User getUserid() {
		return userid;
	}
	public void setUserid(User userid) {
		this.userid = userid;
	}
	public int getHobbyID() {
		return HobbyID;
	}
	public void setHobbyID(int hobbyID) {
		HobbyID = hobbyID;
	}
	public int getUserID() {
		return UserID;
	}
	public void setUserID(int userID) {
		UserID = userID;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "Hobby [HobbyID=" + HobbyID + ", UserID=" + UserID + ", hobby=" + hobby + "]";
	}


}
