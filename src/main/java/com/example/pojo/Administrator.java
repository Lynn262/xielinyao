package com.example.pojo;
import org.apache.ibatis.type.Alias;
import java.io.Serializable;

/**
 * 管理员实体类
 * @author Zhiqi Lu
 */

//管理员类
@Alias("administrator")
public class Administrator{

    private String ano; //管理员id
    private String apw; //管理员密码
    private String aprivilege;  //管理员权限

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void setApw(String apw) {
        this.apw = apw;
    }

    /**
     * 设置管理员权限
     * @param p 新权限
     */
    public void setAprvlg(String p){
        aprivilege = p;
    }

    /**
     * @return 管理员id
     */
    public String getAno() {
        return ano;
    }

    /**
     * @return 管理员密码
     */
    public String getApw() {
        return apw;
    }

    /**
     * @return 管理员权限
     */
    public String getAprvlg(){
        return aprivilege;
    }

    /**
     * @param p 权限
     * @return 管理员权限是否与p相等
     */
    public boolean checkAprvlg(String p){
        return aprivilege.equals(p);
    }
}
