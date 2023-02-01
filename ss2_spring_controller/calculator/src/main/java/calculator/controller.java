package calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class controller {
    double result;
    @GetMapping("")
    public String showCalculator(){
        return "calculator";
    }
    @PostMapping("/calculator")
    public String calculate(@RequestParam double number1, @RequestParam double number2, @RequestParam String action,
                            Model model){
        switch (action){
            case "+":
                result=number1+number2;
                break;
            case "-":
                result=number1-number2;
                break;
            case "x":
                result=number1*number2;
                break;
            case "/":
                result=number1/number2;
                break;
        }
        model.addAttribute("result",result);
        return "calculator";
    }
}
