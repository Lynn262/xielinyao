package com.example.pojo;

import java.sql.Date;
import org.apache.ibatis.type.Alias;
import java.io.Serializable;

@Alias("reviewfront")
//评价类
public class ReviewFront {
	private String cname;     //评价的课程
    public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getSnickname() {
		return snickname;
	}
	public void setSnickname(String sname) {
		this.snickname = sname;
	}
	public java.sql.Date getRevt() {
		return revt;
	}
	public void setRevt(java.sql.Date revt) {
		this.revt = revt;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getDownvote() {
		return downvote;
	}
	public void setDownvote(int downvote) {
		this.downvote = downvote;
	}
	public int getUpvote() {
		return upvote;
	}
	public void setUpvote(int upvote) {
		this.upvote = upvote;
	}
	private  String pname;     //评价的教师
    private  String snickname;     //评价的人
    private java.sql.Date revt;    //评价时间
    private String comment; //评价内容
    private int difficulty; //评价课程的难度
    private  int quality;    //评价课程的质量
    private int state;      //评价的状态，1表示有效，2表示待删除，3表示被举报
    private int downvote;   //评价的踩数量
    private int upvote;     //评价的点赞数量
	
	
}