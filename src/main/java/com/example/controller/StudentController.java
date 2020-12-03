package com.example.controller;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.pojo.ReviewFront;
import com.example.pojo.Student;

import com.example.service.StudentService;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService = null;
	
	@GetMapping("/queryall")//查询所有学生
	@ResponseBody
	public List<Student> queryall() {
		List<Student> list =studentService.queryall();
		return list;
	}

	
	@RequestMapping("/querystudent")//查询学生
	@ResponseBody
	public Student getStu(String Sno) {//spring帮助获取参数
		Student student = new Student();
		student =studentService.getStu( Sno);
		return student;
	}
	
	@RequestMapping("/updatestate")//更改昵称
	@ResponseBody
	public int updatestate(String Sno,java.sql.Date Sstate) {//spring帮助获取参数
		
		return studentService.updatestate(Sno,Sstate);
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
	
	@PostMapping("/saveStu")//保存学生
	@ResponseBody
	public int saveStu(HttpServletRequest request, @RequestBody Student stu1) {
		Calendar date1 = Calendar.getInstance(); //当前日期
		//设置账号为有效
		java.sql.Date sqldate1 =
				new java.sql.Date(date1.getTimeInMillis());
		//设置账号有效期
		date1.set(Calendar.YEAR, date1.get(Calendar.YEAR) + 4);
		java.sql.Date sqldate2 =
				new java.sql.Date(date1.getTimeInMillis());
		String str1 = stu1.getSno() + "@cnu.edu.cn";

		//填入缺省值
		stu1.setSmail(str1);
		stu1.setSyear(date1.get(Calendar.YEAR) - 4);
		stu1.setgender("男");
		stu1.setstate(sqldate1);
		stu1.setvalid(sqldate2);

		if(studentService.saveStu(stu1) == 1){
			request.getSession().setAttribute("sno", stu1.getSno());
			return 1;
		}
		else {
			return 0;
		}
	}
	
	@RequestMapping("/deleteStu")//删除学生
	@ResponseBody
	public int deleteStu(String Sno) {
		return studentService.deleteStu(Sno);
	}
	
	
	
	
}