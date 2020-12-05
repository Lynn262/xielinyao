package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.pojo.Course;
import com.example.pojo.Professor;


public interface CourseService {
	
	Course getAdmCrs( String Cno);
	
	 String getAdmCno(String Cname);
	 
	 int savecourse(Course courseVo);
	 
	int deletecourse(String Cno);
	
	int updatecname(String Cno,String Cname);
	
	int updatecterm(String Cno,String Cterm);
	
	int updatecredit(String Cno,String Ccredit);
	
}
