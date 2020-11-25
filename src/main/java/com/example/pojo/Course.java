package com.example.pojo;
import org.apache.ibatis.type.Alias;
import java.io.Serializable;

@Alias("course")
//课程类
public class Course {
    private  String cno;   //课程编号
    private String cname;       //课程名称
    private int cterm;          //课程学期
    private int ccredit;        //课程学分
    private String cdept;       //课程所属院系

    //设置课程编号
    public void setCno(String c)
    {
    	cno=c;
    }

    //设置课程名
    public void setCname(String n){
        cname = n;
    }

    //设置课程开设学期
    public void setCterm(int t){
        cterm = t;
    }

    //设置课程学分
    public void setCcredit(int c){
        ccredit = c;
    }

    //设置课程所属院系
    public void setCdept(String d){
        cdept = d;
    }

    //返回课程编号
    public String getCno(){
        return cno;
    }

    //返回课程名称
    public String getCname() {
        return cname;
    }

    //返回课程开设学期
    public int getCterm() {
        return cterm;
    }

    //返回课程学分
    public int getCcredit() {
        return ccredit;
    }

    //返回课程所属院系
    public String getCdept() {
        return cdept;
    }
}
