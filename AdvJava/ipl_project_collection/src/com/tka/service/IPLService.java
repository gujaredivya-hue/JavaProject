package com.tka.service;

import java.util.List;

import com.tka.dao.IPLDao;
import com.tka.entity.Player;

public class IPLService {
        
	private List<Player> ipl_db = null;
	private IPLDao ipldao = null;
	
	public List<Player> getAllPlayers(){
		
		ipldao = new IPLDao();
		
		ipl_db = ipldao.getAllPlayer();
		
		return ipl_db;
		
	}
	
}
