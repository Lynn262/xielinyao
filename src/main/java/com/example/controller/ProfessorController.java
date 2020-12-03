package com.example.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.pojo.Professor;
import com.example.pojo.Student;
import com.example.service.ProfessorService;

@Controller
@RequestMapping("/professor")
public class ProfessorController {

	@Autowired
	private ProfessorService professorService = null;


	
	@RequestMapping("/queryprofessor")//查询课程
	@ResponseBody
	public Professor getPrf(String Pno) {//spring帮助获取参数
		Professor professor = new Professor();
		professor =professorService.getPrf(Pno);
		return professor;
	}
	
	@RequestMapping("/querypno")//根据教师名查询教师号
	@ResponseBody
	public String getPno(String Pname) {//spring帮助获取参数
		return professorService.getPno(Pname);
	}
	
	@RequestMapping("/savePrf")//查询所有评价
	@ResponseBody
	public int savePrf(@RequestBody Professor professorVo) {
		return professorService.savePrf(professorVo);
	}
	
	@RequestMapping("/deletePrf")//查询所有评价
	@ResponseBody
	public int deletePrf(String Pno) {
		return professorService.deletePrf(Pno);
	}
	
}