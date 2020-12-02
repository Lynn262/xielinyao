package com.example.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonAlias;
import org.apache.ibatis.type.Alias;
import java.io.Serializable;

@Alias("student")
//学生类
public class Student{

    private String sno;

    //@JsonAlias({"pw"})
    private String spw;
    private String smail;
    private String sname;       //学生姓名
    private String snickname;   //学生昵称
    private int syear;          //学生入学年份
    private String sgender;     //学生性别
    private java.sql.Date svalid;        //学生账号的有效期
    private java.sql.Date sstate;        //学生账号目前的状态，如果大于当前日期则表示处于封禁状态


    //全参数的构造器，需要所有参数
  //  public Student(String User, String PW, String Mail, String Snickname, int Syear, Date Svalid, Date Sstate,
  //                 String Sname, String Sgender) {
  //      super(User, PW, Mail);
  //      this.Snickname = Snickname;
  //      this.Syear = Syear;
  //      this.Svalid = Svalid;
 //      this.Sstate = Sstate;
  //      this.Sname = Sname;
   //     this.Sgender = Sgender;
  //  }

    //精简版的构造器，姓名和性别设置为默认值，分别是空字符串和other
   // public Student(String User, String PW, String Mail, String Snickname, int Syear, Date Svalid, Date Sstate){
       
  //      this.Snickname = Snickname;
  //      this.Syear = Syear;
  //      this.Svalid = Svalid;
  //      this.Sstate = Sstate;
   //     this.Sname = "";
   //     this.Sgender = "other";
  //  }


    public void setSno(String sno) {
        this.sno = sno;
    }

    public void setSpw(String spw) {
        this.spw = spw;
    }

    public void setSmail(String smail) {
        this.smail = smail;
    }

    //设置学生姓名
    public void setSname(String Sname){
        this.sname = Sname;
    }

    //设置学生昵称
    public void setSnickname(String Snickname){
        this.snickname = Snickname;
    }

    //设置学生入学年份，虽然我觉得这个东西注册之后应该就不需要改变了
    public void setSyear(int Syr){
        syear = Syr;
    }

    //设置学生性别，虽然也什么用
    public void setgender(String g){
        sgender = g;
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

    public String getSno() {
        return sno;
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

    //返回学生用户名
    public String getSnickname(){
        return snickname;
    }

    //返回学生入学年份
    public int getSyear(){
        return syear;
    }

    //返回学生性别
    public String getSgender(){
        return sgender;
    }

    //返回学生账号的有效期
    public Date getSvalid(){
        return svalid;
    }

    //返回学生账号状态
    public Date getState(){
        return sstate;
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
