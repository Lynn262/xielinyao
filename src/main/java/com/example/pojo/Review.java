package com.example.pojo;

import java.sql.Date;
import org.apache.ibatis.type.Alias;

@Alias("review")
//评价类
public class Review {
    private  int id_review;         //每个评价评价都有唯一的id
	private String cno;     //评价的课程号
    private  String pno;     //评价的教师号
    private  String sno;     //评价的学号
    private java.sql.Date revt;    //评价时间
    private String comment; //评价内容
    private int personality; //教师素养
    private int difficulty; //评价课程的难度
    private  int quality;    //受益程度
    private int state;      //评价的状态，1表示有效，2表示待删除，3表示被举报不文明，4表示被举报广告，5表示被举报色情，6表示泄露隐私
    private int downvote;   //评价的踩数量
    private int upvote;     //评价的点赞数量

    //设置评论id
    public void setId_review(int id_review) {
        this.id_review = id_review;
    }

    //设置评价的课程编号
    public void setCno(String cno) {
        this.cno = cno;
    }

    //设置评价的老师的编号
    public void setPno(String pno) {
        this.pno = pno;
    }

    //设置评价的学号
    public void setSno(String sno) {
        this.sno = sno;
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
    public void setPersonality(int personality) {
        this.personality = personality;
    }

    //设置评价的课程难度
    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    //设置评价的受益程度
    public void setQuality(int quality) {
        this.quality = quality;
    }

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
    public int getId_review() {
        return id_review;
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

    //返回评价老师的
    public int getPersonality() {
        return personality;
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
