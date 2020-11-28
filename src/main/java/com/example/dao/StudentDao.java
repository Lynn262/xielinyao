package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.pojo.Student;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface StudentDao {
	
	Student getStu( String Sno);
}