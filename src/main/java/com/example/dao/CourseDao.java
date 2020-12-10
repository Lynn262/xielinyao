package com.example.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.pojo.Course;

@Repository
@Mapper

public interface CourseDao {

	List<Course> getallc();

	List<Course> queryCname(String cname);
	
	Course getAdmCrs( String cno);
	
	String getAdmCno(String cname);
	
	int savecourse(Course courseVo);
	 
	int deletecourse(String cno);
	
	int updatecname(String cno,String cname);
	
	int updatecterm(Map m1);
	
	int updatecredit(Map m1);

	int updatecdept(String cno, String dept);
}