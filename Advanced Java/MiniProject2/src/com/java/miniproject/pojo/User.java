package com.java.miniproject.pojo;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity(name="user2")
public class User {
	@Id
	@Column(name="UserID")
	private int uid;
	@Column(name="FirstName")
	private String fname;
	@Column(name="LastName")
	private String lname;
	@Column(name="MobileNO")
	private	String mobile;
	@Column(name="Email")
	private	String email;
	@Column(name="UserName")
	private	String uname;
	@Column(name="Password")
	private	String pass;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="hobby_id")
	private Set<Hobby> hobbies;
	
	public User() {
		super();
	}
	
	
	public Set<Hobby> getHobbies() {
		return hobbies;
	}


	public void setHobbies(Set<Hobby> hobbies) {
		this.hobbies = hobbies;
	}


	public User(int uid, String fname, String lname, String mobile, String email, String uname, String pass) {
		super();
		this.uid = uid;
		this.fname = fname;
		this.lname = lname;
		this.mobile = mobile;
		this.email = email;
		this.uname = uname;
		this.pass = pass;
	}


	public int getUid() {
		return uid;
	}
	
	public void setUid(int uid) {
		this.uid = uid;
	}
	
	public String getFname() {
		return fname;
	}
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public String getLname() {
		return lname;
	}
	
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getUname() {
		return uname;
	}
	
	public void setUname(String uname) {
		this.uname = uname;
	}
	
	public String getPass() {
		return pass;
	}
	
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	@Override
	public String toString() {
		return "User [uid=" + uid + ", fname=" + fname + ", lname=" + lname + ", mobile=" + mobile + ", email=" + email
				+ ", uname=" + uname + ", pass=" + pass + ", hobbies=" + hobbies + "]";
	}
	
}
