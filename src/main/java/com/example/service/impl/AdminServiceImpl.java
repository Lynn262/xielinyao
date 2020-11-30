package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.pojo.Administrator;
import com.example.dao.AdminDao;
import com.example.service.AdminService;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao = null;

    @Override
    public Administrator getAdmin(String Ano) {
        return adminDao.getAdmin(Ano);
    }

    @Override
    public boolean checkCredential(String ano, String passwd) {
        Administrator admin1 = this.adminDao.getAdmin(ano);
        return passwd.equals(admin1.getApw());
    }
}
