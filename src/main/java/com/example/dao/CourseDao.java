package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.pojo.Course;

@Repository
@Mapper

public interface CourseDao {
	
	Course getAdmCrs( String Cno);
	
	String getAdmCno(String Cname);
	
	int savecourse(Course courseVo);
	 
	int deletecourse(String Cno);
	
	int updatecname(String Cno,String Cname);
	
	int updatecterm(String Cno,String Cterm);
	
	int updatecredit(String Cno,String Ccredit);
}