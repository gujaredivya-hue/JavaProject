package com.tka.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tka.entity.Player;

public class IPLDao {
	
	private List<Player> ipl_db = null;
	
	String path = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/adv_java_077_db";
	String un = "root";
	String pwd = "divgujare@05";
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	String query = "Select * from player";
	
	public List<Player> getAllPlayer(){
		
		ipl_db = new ArrayList<>();
		
		try {
			Class.forName(path);
			
			conn = DriverManager.getConnection(url,un,pwd);
			
			pst = conn.prepareStatement(query);
			
			rs = pst.executeQuery();
			ipl_db = new ArrayList<Player>();
			
			while(rs.next())
			{
				int jn = rs.getInt(1);
				String pn = rs.getString(2);
				int r = rs.getInt(3);
				int w = rs.getInt(4);
				String tn = rs.getString(5);
				
				Player obj = new Player(jn,pn,r,w,tn);
				ipl_db.add(obj);
			}			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return ipl_db;
	}

}
