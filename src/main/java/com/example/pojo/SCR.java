package com.example.pojo;
import org.apache.ibatis.type.Alias;
import java.io.Serializable;

@Alias("scr")
//选课类
public class SCR {
    private String sno; //选课学生的学号
    private String pno; //所选课程教师的编号
    private String cno; //所选课程的编号

    //选课类构造器
    public SCR(String Sno, String Pno, String Cno){
        this.sno = Sno;
        this.pno = Pno;
        this.cno = Cno;
    }

    //设置选课学生的学号
    public void setSno(String sno) {
        sno = sno;
    }

    //设置所报课程的教师编号
    public void setPno(String pno) {
        pno = pno;
    }

    //设置所报课程的编号
    public void setCno(String cno) {
        cno = cno;
    }

    //返回选课学生的学号
    public String getSno() {
        return sno;
    }

    //返回所选课程的教师编号
    public String getPno() {
        return pno;
    }

    //返回所选课程编号
    public String getCno() {
        return cno;
    }
}
