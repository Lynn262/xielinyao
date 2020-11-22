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

import com.example.pojo.Professor;

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
	
	
}