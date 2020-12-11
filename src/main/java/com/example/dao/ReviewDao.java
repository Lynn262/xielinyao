package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.pojo.Review;
import com.example.pojo.ReviewFront;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ReviewDao {
	
	List<ReviewFront> queryall();
	int saveRev(Review reviewVo);
	
	int upvote(int id_review);
	int downvote(int id_review);

	List<ReviewFront> queryByStu(String sno);

	Review getRev(int id_review);

	/**
	 * @param id_review 需要更改状态的评价id
	 * @param n 将该评价的状态更改至多少
	 */
	void modState(int id_review, int n);
	
	List<ReviewFront> queryreview(String PCname);

	List<Review> getReport();

	int deleRev(int id_review);
}