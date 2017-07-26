package com.atos;

public class User {
	
	private int id;
	private String email;
	private String password;
	private String first_name; 
	private String last_name;
	private String mobile;
	
	
	
	public User(String email, String password, String first_name, String last_name, String mobile) {
		super();
		this.email = email;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
		this.mobile = mobile;
	}
	
	



	
	
	
	public User() {
		super();
	}








	public int getId() {
		return id;
	}






	public void setId(int id) {
		this.id = id;
	}






	public String getEmail() {
		return email;
	}






	public void setEmail(String email) {
		this.email = email;
	}






	public String getPassword() {
		return password;
	}






	public void setPassword(String password) {
		this.password = password;
	}






	public String getFirst_name() {
		return first_name;
	}






	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}






	public String getLast_name() {
		return last_name;
	}






	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}






	public String getMobile() {
		return mobile;
	}






	public void setMobile(String mobile) {
		this.mobile = mobile;
	}






	public String toString() {
		return "User [id=" + id + ", email=" + email + ", password=" + password + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", mobile=" + mobile + "]";
	}
	
	
	
	
	

}
