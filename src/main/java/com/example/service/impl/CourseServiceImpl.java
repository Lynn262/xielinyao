package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

	 
}