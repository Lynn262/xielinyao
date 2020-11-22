package com.example.pojo;

//课程类
public class Course {
    private  String Cno;   //课程编号
    private String Cname;       //课程名称
    private int Cterm;          //课程学期
    private int Ccredit;        //课程学分
    private String Cdept;       //课程所属院系

    //课程构造函数
  //  public Course(String no, String name, int term, int credit, String dept){
    //    Cno = no;
      //  Cname = name;
        //Cterm = term;
        //Ccredit = credit;
        //Cdept = dept;
   // }
    public void setCno(String c)
    {
    	Cno=c;
    }

    //设置课程名
    public void setCname(String n){
        Cname = n;
    }

    //设置课程开设学期
    public void setCterm(int t){
        Cterm = t;
    }

    //设置课程学分
    public void setCcredit(int c){
        Ccredit = c;
    }

    //设置课程所属院系
    public void setCdept(String d){
        Cdept = d;
    }

    //返回课程编号
    public String getCno(){
        return Cno;
    }

    //返回课程名称
    public String getCname() {
        return Cname;
    }

    //返回课程开设学期
    public int getCterm() {
        return Cterm;
    }

    //返回课程学分
    public int getCcredit() {
        return Ccredit;
    }

    //返回课程所属院系
    public String getCdept() {
        return Cdept;
    }
}
