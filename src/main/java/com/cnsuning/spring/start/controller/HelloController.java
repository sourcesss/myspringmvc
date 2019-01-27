package com.cnsuning.spring.start.controller;

import com.alibaba.fastjson.JSON;
import com.cnsuning.spring.start.entity.StatementOfAccount;
import com.cnsuning.spring.start.service.inf.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home")
public class HelloController {

    @Autowired
    private HomeService service;
    @RequestMapping("hello")
    public String index(ModelMap modelMap) {
        service.select(1L);
        StatementOfAccount a=service.selectByPrimaryKey(1L);
        modelMap.addAttribute("result", JSON.toJSONString(a));
        return "home";
    }
}
