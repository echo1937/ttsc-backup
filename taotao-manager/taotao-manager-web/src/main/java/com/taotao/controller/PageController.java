package com.taotao.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

// 实现页面跳转, 访问后台管理工程的首页.
@Controller
public class PageController {

    // 打开首页
    @RequestMapping("/")
    public String showIndex() {
        return "index";    // 视图解析器会自动加上.jsp后缀, 访问index.jsp页面
    }


    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page) {
        return page;
    }
}
