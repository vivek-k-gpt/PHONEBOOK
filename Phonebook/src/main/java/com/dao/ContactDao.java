package com.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.conn.DBconnect;
import com.entity.Contact;
import com.entity.User;
import java.util.*;

public class ContactDao {

	Connection con = DBconnect.getConnect();

	public boolean contactSave(Contact u) {
		boolean f = false;
		try {
			String sql = "insert into contact(userid,name,email,about,phone) values(?,?,?,?,?)";
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setInt(1, u.getUserid());
			statement.setString(2, u.getName());
			statement.setString(3, u.getEmail());
			statement.setString(4, u.getAbout());
			statement.setString(5, u.getPhoneno());
			int i = statement.executeUpdate();
			if (i == 1) {
				f = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("inside  catch of repo  of add book ");
		}

		return f;
	}

	
	
	
	
	public List<Contact> find(int id) {
		Contact c = null;
		List<Contact> list = new ArrayList<Contact>();

		try {
			PreparedStatement stm = con.prepareStatement("select * from contact where userid=?");
			stm.setInt(1, id);
			ResultSet rs = stm.executeQuery();
			while (rs.next()) {
				c = new Contact();
				c.setId(rs.getInt(1));
				c.setName(rs.getString(2)); 
				c.setEmail(rs.getString(3));
				c.setPhoneno(rs.getString(4)); 
				c.setAbout(rs.getString(5)); 
				
			
				
				list.add(c);
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Inside catch of GetAllContact reppo");
		}

		return list;

	}
	
	
	
	
	
	
	public Contact match(int id) {
		Contact c = null;
	

		try {
			PreparedStatement stm = con.prepareStatement("select * from contact where id=?");
			stm.setInt(1, id);
			ResultSet rs = stm.executeQuery();
			while (rs.next()) {
				c = new Contact();
				c.setUserid(rs.getInt(6));
				c.setName(rs.getString(2)); 
				c.setEmail(rs.getString(3));
				c.setPhoneno(rs.getString(4)); 
				c.setAbout(rs.getString(5)); 
				c.setId(rs.getInt(1));
			
			
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Inside catch of GetAllContact reppo");
		}

		return c;

	}

	
	
	
	
	
	
	
	
	
	
	
	public boolean upd(Contact u) {
		boolean f = false;
		
		
		try {	
			String sql = "update contact set name=?, email=?,phone=?,about=? where id=?";
		
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(5, u.getId());
		statement.setString(1, u.getName());
		statement.setString(2, u.getEmail());
		statement.setString(4, u.getAbout());
		statement.setString(3, u.getPhoneno());
		int i = statement.executeUpdate();
		if (i == 1) {
			f = true;
		}			
			
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("inside update of contact repo");
		}
		return f;
	}
	
	public boolean remove(int id) {
		boolean f = false;
		
		
		try {	
			String sql = "delete from contact where id =?";
		
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, id);
		int i = statement.executeUpdate();
		if (i == 1) {
			f = true;
		}			
			
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("inside remove of contact repo");
		}
		return f;
	}



}
