package com.example.pojo;

//教师类
public class Professor {
    private  String Pno;   //教师编号
    private String Pname;       //教师姓名
    private String Ppos;        //教师职位
    private String Pinfo;       //教师信息
    private String Pdept;       //教师所属院系

    //教师类构造器
   // public Professor(String no, String name, String pos, String info, String dept){
   //     Pno = no;
    //    Pname = name;
   //     Ppos = pos;
   //     Pinfo = info;
  //      Pdept = dept;
  //  }

    //设置教师姓名
    public void setPname(String n){
        Pname = n;
    }

    //设置教师职位
    public void setPpos(String p) {
        Ppos = p;
    }

    //设置教师信息
    public void setPinfo(String i) {
        Pinfo = i;
    }

    //设置教师所属院系
    public void setPdept(String d) {
        Pdept = d;
    }

    //返回教师编号
    public String getPno(){
        return Pno;
    }

    //返回教师姓名
    public String getPname() {
        return Pname;
    }

    //返回教师职位
    public String getPpos() {
        return Ppos;
    }

    //返回教师信息
    public String getPinfo() {
        return Pinfo;
    }

    //返回教师所属院系
    public String getPdept() {
        return Pdept;
    }
}
