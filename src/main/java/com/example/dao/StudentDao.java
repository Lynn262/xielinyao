package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.pojo.Student;

@Mapper
public interface StudentDao {
	
	Student getStu( String Sno);
}