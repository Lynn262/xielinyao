package com.example.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonAlias;
import org.apache.ibatis.type.Alias;
import java.io.Serializable;

//学生类
@Alias("student")
public class Student{

    private String uid;
    private String school;
    private String smail;
    private String sname;   //学生昵称
    private String spw;
    private java.sql.Date svalid;    //学生账号的有效期
    private java.sql.Date sstate;   //学生账号目前的状态，如果大于当前日期则表示处于封禁状态
    private byte attempt; //最近半个小时内的登录尝试次数
    private java.sql.Date lastlogin;

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setSmail(String smail) {
        this.smail = smail;
    }

    //设置学生姓名
    public void setSname(String Sname){
        this.sname = Sname;
    }

    public void setSpw(String spw) {
        this.spw = spw;
    }

    /**
     * 设置学生账号的有效期
     * @param v 学生账号有效期到什么时候
     */
    public void setvalid(java.sql.Date v){
        svalid = v;
    }

    /**
     * 设置学生账号的状态
     * @param st 该账号从何时开始起效，如果大于当前日期则表明被封禁
     */
    public void setstate(java.sql.Date st){
        sstate = st;
    }

    public void setAttempt(byte attempt) {
        this.attempt = attempt;
    }

    public void setLastlogin(java.sql.Date lastlogin) {
        this.lastlogin = lastlogin;
    }

    public String getUid() {
        return uid;
    }

    public String getSchool() {
        return school;
    }

    public String getSpw() {
        return spw;
    }

    public String getSmail() {
        return smail;
    }

    //返回学生姓名
    public String getSname(){
        return sname;
    }

    //返回学生账号的有效期
    public Date getSvalid(){
        return svalid;
    }

    //返回学生账号状态
    public Date getSstate(){
        return sstate;
    }

    public byte getAttempt() {
        return attempt;
    }

    public java.sql.Date getLastlogin() {
        return lastlogin;
    }

    /**
     * 返回账号是否在有效期内，
     * @param d1 指定日期
     * @return 指定日期是否在该账号的有效期内，负数为无效
     */
    public int isValid(Date d1){
        return svalid.compareTo(d1);
    }

    /**
     * 返回账号是否被封禁
     * @param d1 指定日期
     * @return 账号在指定日期中是否被封禁，负数为被封禁
     */
    public int isActive(Date d1){
        return d1.compareTo(sstate);
    }

    //核对账户密码
    public boolean checkSpw(String PW){
        return this.spw.equals(PW);
    }
}
