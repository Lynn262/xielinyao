package com.example.dao;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

import com.example.pojo.ReviewFront;
import com.example.pojo.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface StudentDao {
	
	List<Student> queryall();
	
	Student getStu(@Param("Sno")String Sno);
	
	int updatesnickname(String Sno,String Snickname);
	
	int updatespw(String Sno,String Spw);
	
	int saveStu(Student studentVo);
	
	int deleteStu(String Sno);
	
	int updatestate(Map map);
}