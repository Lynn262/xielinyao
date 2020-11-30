package com.example.service;

import java.util.List;

import com.example.pojo.Administrator;

public interface AdminService {

    Administrator getAdmin(String Ano);

    boolean checkCredential(String id, String passwd);
}
