package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Skill;
import utility.ConnectionManager;



public class SkillDAO{
	
	public List<Skill> listAllSkills () throws ClassNotFoundException, SQLException {
	List<Skill> skills=null;
	Connection con = ConnectionManager.getConnection();
	
	if (con != null) {
		skills= new ArrayList<>();
		Statement stmt = con.createStatement();
		String sql = "SELECT * FROM SKILL";
		ResultSet rs = stmt.executeQuery(sql);
		 
		  while(rs.next()) {
			Skill s = new Skill(rs.getInt(1),rs.getString(2));
			skills.add(s);
		  }
		  
		System.out.println("Connected");
		con.close();
       return skills;
	  } 
	
	else {System.out.println("Not connected");
	return skills;	
	}
	 
	
	
	}
}
