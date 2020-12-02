package com.example.controller;

import javax.servlet.http.HttpServletRequest;

import com.example.pojo.Administrator;
import com.example.service.AdminService;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.pojo.Student;

@Controller
@RequestMapping({"/acc"})
public class AccountController {

    @Autowired
    private StudentService studentService = null;

    @Autowired
    private AdminService adminService = null;

    /**
     * @param request 前端post请求
     * @param acc1 前端传过来的存在json文件里的对象，默认为student，在类内转化为admin类
     * @return 返回登录成功或失败的信息
     */
    @PostMapping("/login")
    @ResponseBody
    public int login(HttpServletRequest request, @RequestBody Student acc1) {
        String sno = acc1.getSno();
        String passwd = acc1.getSpw();
        Student stu1 = this.studentService.getStu(sno);
        Administrator admin1 = this.adminService.getAdmin(sno);

        if(stu1 != null){ //首先检查是否是以学生身份登录
            if(this.studentService.checkCredential(sno, passwd)){
                request.getSession().setAttribute("sno", sno);
                return 1;
            }
            else{ //如果是以学生身份登录但是登录凭证不正确
                return 0;
            }
        }
        else if(admin1 != null){ //再检查是否是以管理员身份登录
            if(this.adminService.checkCredential(sno, passwd)){
                request.getSession().setAttribute("ano", sno);
                return 2;
            }
            else{
                return 0; //管理员登录密码不正确
            }
        }
        return 0;
    }
}