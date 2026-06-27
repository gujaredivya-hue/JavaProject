package com.tka.controller;
import com.tka.dao.IPLDao;
import com.tka.entity.Player;

public class IPLController {
       public static void main(String[] args) {
    	   IPLDao dao = new IPLDao();
//Insert Operation    	   
    	   Player p1 = new Player(104, "Divya", 8000, 4, "RCB");
//    	   IPLDao dao = new IPLDao();
    	   int insertstatus = dao.addPlayer(p1);
    	   if(insertstatus > 0 )
    	   {
    		   System.out.println("Player Insert Successfully");
    	   }
    	   
//Update Operation    	   
    	   Player p2 = new Player(102, "Virat Kholi", 8500, 5, "KKR");
//  	   IPLDao dao = new IPLDao();
    	   int updatestatus = dao.updatePlayer(p2);
    	   if(updatestatus > 0)
    	   {
    	   System.out.println("Player Updated Successfully");
    	   }
    	   
//Delete Operation    	   
    	  
    	//   IPLDao dao = new IPLDao();
    	   int deletestatus = dao.deletePlayer(103);
    	   if(deletestatus > 0)
    	   {
    	   System.out.println("Player Deleted Successfully");   
    	   }
    }
}