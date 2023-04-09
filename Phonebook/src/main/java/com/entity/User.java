package com.entity;

public class User {
private int id;
private String name, email,password,username;
public User() {

}
public User(String username, String name, String email, String password) {


	this.username = username;
	this.name = name;
	this.email = email;
	this.password = password;
}


public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
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
@Override
public String toString() {
	return "User [name=" + name + ", email=" + email + ", password=" + password + ", username=" + username + "]";
}



}
