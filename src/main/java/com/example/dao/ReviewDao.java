package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.pojo.Review;
import com.example.pojo.ReviewFront;

@Mapper
public interface ReviewDao {
	
	List<ReviewFront> queryall();
	int saveRev(Review reviewVo);
}