package com.example.service;

import java.util.List;

import com.example.pojo.Student;

public interface StudentService {
	
	Student getStu( String Sno);

	/**
	 * @param id 用户输入的用户名
	 * @param passwd 用户输入的密码
	 * @return 用户输入的凭证与数据库中的凭证是否匹配
	 */
	boolean checkCredential(String id, String passwd);
	
	int updatesnickname(String Sno,String Snickname);
	
	int updatespw(String Sno,String Spw);
	
	

}
