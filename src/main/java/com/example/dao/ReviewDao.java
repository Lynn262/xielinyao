package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.pojo.Review;

@Mapper
public interface ReviewDao {
	
	List<Review> queryall();
	int saveRev(Review reviewVo);
}