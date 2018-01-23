package com.sales.web;

import com.sales.dao.Goods;
import com.sales.repository.GoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

//@RestController
@Controller
public class SalesManagerController extends WebMvcConfigurerAdapter {


//    @GetMapping("/index")
//    public ModelAndView doView() {
//        System.out.print("aaaaaaaaa");
//        ModelAndView mv = new ModelAndView("index");
//        return mv;
//    }
    @Autowired
    private GoodsRepository goodsRepository;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model){
        List<Goods> goods= goodsRepository.findAll();
        model.addAttribute( "good",goods);
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){
        return "login";
    }
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(){
        return "register";
    }

    @RequestMapping(value = "/userInfo", method = RequestMethod.GET)
    public String userinfo(){
        return "userInfo";
    }
}