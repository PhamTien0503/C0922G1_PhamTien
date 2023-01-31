package money_convert.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertController {
    @GetMapping("")
    public String showFormInput(){
        return "convert";
    }
    @PostMapping("/convert")
    public String convert(@RequestParam double usd, Model model){
        double vnd=usd*23000;
        model.addAttribute("vnd",vnd);
        return "convert";
    }
}
