package com.example.pojo;
import org.apache.ibatis.type.Alias;
import java.io.Serializable;

/**
 * 课程实体类
 * @author Zhiqi Lu
 */

@Alias("course")
//课程类
public class Course {
    private int cno;            //课程编号
    private String cname;       //课程名称
    private String cprof;       //课程教授
    private float crating;      //课程评分
    private String cschool;     //课程所属学校
    private String cdept;       //课程所属院系

    /**
     * 设置课程编号
     * @param c 新课程编号
     */
    public void setCno(int c)
    {
    	cno=c;
    }

    /**
     * 设置课程名
     * @param n 新课程名
     */
    public void setCname(String n){
        cname = n;
    }

    public void setCprof(String cprof) {
        this.cprof = cprof;
    }

    public void setCrating(float crating) {
        this.crating = crating;
    }

    public void setCschool(String cschool) {
        this.cschool = cschool;
    }

    /**
     * 设置课程所属院系
     * @param d 新课程所属院系
     */
    public void setCdept(String d){
        cdept = d;
    }

    /**
     * @return 课程编号
     */
    public int getCno(){
        return cno;
    }

    public String getCprof() {
        return cprof;
    }

    public float getCrating() {
        return crating;
    }

    public String getCschool() {
        return cschool;
    }

    /**
     * @return 课程名称
     */
    public String getCname() {
        return cname;
    }

    /**
     * @return 课程所属院系
     */
    public String getCdept() {
        return cdept;
    }
}
