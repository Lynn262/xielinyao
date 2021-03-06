package com.example.pojo;
import org.apache.ibatis.type.Alias;
import java.io.Serializable;

@Alias("professor")
//教师类
public class Professor {
    private  String pno;   //教师编号
    private String pname;       //教师姓名
    private float prating;      //教授评级
    private String pschool;     //教师学校
    private String pdept;       //教师所属院系

    //设置教师编号
    public void setPno(String pno) {
        this.pno = pno;
    }

    //设置教师姓名
    public void setPname(String n){
        pname = n;
    }

    public void setPrating(float prating) {
        this.prating = prating;
    }

    public void setPschool(String pschool) {
        this.pschool = pschool;
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

    public float getPrating() {
        return prating;
    }

    public String getPschool() {
        return pschool;
    }

    //返回教师所属院系
    public String getPdept() {
        return pdept;
    }
}
