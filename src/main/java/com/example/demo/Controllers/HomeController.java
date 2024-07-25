package com.example.demo.Controllers;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class HomeController{
    @GetMapping("")
    public String index(Model model) {
        ArrayList<String> valores=new ArrayList<>();
        valores.add("A");
        valores.add("B");
        valores.add("C");
        valores.add("Ultima opcion");
        model.addAttribute("datos",valores);
        return "home/index";
    }
}