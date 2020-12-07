package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.ReviewDao;
import com.example.pojo.Review;
import com.example.pojo.ReviewFront;
import com.example.service.ReviewService;

@Service
@Transactional
public class ReviewServiceImpl implements ReviewService {
	
	@Autowired
	private ReviewDao reviewDao = null;
	
	@Override
	public List<ReviewFront> queryall() {
		return reviewDao.queryall();
	}
	
	@Override
	public int saveRev(Review reviewVo) {

		//敏感词审核
		String comment = reviewVo.getComment();
		boolean cond1 = comment.contains("操你");
		boolean cond2 = comment.contains("操它");
		boolean cond3 = comment.contains("操她");
		boolean cond4 = comment.contains("操他");
		boolean cond5 = comment.contains("操了");
		boolean cond6 = comment.contains("傻逼");
		boolean cond7 = comment.contains("煞笔");
		boolean cond8 = comment.contains("沙比");
		boolean cond9 = comment.contains("傻比");
		boolean cond10 = comment.contains("操了");
		boolean cond11 = comment.contains("妈的");
		boolean cond12 = comment.contains("司马");
		boolean cond13 = comment.contains("死妈");
		boolean cond14 = comment.contains("升天");
		boolean cond15 = comment.contains("暴毙");
		boolean cond16 = comment.contains("全家");
		boolean cond17 = comment.contains("你妈");
		boolean cond18 = comment.contains("尼玛");
		boolean cond19 = comment.contains("肏");
		boolean cond20 = comment.contains("fuck");
		boolean cond21 = comment.contains("slut");
		boolean cond22 = comment.contains("cunt");
		boolean cond23 = comment.contains("shit");
		//如果符合以上条件则交给管理员审核
		if(cond1 || cond2 || cond3 || cond4 || cond5 || cond6 || cond7 || cond8 || cond9 || cond10
				|| cond11 || cond12 || cond13 || cond14 || cond15 || cond16 || cond17 || cond18 || cond19 ||
				cond20 || cond21 || cond22 || cond23){
			reviewVo.setState(3);
		}

		return reviewDao.saveRev(reviewVo);
	}
	@Override
	public int upvote(int id_review) {
		return reviewDao.upvote(id_review);
	}

	@Override
	public int downvote(int id_review) {
		return reviewDao.downvote(id_review);
	}

	@Override
	public List<ReviewFront> queryByStu(String sno) {
		return reviewDao.queryByStu(sno);
	}

	/**
	 * @param id_review 需要更改状态的评价的id
	 * @return 如果评价已被举报则返回false，如果评价可以被申请删除则返回true
	 */
	@Override
	public boolean tryDele(int id_review) {
		Review rev1 = reviewDao.getRev(id_review);
		if(rev1.getState() > 2){ //如果评价已经被举报，则返回0
			return false;
		}
		else{
			reviewDao.modState(id_review, 2);
			return true;
		}
	}

	@Override
	public Review getRev(int id_review) {
		return reviewDao.getRev(id_review);
	}
	
	@Override
	public List<ReviewFront> queryreview(String PCname)  {
		return reviewDao.queryreview( PCname);
	}

	/**
	 *
	 * @param id_review 被举报的评价的id
	 * @param rtype 被举报的类型
	 * @return 是否举报成功
	 */
	@Override
	public boolean reportRev(int id_review, int rtype) {
		Review rev1 = reviewDao.getRev(id_review);
		if(rev1.getState() == 1){ //如果评价处于有效状态则更改其状态为被举报
			reviewDao.modState(id_review, rtype);
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public List<ReviewFront> getReport() {
		return reviewDao.getReport();
	}

	@Override
	public void approveRev(int id_review) {
		reviewDao.modState(id_review, 1);
	}

	@Override
	public int deleRev(int id_review) {
		return reviewDao.deleRev(id_review);
	}
}