package com.example.pojo;

import java.util.Date;

//学生类
public class Student extends Account{
    private String Sname;       //学生姓名
    private String Snickname;   //学生昵称
    private int Syear;          //学生入学年份
    private String Sgender;     //学生性别
    private Date Svalid;        //学生账号的有效期
    private Date Sstate;        //学生账号目前的状态，如果大于当前日期则表示处于封禁状态

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

    //设置学生姓名
    public void setSname(String Sname){
        this.Sname = Sname;
    }

    //设置学生昵称
    public void setSnickname(String Snickname){
        this.Snickname = Snickname;
    }

    //设置学生入学年份，虽然我觉得这个东西注册之后应该就不需要改变了
    public void setSyear(int Syr){
        Syear = Syr;
    }

    //设置学生性别，虽然也什么用
    public void setgender(String g){
        Sgender = g;
    }

    /**
     * 设置学生账号的有效期
     * @param v 学生账号有效期到什么时候
     */
    public void setvalid(Date v){
        Svalid = v;
    }

    /**
     * 设置学生账号的状态
     * @param st 该账号从何时开始起效，如果大于当前日期则表明被封禁
     */
    public void setstate(Date st){
        Sstate = st;
    }

    //返回学生姓名
    public String getSname(){
        return Sname;
    }

    //返回学生用户名
    public String getSnickname(){
        return Snickname;
    }

    //返回学生入学年份
    public int getSyear(){
        return Syear;
    }

    //返回学生性别
    public String getSgender(){
        return Sgender;
    }

    //返回学生账号的有效期
    public Date getSvalid(){
        return Svalid;
    }

    //返回学生账号状态
    public Date getState(){
        return Sstate;
    }

    /**
     * 返回账号是否在有效期内，
     * @param d1 指定日期
     * @return 指定日期是否在该账号的有效期内，负数为无效
     */
    public int isValid(Date d1){
        return Svalid.compareTo(d1);
    }

    /**
     * 返回账号是否被封禁
     * @param d1 指定日期
     * @return 账号在指定日期中是否被封禁，负数为被封禁
     */
    public int isActive(Date d1){
        return d1.compareTo(Sstate);
    }
}
