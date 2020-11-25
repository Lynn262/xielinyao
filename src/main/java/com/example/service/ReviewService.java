package com.example.service;

import java.util.List;

import com.example.pojo.Review;
import com.example.pojo.ReviewFront;

public interface ReviewService {
	
	List<ReviewFront> queryall();
	
	int saveRev(Review reviewVo);
	
}
