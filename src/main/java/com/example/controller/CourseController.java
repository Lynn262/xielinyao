package com.example.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.pojo.Course;
import com.example.pojo.Professor;
import com.example.service.CourseService;

@Controller
@RequestMapping("/course")
public class CourseController {

	@Autowired
	private CourseService courseService = null;

	@GetMapping("/getallc")
	@ResponseBody
	public List<Course> getallc(){
		return courseService.getallc();
	}

	@GetMapping("/querybyname")
	@ResponseBody
	public List<Course> queryBycname(String cname){
		return courseService.queryCname(cname);
	}
	
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

	@PostMapping("/updatecourse")
	@ResponseBody
	public int updatecouse(@RequestBody Course c1){
		Course c2 = courseService.getAdmCrs(c1.getCno());

		if(c2 != null){
			if(c2.getCname() != c1.getCname()){
				courseService.updatecname(c2.getCno(), c1.getCname());
			}
			if(c2.getCcredit() != c1.getCcredit()){
				courseService.updatecredit(c2.getCno(), c1.getCterm());
			}
			if(c2.getCterm() != c1.getCterm()){
				courseService.updatecterm(c2.getCno(), c1.getCterm());
			}
			if(c2.getCdept() != c1.getCdept()){
				courseService.updatecdept(c2.getCno(), c1.getCdept());
			}
			return 1;
		}
		return 0;
	}
	
	@DeleteMapping("/deletecourse")//删除一个课程
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
	public int updatecterm(String Cno,int Cterm) {//spring帮助获取参数
		
		return courseService.updatecterm(Cno,Cterm);
	}
	
	@RequestMapping("/updateccredit")//更改课程学分
	@ResponseBody
	public int updatecredit(String Cno,int Ccredit) {//spring帮助获取参数
		
		return courseService.updatecredit(Cno,Ccredit);
	}
	
	//这是一个github push测试
}