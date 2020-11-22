package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.ProfessorDao;
import com.example.pojo.Professor;
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

	 
}