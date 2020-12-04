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
import com.example.pojo.Student;
import com.example.service.ProfessorService;

@Controller
@RequestMapping("/professor")
public class ProfessorController {

	@Autowired
	private ProfessorService professorService = null;


	
	@RequestMapping("/queryprofessor")//查询教师
	@ResponseBody
	public Professor getPrf(String Pno) {//spring帮助获取参数
		Professor professor = new Professor();
		professor =professorService.getPrf(Pno);
		return professor;
	}
	
	@GetMapping("/queryall")//查询所有教师
	@ResponseBody
	public List<Professor> queryall() {
		List<Professor> list =professorService.queryall();
		return list;
	}
	
	@RequestMapping("/updatepdept")//更改学院
	@ResponseBody
	public int updatepdept(String Pno,String Pdept) {//spring帮助获取参数
		
		return professorService.updatepdept(Pno,Pdept);
	}
	
	
	@RequestMapping("/updateppos")//更改职位
	@ResponseBody
	public int updateppos(String Pno,String Ppos) {//spring帮助获取参数
		
		return professorService.updateppos(Pno,Ppos);
	}
	
	@RequestMapping("/querypno")//根据教师名查询教师号
	@ResponseBody
	public String getPno(String Pname) {//spring帮助获取参数
		return professorService.getPno(Pname);
	}
	
	@RequestMapping("/savePrf")//添加一个教师
	@ResponseBody
	public int savePrf(@RequestBody Professor professorVo) {
		return professorService.savePrf(professorVo);
	}
	
	@RequestMapping("/deletePrf")//删除一个教师
	@ResponseBody
	public int deletePrf(String Pno) {
		return professorService.deletePrf(Pno);
	}
	
}