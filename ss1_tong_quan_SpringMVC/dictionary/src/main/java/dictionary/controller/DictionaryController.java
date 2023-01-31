package dictionary.controller;

import dictionary.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    @Autowired
    IDictionaryService dictionaryService;
     @GetMapping("")
    public String showForm(){
         return "dictionary";
     }
     @PostMapping("/search")
    public String search(@RequestParam String english, Model model){
         model.addAttribute("vietnamese",dictionaryService.search(english));
         return "dictionary";
     }
}
