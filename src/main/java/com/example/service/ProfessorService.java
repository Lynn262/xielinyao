package com.example.service;

import java.util.List;

import com.example.pojo.Professor;
import com.example.pojo.Student;

public interface ProfessorService {
	
	Professor getPrf( String Pno);
	
	int savePrf(Professor professorVo);
	 
	int deletePrf(String Pno);
	
}