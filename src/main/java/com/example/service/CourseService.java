package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.pojo.Course;


public interface CourseService {
	
	Course getAdmCrs( String Cno);
	
	 String getAdmCno(String Cname);
	
}
