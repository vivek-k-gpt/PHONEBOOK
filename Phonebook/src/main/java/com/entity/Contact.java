package com.entity;

public class Contact {
private int id,userid;
private String name,email,phoneno,about;
public Contact() {

}
public Contact(int userid ,String name, String email, String phoneno, String about) {
	
	this.userid= userid;
	this.name = name;
	this.email = email;
	this.phoneno = phoneno;
	this.about = about;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
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
public String getPhoneno() {
	return phoneno;
}
public void setPhoneno(String phoneno) {
	this.phoneno = phoneno;
}
@Override
public String toString() {
	return "Contact [id=" + id + ", name=" + name + ", email=" + email + ", phoneno=" + phoneno + ", about=" + about
			+ "]";
}
public String getAbout() {
	return about;
}
public void setAbout(String about) {
	this.about = about;
}


	
}
