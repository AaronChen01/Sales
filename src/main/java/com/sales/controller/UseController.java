package com.sales.controller;

import com.sales.dao.UserInfo;
import com.sales.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class UseController {

    @Autowired
    private UserInfoRepository userInfoRepository;

    /**
     * 注册新用户
     * @param userInfo
     * @param modelAndView
     * @return
     */
    @RequestMapping(value = "/doregister",method = RequestMethod.POST)
    public ModelAndView register(UserInfo userInfo, ModelAndView modelAndView){
        System.out.println("register");

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        UserInfo user = new UserInfo();
        user.setAccount(userInfo.getAccount());
        user.setUsername(userInfo.getUsername());
        user.setPassword(userInfo.getPassword());
        user.setCreatetime(date);

        userInfoRepository.save(user);

        System.out.println("注册成功");
        modelAndView = new ModelAndView("redirect:/login");
        return modelAndView;
    }

    /**
     * 执行登录操作
     * @param userInfo
     * @param modelAndView
     * @return
     */
    @RequestMapping(value = "/dologin",method = RequestMethod.POST)
    public ModelAndView checkUser(UserInfo userInfo, ModelAndView modelAndView,Model model){
        System.out.println("login check");
//      String name = userInfo

        System.out.println("Your: " + userInfo.getAccount() + "," + userInfo.getPassword());
        UserInfo nowUser = userInfoRepository.findByAccount(userInfo.getAccount());
        System.out.println("Data: " + userInfo.getAccount() + " , Your: " + nowUser.getAccount() + "," + nowUser.getPassword());

        if(nowUser.equals("")) {
            System.out.println("数据库中无此用户，请先注册");
        }else {
            if(nowUser.getPassword().equals(userInfo.getPassword())){
                System.out.println("校验成功");
                model.addAttribute( "user",nowUser);
//                modelAndView.addObject("user",nowUser);
                modelAndView = new ModelAndView("redirect:/index");
                return modelAndView;
//                return "index";
            }
        }
        modelAndView = new ModelAndView("redirect:/login");
        return modelAndView;
//        return "login";
    }
}
