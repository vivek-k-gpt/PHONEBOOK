package com.service;

import java.util.List;

import com.dao.ContactDao;
import com.entity.Contact;
import com.mysql.cj.xdevapi.RemoveStatement;

public class ContactService {
	ContactDao cd = new ContactDao();
	public boolean add(Contact c) {
		
		return cd.contactSave(c);
	}
	
public List<Contact> getContact(int id) {
		
		return cd.find(id);
	}

public Contact getDetails(int id) {
	
	return cd.match(id);
}

public boolean update(Contact c) {
	return cd.upd(c);
	
}

public boolean delete(int s) {
	
    return cd.remove(s);
}





}
