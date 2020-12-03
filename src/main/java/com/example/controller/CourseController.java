package com.example.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.pojo.Course;

import com.example.service.CourseService;

@Controller
@RequestMapping("/course")
public class CourseController {

	@Autowired
	private CourseService courseService = null;
	
	@RequestMapping("/querycourse")//查询课程
	@ResponseBody
	public Course getAdmCrs(String Cno) {//spring帮助获取参数
		Course course =new Course();
		course =courseService.getAdmCrs( Cno);
		return course;
	}
	
	@RequestMapping("/querycno")//根据课程名查询课程编号
	@ResponseBody
	public String getAdmCno(String Cname) {//spring帮助获取参数
		return courseService.getAdmCno( Cname);
	}
	
	//这是一个github push测试
}