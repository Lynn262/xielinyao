package com.example.service;

import java.util.List;

import com.example.pojo.Review;

public interface ReviewService {
	
	List<Review> queryall();
	
	int saveRev(Review reviewVo);
	
}
