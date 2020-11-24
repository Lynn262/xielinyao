package com.example.pojo;
import org.apache.ibatis.type.Alias;
import java.io.Serializable;

@Alias("professor")
//教师类
public class Professor {
    private  String pno;   //教师编号
    private String pname;       //教师姓名
    private String ppos;        //教师职位
    private String pinfo;       //教师信息
    private String pdept;       //教师所属院系

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
        pname = n;
    }

    //设置教师职位
    public void setPpos(String p) {
        ppos = p;
    }

    //设置教师信息
    public void setPinfo(String i) {
        pinfo = i;
    }

    //设置教师所属院系
    public void setPdept(String d) {
        pdept = d;
    }

    //返回教师编号
    public String getPno(){
        return pno;
    }

    //返回教师姓名
    public String getPname() {
        return pname;
    }

    //返回教师职位
    public String getPpos() {
        return ppos;
    }

    //返回教师信息
    public String getPinfo() {
        return pinfo;
    }

    //返回教师所属院系
    public String getPdept() {
        return pdept;
    }
}
