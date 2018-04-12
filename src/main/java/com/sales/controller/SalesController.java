package com.sales.controller;

import com.sales.dao.Goods;
import com.sales.repository.GoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class SalesController {


    @Autowired
    private GoodsRepository goodsRepository;

    @GetMapping(value = "/goods")
    @ResponseBody
    public List<Goods> goodsList(){
        return goodsRepository.findAll();
    }

//    @RequestMapping(value = "/doadd",method = RequestMethod.POST)
////    @GetMapping(value = "/doadd")
//    public void addGoods(@RequestParam("category") String cate,
//                         @RequestParam("name") String name_input,
//                         @RequestParam("weight") String weight_input,
//                         @RequestParam("unit_price") String unit_price,
//                         @RequestParam("unit") String unit) {
//        float unitprice = new Float(unit_price);
//        float weight = new Float(weight_input);
//        float price = unitprice*weight;
//        Goods goods = new Goods();
//        goods.setCategory(cate);
//        goods.setName(name_input);
//        goods.setWeight(weight);
//        goods.setUnit(unit);
//        goods.setUnit_price(unitprice);
//        goods.setTotal_price(price);
//
//        System.out.println(price);
//        goodsRepository.save(goods);
//        System.out.println("OK");
//    }


    /**
     * 向goods表中添加商品
     * @param obj
     * @param model
     * @return
     */
    @RequestMapping(value = "/doadd",method = RequestMethod.POST)
    public ModelAndView add(Goods obj, Model model){
        System.out.println("now in function");
        float weight = obj.getWeight();
        float unitprice = obj.getUnit_price();
        float price = unitprice*weight;
        Goods goods = new Goods();
        goods.setCategory(obj.getCategory());
        goods.setName(obj.getName());
        goods.setWeight(weight);
        goods.setUnit(obj.getUnit());
        goods.setUnit_price(unitprice);
        goods.setTotal_price(price);

        System.out.println(price);
        goodsRepository.save(goods);
        ModelAndView modelAndView = new ModelAndView("redirect:/index");
        return modelAndView;
    }

}
