package com.example.pojo;

import java.sql.Date;
import org.apache.ibatis.type.Alias;
import java.io.Serializable;

@Alias("review")
//评价类
public class Review {
    private  int  id;         //每个评价评价都有唯一的id
    public void setCno(String cno) {
		this.cno = cno;
	}

	public void setPno(String pno) {
		this.pno = pno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	private String cno;     //评价的课程号
    private  String pno;     //评价的教师号
    private  String sno;     //评价的学号
    private java.sql.Date revt;    //评价时间
    private String comment; //评价内容
    private int difficulty; //评价课程的难度
    private  int quality;    //评价课程的质量
    private int state;      //评价的状态，1表示有效，2表示待删除，3表示被举报
    private int downvote;   //评价的踩数量
    private int upvote;     //评价的点赞数量

    //全参数的评价构造器
  //  public Review(int id, String Sno, String Pno, String Cno, String revt, String comment, int difficulty,
   //               int quality, int state, int downvote, int upvote){
  //      this.id = id;
   //     this.Sno = Sno;
   //     this.Pno = Pno;
   //     this.Cno = Cno;
  //      this.revt = revt;
   //     this.comment = comment;
   //     this.difficulty = difficulty;
   //     this.quality = quality;
   //     this.state = state;
   //     this.downvote = downvote;
   //     this.upvote = upvote;
  //  }

    //精简版的评价构造器，只需输入所有必需的参数即可
  //  public Review(int id, String Sno, String Pno, String Cno, String revt, String comment, int difficulty,
    //              int quality,int state){
  //      this.id = id;
 //       this.Sno = Sno;
  //      this.Pno = Pno;
 //       this.Cno = Cno;
  //      this.revt = revt;
  //      this.comment = comment;
  //      this.difficulty = difficulty;
  //      this.quality = quality;
  //      this.state = state;
  //      this.downvote = 0;
  //      this.upvote = 0;
  //  }

    /**
     * 设置评价的状态
     * @param s 评价的状态，1表示有效，2表示待删除，3表示被举报
     */
    
    
    public void setState(int s){
        state = s;
    }

    /**
     * 设置评价踩的数量
     * @param v 设置为1时增加踩的数量1
     * @return 给定参数不符合要求时返回false
     */
    public boolean setDownvote(int v){
        if(v == 1){
            downvote++;
            return true;
        }
        else
            return false;
    }

    /**
     * 设置点赞的数量
     * @param u 设置为1时增加点赞的数量1
     * @return 给定参数不符合要求时返回false
     */
    public boolean setUpvote(int u){
        if(u == 1){
            upvote++;
            return true;
        }
        else
            return false;
    }

    //返回评价id
    public int getId() {
        return id;
    }

    //返回评价的学生学号
    public String getSno() {
        return sno;
    }

    //返回评价的教师的编号
    public String getPno() {
        return pno;
    }

    //返沪评价的课程的课程号
    public String getCno() {
        return cno;
    }

    //返回评价时间
    public Date getRevt() {
        return revt;
    }

    //返回评价的内容
    public String getComment() {
        return comment;
    }

    //返回评价课程的难度
    public int getDifficulty() {
        return difficulty;
    }

    //返回评价课程的质量
    public int getQuality() {
        return quality;
    }

    //返回评价的状态
    public int getState() {
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
