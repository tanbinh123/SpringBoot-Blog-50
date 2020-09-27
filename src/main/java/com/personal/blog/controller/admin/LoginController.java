package com.personal.blog.controller.admin;

import cn.hutool.crypto.digest.DigestUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.personal.blog.entity.User;
import com.personal.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

/**
 * 登录Controller
 * @author YUDI
 * @date 2020/9/24 22:46
 */
@Controller
@RequestMapping("/admin")
public class LoginController {

    @Autowired
    private UserService userService;

    /**
     * 跳转登录页面
     * @return
     */
    @GetMapping
    public String login(){
        return "admin/login";
    }

    /**
     * 登录
     * @param loginName
     * @param password
     * @return
     */
    @PostMapping("/login")
    public String login(@RequestParam("loginName") String loginName,
                        @RequestParam("password") String password,
                        HttpSession session, RedirectAttributes redirectAttributes){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("login_name",loginName).eq("password",DigestUtil.md5Hex(password));
        User user = userService.getOne(queryWrapper);
        if (user != null) {
            user.setPassword(null);
            session.setAttribute("user",user);
            return "admin/main";
        }else{
            redirectAttributes.addFlashAttribute("message","用户名或密码错误");
            return "redirect:/admin";
        }
    }

    /**
     * 注销
     * @param session
     * @return
     */
    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("user");
        return "redirect:/admin";
    }

}



