package com.tka.dao;

import java.util.ArrayList;
import java.util.List;

import com.tka.entity.Player;

public class IPLDao {
	
	private List<Player> ipl_db = null;
	
	public List<Player> getAllPlayer(){
		
		ipl_db = new ArrayList<>();
		
		ipl_db.add(new Player(18,"Virat Kholi",8500,5,"RCB"));
		ipl_db.add(new Player(10,"Suyash Sharma",300,25,"RCB"));
		ipl_db.add(new Player(15,"Faf du Plessis",4500,0,"RCB"));
		ipl_db.add(new Player(11,"Glenn Maxwell",2800,35,"RCB"));
		ipl_db.add(new Player(97,"Bhuvneshwar Kumar",300,180,"RCB"));
		ipl_db.add(new Player(19,"Rajat Patidar",1200,0,"RCB"));
		ipl_db.add(new Player(32,"Jitesh Sharma",900,0,"RCB"));
		ipl_db.add(new Player(21,"Tim David",1500,0,"RCB"));
		ipl_db.add(new Player(71,"Krunal Pandey",1700,80,"RCB"));
		ipl_db.add(new Player(26,"Josh Hazlewood",100,120,"RCB"));
		ipl_db.add(new Player(29,"Yash Dayal",50,45,"RCB"));
		
		ipl_db.add(new Player(45,"Rohit Sharma",7000,15,"MI"));
		ipl_db.add(new Player(63,"Suryakumar Yadav",4000,0,"MI"));
		ipl_db.add(new Player(23,"Tilak Verma",1800,0,"MI"));
		ipl_db.add(new Player(51,"Hardik Pandya",2600,70,"MI"));
		ipl_db.add(new Player(77,"Jasprit Bumrah",100,170,"MI"));
		ipl_db.add(new Player(44,"Trent Boult",50,120,"MI"));
		ipl_db.add(new Player(25,"Deepak chahar",200,85,"MI"));
		ipl_db.add(new Player(19,"Ryan Rickelton",700,0,"MI"));
		ipl_db.add(new Player(12,"Naman Dhir",500,5,"MI"));
		ipl_db.add(new Player(99,"Mitchell Santner",600,75,"MI"));
		ipl_db.add(new Player(8,"Will Jacks",1200,20,"MI"));
		
		ipl_db.add(new Player(7,"MS Dhoni",5200,0,"CSK"));
		ipl_db.add(new Player(31,"Ruturaj Gaikwad",2800,0,"CSK"));
		ipl_db.add(new Player(8,"Ravinndra Jadeja",2900,160,"CSK"));
		ipl_db.add(new Player(25,"Shivam Dube",1800,10,"CSK"));
		ipl_db.add(new Player(90,"Ravichandra Ashwin",900,180,"CSK"));
		ipl_db.add(new Player(81,"Noor Ahmad",150,60,"CSK"));
		ipl_db.add(new Player(47,"Devon Conway",1700,0,"CSK"));
		ipl_db.add(new Player(17,"Matheesha Pathirana",50,45,"CSK"));
		ipl_db.add(new Player(88,"Sam Curran",1100,60,"CSK"));
		ipl_db.add(new Player(19,"Rahul Tripathi",2200,0,"CSK"));
		ipl_db.add(new Player(44,"Khaleel ahmed",100,80,"CSK"));
		
		ipl_db.add(new Player(41,"Ajinkya Rahane",4800,0,"KKR"));
		ipl_db.add(new Player(12,"Sunil Narine",1700,180,"KKR"));
		ipl_db.add(new Player(3,"Andre Russell",2500,110,"KKR"));
		ipl_db.add(new Player(55,"Rinku Singh",1000,0,"KKR"));
		ipl_db.add(new Player(19,"Venkatesh Iyer",1500,10,"KKR"));
		ipl_db.add(new Player(74,"Varun Chakravarthy",300,95,"KKR"));
		ipl_db.add(new Player(77,"Harshit Rana",100,45,"KKR"));
		ipl_db.add(new Player(15,"Ramandeep Singh",500,5,"KKR"));
		ipl_db.add(new Player(29,"Anrich Nortje",50,70,"KKR"));
		ipl_db.add(new Player(8,"Quinton de kock",3200,0,"KKR"));
		ipl_db.add(new Player(24,"Angkrish Raghuvanshi",400,0,"KKR"));
		
		return ipl_db;
	}

}
