package com.tka.controller;

import java.util.List;

import com.tka.entity.Player;
import com.tka.service.IPLService;

public class IPLController {

	
	   public static void main(String[] args) {
		   
		   IPLService iplservice = new IPLService();
		   
		 List<Player> allPlayers = iplservice.getAllPlayers();
		   
		  allPlayers.forEach(p -> System.out.println(p.getPname()+"\t\t"+p.getTname()));
		   
		  }
}

