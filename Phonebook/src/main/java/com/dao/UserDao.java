package com.dao;

import com.conn.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.entity.User;
import com.mysql.cj.xdevapi.PreparableStatement;

public class UserDao {

	Connection con = DBconnect.getConnect();

	public boolean userRegister(User u) {
		boolean f = false;
		try {
			String sql = "insert into user(name,username,email,password) values(?,?,?,?)";
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, u.getName());
			statement.setString(2, u.getUsername());
			statement.setString(3, u.getEmail());
			statement.setString(4, u.getPassword());
			int i = statement.executeUpdate();
			if (i == 1) {
				f = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("inside  catch of repo user register ");
		}

		return f;
	}

	public User loginUser(String s, String p) {
		User user = null;
		try {

			String q = "select * from user where username=? and password=?";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setString(1, s);
			ps.setString(2, p);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				user = new User();
				user.setId(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setUsername(rs.getString(3));
				user.setEmail(rs.getString(4));

				user.setPassword(rs.getString(5));

			}
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("inside login of user repo");
		}

		return user;
	}

}
