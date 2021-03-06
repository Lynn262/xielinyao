package com.example.pojo;

import java.sql.Date;
import org.apache.ibatis.type.Alias;
import java.io.Serializable;

@Alias("reviewfront")
//评价类
public class ReviewFront {
	private String id_review;         //每个评价评价都有唯一的id
	private String uname;
	private String cname;     //评价的课程号
	private String pname;     //评价的教师号
	private java.sql.Date revt;    //评价时间
	private String comment; //评价内容
	private byte personality; //教师素养
	private byte difficulty; //评价课程的难度
	private byte quality;    //受益程度
	private byte state;      //评价的状态，1表示有效，2表示待删除，3表示被举报不文明，4表示被举报广告，5表示被举报色情，6表示泄露隐私
	private int downvote;   //评价的踩数量
	private int upvote;     //评价的点赞数量

	//设置评论id
	public void setId_review(String id_review) {
		this.id_review = id_review;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	//设置评价时间
	public void setRevt(Date revt) {
		this.revt = revt;
	}

	//设置评价内容
	public void setComment(String comment) {
		this.comment = comment;
	}

	//设置评价的教师素养
	public void setPersonality(byte personality) {
		this.personality = personality;
	}

	//设置评价的课程难度
	public void setDifficulty(byte difficulty) {
		this.difficulty = difficulty;
	}

	//设置评价的受益程度
	public void setQuality(byte quality) {
		this.quality = quality;
	}

	/**
	 * 设置评价的状态
	 *
	 * @param s 评价的状态，1表示有效，2表示待删除，3表示被举报
	 */
	public void setState(byte s) {
		state = s;
	}

	/**
	 * 设置评价踩的数量
	 *
	 * @param v 设置为1时增加踩的数量1
	 * @return 给定参数不符合要求时返回false
	 */
	public boolean setDownvote(int v) {
		if (v == 1) {
			downvote++;
			return true;
		} else
			return false;
	}

	/**
	 * 设置点赞的数量
	 *
	 * @param u 设置为1时增加点赞的数量1
	 * @return 给定参数不符合要求时返回false
	 */
	public boolean setUpvote(int u) {
		if (u == 1) {
			upvote++;
			return true;
		} else
			return false;
	}

	//返回评价id
	public String getId_review() {
		return id_review;
	}

	public String getUname() {
		return uname;
	}

	public String getCname() {
		return cname;
	}

	public String getPname() {
		return pname;
	}

	//返回评价时间
	public Date getRevt() {
		return revt;
	}

	//返回评价的内容
	public String getComment() {
		return comment;
	}

	//返回评价老师的
	public byte getPersonality() {
		return personality;
	}

	//返回评价课程的难度
	public byte getDifficulty() {
		return difficulty;
	}

	//返回评价课程的质量
	public byte getQuality() {
		return quality;
	}

	//返回评价的状态
	public byte getState() {
		return state;
	}

	//返回评价的踩的数量
	public int getDownvote() {
		return downvote;
	}

	//返回评价的点赞的数量
	public int getUpvote() {
		return upvote;
	}

}