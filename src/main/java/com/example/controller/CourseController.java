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
import com.example.pojo.Professor;
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
	
	@RequestMapping("/savecourse")//添加一个课程
	@ResponseBody
	public int savecourse(@RequestBody Course courseVo) {
		return courseService.savecourse(courseVo);
	}
	
	@RequestMapping("/deletecourse")//删除一个课程
	@ResponseBody
	public int deletecourse(String Cno) {
		return courseService.deletecourse(Cno);
	}
	
	@RequestMapping("/querycno")//根据课程名查询课程编号
	@ResponseBody
	public String getAdmCno(String Cname) {//spring帮助获取参数
		return courseService.getAdmCno( Cname);
	}
	
	@RequestMapping("/updatecname")//更改课程名称
	@ResponseBody
	public int updatecname(String Cno,String Cname) {//spring帮助获取参数
		
		return courseService.updatecname(Cno,Cname);
	}
	
	@RequestMapping("/updatecterm")//更改课程学期
	@ResponseBody
	public int updatecterm(String Cno,String Cterm) {//spring帮助获取参数
		
		return courseService.updatecterm(Cno,Cterm);
	}
	
	@RequestMapping("/updateccredit")//更改课程学分
	@ResponseBody
	public int updatecredit(String Cno,String Ccredit) {//spring帮助获取参数
		
		return courseService.updatecredit(Cno,Ccredit);
	}
	
	//这是一个github push测试
}