package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.pojo.Professor;

@Mapper
public interface ProfessorDao {
	
	Professor getPrf( String Pno);
}