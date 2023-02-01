package sandwich_condiments.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class CondimentController {
    @GetMapping("")
    public String showFormChoose(){
        return "choose";
    }
    @PostMapping("/save")
    public String save(@RequestParam String[] condiment, Model model){
        model.addAttribute("condiment",condiment);
        return "list";
    }
}
