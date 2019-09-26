package com.finartz.assignment.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    @GetMapping("/index")
    public String index(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
                       Model model) {
        model.addAttribute("name", name);
        return "index";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable String id) {
        System.out.println("-------deleted :" + id);
        return "Successfully deleted";
    }
}
