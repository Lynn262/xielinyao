package com.example.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.example.pojo.ReviewFront;
import com.example.pojo.Student;

public interface StudentService {
	
	List<Student> queryall();
	
	Student getStu( String Sno);

	/**
	 * @param id 用户输入的用户名
	 * @param passwd 用户输入的密码
	 * @return 用户输入的凭证与数据库中的凭证是否匹配
	 */
	boolean checkCredential(String id, String passwd);
	
	int updatesnickname(String Sno,String Snickname);
	
	int updatespw(String Sno,String Spw);
	
	 int saveStu(Student studentVo);
	 
	int deleteStu(String Sno);
	
	int updatestate(String Sno,java.sql.Date Sstate);

}
