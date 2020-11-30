package com.example.pojo;
import org.apache.ibatis.type.Alias;
import java.io.Serializable;

@Alias("administrator")
//管理员类
public class Administrator{

    private String ano;
    private String apw;
    private String amail;
    private String anickname;   //管理员昵称
    private String aprivilege;  //管理员权限


    //设置管理员昵称
    public void setAname(String n){
        anickname = n;
    }

    //设置管理员权限
    public void setAprvlg(String p){
        aprivilege = p;
    }

    public String getAno() {
        return ano;
    }

    public String getApw() {
        return apw;
    }

    public String getAmail() {
        return amail;
    }

    //返回管理员昵称
    public String getAname(){
        return anickname;
    }

    //返回管理员权限
    public String getAprvlg(){
        return aprivilege;
    }

    //检查管理员权限
    public boolean checkAprvlg(String p){
        return aprivilege.equals(p);
    }
}
