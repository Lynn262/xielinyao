package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.StudentDao;
import com.example.pojo.Student;
import com.example.service.StudentService;

import javax.annotation.Resource;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	//@Resource
	private StudentDao studentDao = null;

	@Override
	public Student getStu( String Sno) {
		return studentDao.getStu(Sno);
	}

	/**
	 * @param id    用户输入的用户名
	 * @param passwd 用户输入的密码
	 * @return 用户输入的凭证与数据库中的凭证是否匹配
	 */
	@Override
	public boolean checkCredential(String id, String passwd) {
		Student stu1 = this.studentDao.getStu(id);

		return stu1.checkSpw(passwd);

	}
	
	@Override
	public int updatesnickname(String Sno,String Snickname) {
		

		return studentDao.updatesnickname(Sno,Snickname);

	}
	
	@Override
	public int updatespw(String Sno,String Spw) {
		

		return studentDao.updatespw(Sno,Spw);

	}
	
	
}