package com.example.pojo;
import org.apache.ibatis.type.Alias;
import java.io.Serializable;

@Alias("pcr")
//任课类
public class PCR {
    private String pno; //任课教师编号
    private String cno; //课程编号
    private int pcrt;   //教师教授这门课程的年份

    //任课类构造器
    public PCR(String Pno, String Cno, int t){
        this.pno = Pno;
        this.cno = Cno;
        pcrt = t;
    }

    //设置任课教师的编号
    public void setPno(String pno) {
        this.pno = pno;
    }

    //设置任课课程的编号
    public void setCno(String cno) {
        this.cno = cno;
    }

    //设置教师教授该课程的年份
    public void setPCRt(int PCRt) {
        this.pcrt = PCRt;
    }

    //返回任课教师编号
    public String getPno() {
        return pno;
    }

    //返回课程编号
    public String getCno() {
        return cno;
    }

    //返回教师教授该课程的年份
    public int getPCRt() {
        return pcrt;
    }
}
