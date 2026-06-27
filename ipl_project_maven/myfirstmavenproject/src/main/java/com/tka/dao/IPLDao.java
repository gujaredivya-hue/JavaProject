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
	String url = "jdbc:mysql://localhost:3306/db";
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

//Insertion Operation	
	
	public int addPlayer(Player p1) {

	    String query = "INSERT INTO player VALUES(?,?,?,?,?)";

	    try {
	        Class.forName(path);
            conn = DriverManager.getConnection(url, un, pwd);
            pst = conn.prepareStatement(query);
            pst.setInt(1, p1.getJn());
	        pst.setString(2, p1.getPname());
	        pst.setInt(3, p1.getRuns());
	        pst.setInt(4, p1.getWickets());
	        pst.setString(5, p1.getTname());

	        return pst.executeUpdate();

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return 0;
	}
	
//Updation Operation	
	public int updatePlayer(Player p2) {

	    String query ="UPDATE player SET pname=?, r=?, w=?, tname=? WHERE jn=?";

	    try {
	        Class.forName(path);
	        conn = DriverManager.getConnection(url, un, pwd);
	        pst = conn.prepareStatement(query);
	        pst.setString(1, p2.getPname());
	        pst.setInt(2, p2.getRuns());
	        pst.setInt(3, p2.getWickets());
	        pst.setString(4, p2.getTname());
	        pst.setInt(5, p2.getJn());
	        
	        return pst.executeUpdate();

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return 0;
	}
	
//Delete Operation
	public int deletePlayer(int p3) {

	    String query = "DELETE FROM player WHERE jn=?";

	    try {
	        Class.forName(path);
	        conn = DriverManager.getConnection(url, un, pwd);
	        pst = conn.prepareStatement(query);
	        pst.setInt(1,p3);

	        return pst.executeUpdate();

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return 0;
	}
}
