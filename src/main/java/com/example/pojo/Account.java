package com.example.pojo;

import org.apache.ibatis.type.Alias;
import java.io.Serializable;
//账号类
@Alias("account")
public class Account{
    private  String user; //用户名
    private String pw;          //密码
    private  String mail; //注册邮箱

    //账户类构造函数
   // public Account(String User, String PW, String Mail){
   //     this.User = User;
   //     this.PW = PW;
   //     this.Mail = Mail;
   // }
    public void setMail(String Mail)
    {
    	this.mail = Mail;
    }

    //设置账户密码
    public void setPW(String PW){
        this.pw = PW;
    }

    //核对账户密码
    public boolean checkPW(String PW){
        return this.pw.equals(PW);
    }

    //返回用户名
    public String getid(){
        return this.user;
    }

    //返回密码
    public String getPW(){
        return this.pw;
    }

    //返回注册邮箱
    public String getMail(){
        return this.mail;
    }
}