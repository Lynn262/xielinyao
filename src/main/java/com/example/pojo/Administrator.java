package com.example.pojo;

//管理员类
public class Administrator extends Account{
    private String Anickname;   //管理员昵称
    private String Aprivilege;  //管理员权限

    //管理员类构造器
    public Administrator(String User, String PW, String Mail, String Anickname, String Aprivilege) {
        this.Anickname = Anickname;
        this.Aprivilege = Aprivilege;
    }

    //设置管理员昵称
    public void setAname(String n){
        Anickname = n;
    }

    //设置管理员权限
    public void setAprvlg(String p){
        Aprivilege = p;
    }

    //返回管理员昵称
    public String getAname(){
        return Anickname;
    }

    //返回管理员权限
    public String getAprvlg(){
        return Aprivilege;
    }

    //检查管理员权限
    public boolean checkAprvlg(String p){
        return Aprivilege.equals(p);
    }
}
