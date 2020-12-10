package com.example.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	public List<Course> getallc() {
		return courseDao.getallc();
	}

	@Override
	public List<Course> queryCname(String cname) {
		return courseDao.queryCname(cname);
	}

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
	public int updatecterm(String Cno,int Cterm) {//spring帮助获取参数
		Map m1 = new HashMap();
		m1.put("cno", Cno);
		m1.put("cterm", Cterm);
		return courseDao.updatecterm(m1);
	}
	
	@Override
	public int updatecredit(String Cno,int Ccredit) {//spring帮助获取参数
		Map m1 = new HashMap();
		m1.put("cno", Cno);
		m1.put("ccredit", Ccredit);
		return courseDao.updatecredit(m1);
	}

	@Override
	public int updatecdept(String cno, String dept) {
		return courseDao.updatecdept(cno, dept);
	}
}