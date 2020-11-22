package com.example.pojo;

//选课类
public class SCR {
    private String Sno; //选课学生的学号
    private String Pno; //所选课程教师的编号
    private String Cno; //所选课程的编号

    //选课类构造器
    public SCR(String Sno, String Pno, String Cno){
        this.Sno = Sno;
        this.Pno = Pno;
        this.Cno = Cno;
    }

    //设置选课学生的学号
    public void setSno(String sno) {
        Sno = sno;
    }

    //设置所报课程的教师编号
    public void setPno(String pno) {
        Pno = pno;
    }

    //设置所报课程的编号
    public void setCno(String cno) {
        Cno = cno;
    }

    //返回选课学生的学号
    public String getSno() {
        return Sno;
    }

    //返回所选课程的教师编号
    public String getPno() {
        return Pno;
    }

    //返回所选课程编号
    public String getCno() {
        return Cno;
    }
}
