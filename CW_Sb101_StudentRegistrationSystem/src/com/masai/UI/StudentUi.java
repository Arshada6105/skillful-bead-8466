package com.masai.UI;

import java.util.Scanner;

import com.masai.DAO.StudentDao;
import com.masai.DAO.StudentDaoImpl;

public class StudentUi {
	StudentDao student;
	Scanner sc;
	
	public StudentUi(Scanner sc) {
		this.sc = sc;
		student=new StudentDaoImpl();	
	}
	
	
	
}
