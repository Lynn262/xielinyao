package com.example.pojo;
//账号类
public class Account{
    private  String User; //用户名
    private String PW;          //密码
    private  String Mail; //注册邮箱

    //账户类构造函数
   // public Account(String User, String PW, String Mail){
   //     this.User = User;
   //     this.PW = PW;
   //     this.Mail = Mail;
   // }
    public void setMail(String Mail)
    {
    	this.Mail = Mail;
    }

    //设置账户密码
    public void setPW(String PW){
        this.PW = PW;
    }

    //核对账户密码
    public boolean checkPW(String PW){
        return this.PW.equals(PW);
    }

    //返回用户名
    public String getid(){
        return this.User;
    }

    //返回密码
    public String getPW(){
        return this.PW;
    }

    //返回注册邮箱
    public String getMail(){
        return this.Mail;
    }
}