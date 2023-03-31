package com.cici.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Controller
@SessionAttributes(names = {"name","sex"})
public class TestController {

    @RequestMapping("/test1")
    public String test1(String name, Model model) {
//        System.out.println(name);
        model.addAttribute("name","zzt");
        model.addAttribute("age",17);
        model.addAttribute("sex","男");
        model.addAttribute("date",new Date());
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        model.addAttribute("list",list);
        model.addAttribute("btext","<b>我加粗了吗</b>");
        return "test1";
    }

}
