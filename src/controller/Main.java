package controller;

import java.sql.SQLException;
import java.util.List;

import dao.SkillDAO;
import model.Skill;

public class Main{
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		
		
		System.out.println("List of all skills");

		SkillDAO skillDao = new SkillDAO();
		List<Skill> skills = skillDao.listAllSkills();
		
		
		for(Skill skill:skills) {
			skill.display();
		}
	}
	
}
