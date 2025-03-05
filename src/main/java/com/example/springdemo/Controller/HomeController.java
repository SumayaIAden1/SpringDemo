package com.example.springdemo.Controller;

import org.springframework.ui.Model;
//import ch.qos.logback.core.model.Model;
import com.example.springdemo.Models.Pet;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class HomeController
{
    @GetMapping("/")
    public String index(){
        return "home/index";
    }

    @PostMapping("/petData")
    public String petData(@ModelAttribute Pet pet, Model model) {
        model.addAttribute("pet", pet);  // 'pet' object to display on the petData page
        return "home/petData";  // This will display the pet information
    }
}
