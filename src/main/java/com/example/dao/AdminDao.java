package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.pojo.Administrator;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AdminDao {

    Administrator getAdmin(String ano);
}
