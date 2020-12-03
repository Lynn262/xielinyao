package com.example.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

	@GetMapping("/queryByStu") //查询某个学生发布的所有评价
	@ResponseBody
	public List<ReviewFront> queryByStu(String Sno){
		List<ReviewFront> list = reviewService.queryByStu(Sno);
		return list;
	}

	@RequestMapping("/saveRev")//保存评价
	@ResponseBody
	public int saveRev(@RequestBody Review reviewVo) {
		System.out.println(reviewVo.getComment());
		return reviewService.saveRev(reviewVo);
	}
	
	@RequestMapping("/upvote")//给编号为id_review的评价点赞
	@ResponseBody
	public int upvote(int id_review) {
		
		return reviewService.upvote(id_review);
	}
	
	@RequestMapping("/downvote")//给编号为id_review的评价踩
	@ResponseBody
	public int downvote(int id_review) {
		
		return reviewService.downvote(id_review);
	}

	@PostMapping("/tryDele")
	@ResponseBody
	public int tryDele(int id_review){ //尝试申请删除评价
		Review rev1 = reviewService.getRev(id_review);
		if(rev1 != null){
			if(rev1.getSno().equals("1181002035")){ //仅供占位用，用于确认用户是否有权限请求删除该评价，部署时应利用session中保存的sno
				if(reviewService.tryDele(id_review)){
					return 1;
				}
			}
		}
		return 0;
	}
	
	@GetMapping("/queryreview")//查询与教师名或课程名部分匹配的评价
	@ResponseBody
	public List<ReviewFront> queryreview(String PCname) {
		List<ReviewFront> list =reviewService.queryreview(PCname);
		System.out.println(PCname);
		return list;
	}

	@PostMapping("/reportRev") //举报评价
	@ResponseBody
	public int reportRev(int id_review){
		Review rev1 = reviewService.getRev(id_review);
		if(rev1 != null){
			if(reviewService.reportRev(id_review)){
				return 1;
			}
		}
		return 0;
	}
}