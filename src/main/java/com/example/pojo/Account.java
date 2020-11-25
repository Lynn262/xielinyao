package com.example.pojo;

import org.apache.ibatis.type.Alias;
import java.io.Serializable;
//账号类
@Alias("account")
public class Account{
    private  String sno; //用户名
    private String spw;          //密码
    private  String smail; //注册邮箱

    //账户类构造函数
   // public Account(String User, String PW, String Mail){
   //     this.User = User;
   //     this.PW = PW;
   //     this.Mail = Mail;
   // }
    public void setMail(String Mail)
    {
    	this.smail = Mail;
    }

    //设置账户密码
    public void setPW(String PW){
        this.spw = PW;
    }

    //核对账户密码
    public boolean checkPW(String PW){
        return this.spw.equals(PW);
    }

    //返回用户名
    public String getid(){
        return this.sno;
    }

    //返回密码
    public String getPW(){
        return this.spw;
    }

    //返回注册邮箱
    public String getMail(){
        return this.smail;
    }
}