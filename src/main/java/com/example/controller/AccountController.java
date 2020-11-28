package com.example.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.pojo.Account;
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

    /**
     * @param request 前端post请求
     * @param acc1 前端传过来的存在json文件里的Account对象
     * @return 返回登录成功或失败的信息
     */
    @PostMapping("/login")
    @ResponseBody
    public int login(HttpServletRequest request, @RequestBody Student acc1) {
            String sno = acc1.getsno();
            String passwd = acc1.getPW();
            System.out.println(sno);
            System.out.println(passwd);
            Student stu1 = this.studentService.getStu(sno);
            if(stu1 != null){ //首先检查是否是以学生身份登录
                if(this.studentService.checkCredential(sno, passwd)){
                    request.getSession().setAttribute("sno", sno);

                }
                else{ //如果是以学生身份登录但是登录凭证不正确
                    return 0;
                }
            }
            else{ //再检查是否是以管理员身份登录

            }
        return 1;
    }
}
