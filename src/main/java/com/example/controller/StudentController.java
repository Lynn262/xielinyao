package com.example.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
	
	@PostMapping("/saveStu")//查询所有评价
	@ResponseBody
	public int saveStu(@RequestBody Student stu1) {
		System.out.println(stu1.getSno());
		System.out.println(stu1.getSname());
		Date date1 = new Date();
		java.sql.Date sqldate = new java.sql.Date(date1.getTime());
		String str1 = stu1.getSno() + "@cnu.edu.cn";

		//填入缺省值
		stu1.setSmail(str1);
		stu1.setSyear(date1.getYear());
		stu1.setgender("0");
		stu1.setvalid(sqldate);
		stu1.setstate(sqldate);

		return studentService.saveStu(stu1);
	}
	
	@RequestMapping("/deleteStu")//查询所有评价
	@ResponseBody
	public int deleteStu(String Sno) {
		return studentService.deleteStu(Sno);
	}
	
	
	
	
}