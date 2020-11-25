package com.example.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.pojo.Review;
import com.example.pojo.ReviewFront;
import com.example.service.ReviewService;


@Controller
@RequestMapping("/review")
public class ReviewController {

	@Autowired
	private ReviewService reviewService = null;
	
	@RequestMapping("/queryall")//查询所有评价
	@ResponseBody
	public List<ReviewFront> queryall() {
		System.out.println("111");
		List<ReviewFront> list =reviewService.queryall();
		return list;
	}
	
	@RequestMapping("/saveRev")//查询所有评价
	@ResponseBody
	public int saveRev(@RequestBody Review reviewVo) {
		System.out.println(reviewVo.getComment());
		return reviewService.saveRev(reviewVo);
	}
	
	//这是一个github push测试
}