package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.dao.CourseDao;
import com.example.pojo.Course;
import com.example.service.CourseService;

@Service
@Transactional
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao = null;
	
	@Override
	public Course getAdmCrs( String Cno) {
		return courseDao.getAdmCrs(Cno);
	}
	
	@Override
	public String getAdmCno(String Cname) {
		return courseDao.getAdmCno(Cname);
	}
	
	@Override
	public int savecourse(Course courseVo) {
		return courseDao.savecourse(courseVo);
	}
	
	@Override
	public int deletecourse(String Cno) {
		return courseDao.deletecourse(Cno);
	}
	
	@Override
	public int updatecname(String Cno,String Cname) {
		return courseDao.updatecname(Cno,Cname);
	}
	
	@Override
	public int updatecterm(String Cno,String Cterm) {//spring帮助获取参数
		
		return courseDao.updatecterm(Cno,Cterm);
	}
	
	@Override
	public int updatecredit(String Cno,String Ccredit) {//spring帮助获取参数
		
		return courseDao.updatecredit(Cno,Ccredit);
	}

	 
}