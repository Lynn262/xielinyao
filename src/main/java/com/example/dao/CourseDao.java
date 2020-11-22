package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.pojo.Course;

@Mapper
public interface CourseDao {
	
	Course getAdmCrs( String Cno);
}