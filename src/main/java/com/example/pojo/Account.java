package com.example.pojo;

import com.fasterxml.jackson.annotation.JsonAlias;
import org.apache.ibatis.type.Alias;
import java.io.Serializable;
//账号类，学生和管理员的基类
@Alias("account")
public class Account{
    private  String sno; //用户名

    @JsonAlias({"pw"})
    private String spw;          //密码
    private  String smail; //注册邮箱

    //设置账户名
    public void setSno(String sno) {
        this.sno = sno;
    }

    //设置用户的邮箱地址
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
    public String getsno(){
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