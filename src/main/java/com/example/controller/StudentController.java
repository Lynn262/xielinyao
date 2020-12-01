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

import com.example.pojo.Review;
import com.example.pojo.Student;

import com.example.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService = null;


	
	@RequestMapping("/querystudent")//查询课程
	@ResponseBody
	public Student getStu(String Sno) {//spring帮助获取参数
		Student student = new Student();
		student =studentService.getStu( Sno);
		return student;
	}
	
	@RequestMapping("/updatesnickname")//更改昵称
	@ResponseBody
	public int updatesnickname(String Sno,String Snickname) {//spring帮助获取参数
		
		return studentService.updatesnickname(Sno,Snickname);
	}
	
	@RequestMapping("/updatespw")//更改密码
	@ResponseBody
	public int updatespw(String Sno,String Spw) {//spring帮助获取参数
		
		return studentService.updatespw(Sno,Spw);
	}
	
	@RequestMapping("/saveStu")//查询所有评价
	@ResponseBody
	public int saveStu(@RequestBody Student studentVo) {
		return studentService.saveStu(studentVo);
	}
	
	@RequestMapping("/deleteStu")//查询所有评价
	@ResponseBody
	public int deleteStu(String Sno) {
		return studentService.deleteStu(Sno);
	}
	
	
	
	
}