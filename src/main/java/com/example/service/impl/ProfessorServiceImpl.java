package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.ProfessorDao;
import com.example.pojo.Professor;
import com.example.pojo.Student;
import com.example.service.ProfessorService;

@Service
@Transactional
public class ProfessorServiceImpl implements ProfessorService {
	
	@Autowired
	private ProfessorDao professorDao = null;
	
	@Override
	public Professor getPrf( String Pno) {
		return professorDao.getPrf(Pno);
	}
	
	@Override
	public List<Professor> queryall() {
		return professorDao.queryall();
	}

	@Override
	public int savePrf(Professor professorVo) {
		return professorDao.savePrf(professorVo);
	}
	
	@Override
	public int updatepdept(String Pno,String Pdept) {	
		return professorDao.updatepdept(Pno,Pdept);
	}
	
	@Override
	public int updateppos(String Pno,String Ppos) {	
		return professorDao.updateppos(Pno,Ppos);
	}
	
	@Override
	public int deletePrf(String Pno) {
		return professorDao.deletePrf(Pno);
	}
	
	@Override
	public String getPno( String Pname) {
		return professorDao.getPno(Pname);
	}
	 
}