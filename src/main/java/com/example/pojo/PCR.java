package com.example.pojo;

//任课类
public class PCR {
    private String Pno; //任课教师编号
    private String Cno; //课程编号
    private int PCRt;   //教师教授这门课程的年份

    //任课类构造器
    public PCR(String Pno, String Cno, int t){
        this.Pno = Pno;
        this.Cno = Cno;
        PCRt = t;
    }

    //设置任课教师的编号
    public void setPno(String pno) {
        Pno = pno;
    }

    //设置任课课程的编号
    public void setCno(String cno) {
        Cno = cno;
    }

    //设置教师教授该课程的年份
    public void setPCRt(int PCRt) {
        this.PCRt = PCRt;
    }

    //返回任课教师编号
    public String getPno() {
        return Pno;
    }

    //返回课程编号
    public String getCno() {
        return Cno;
    }

    //返回教师教授该课程的年份
    public int getPCRt() {
        return PCRt;
    }
}
