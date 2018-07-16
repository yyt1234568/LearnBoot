package com.springboot.demo.controller;

import com.springboot.demo.dao.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JournalController {
    @Autowired
    JournalRepository repo;

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("journal", repo.findAll());
        return "index";
    }

    @RequestMapping("/login")
    public String login(Model model){
        model.addAttribute("journal", repo.findAll());
        return "index";
    }

}
