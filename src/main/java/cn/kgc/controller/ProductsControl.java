package cn.kgc.controller;

import cn.kgc.domain.Products;
import cn.kgc.domain.Qualities;
import cn.kgc.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@Controller
public class ProductsControl {
    @Autowired
    ProductsService productsService;
    @RequestMapping("/index")
    public ModelAndView index(ModelAndView mv){
        List<Qualities> qualitiesList = productsService.query();
        mv.addObject("qualitiesList",qualitiesList);
        mv.setViewName("index.jsp");
        return mv;
    }

    @RequestMapping("/toAdd")
    public ModelAndView toAdd(ModelAndView mv,Integer produtId){
        mv.addObject("produtId",produtId);
        mv.setViewName("add.jsp");
        return mv;
    }
    @RequestMapping("/add")
    public ModelAndView add(Products products, ModelAndView mv){
        products.setProductDare(new Date());
        Integer insert = productsService.insert(products);
        if (insert>0){
            mv.addObject("insert","添加成功");
        }
        mv.setViewName("forward:/show.do");
        return mv;
    }
    @RequestMapping("/show")
    public ModelAndView show(ModelAndView mv){
        List<Products> productsList = productsService.queryAll();
        mv.addObject("productsList",productsList);
        mv.setViewName("show.jsp");
        return mv;
    }


}
