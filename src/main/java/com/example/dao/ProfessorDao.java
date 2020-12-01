package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.pojo.Professor;
import com.example.pojo.Student;

@Mapper
public interface ProfessorDao {
	
	Professor getPrf( String Pno);
	int savePrf(Professor professorVo);
	 
	int deletePrf(String Pno);
}