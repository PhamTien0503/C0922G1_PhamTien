package settings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import settings.model.Setting;
import settings.service.ISettingService;

@Controller
public class SettingController {
    @Autowired
    ISettingService settingService;

    @GetMapping("")
    public String showList(Model model) {
        model.addAttribute("settingList", settingService.findAll());
        return "list";
    }

    @GetMapping("update")
    public String showFormEdit(Model model, @RequestParam int id) {
        Setting setting = settingService.findById(id);
        model.addAttribute("setting", setting);
        model.addAttribute("languages", new String[]{"English", "Vietnamese", "Japanese", "Chinese"});
        model.addAttribute("pageSize", new Integer[]{5, 10, 15, 25, 50, 100});
        return "update";
    }

    @PostMapping("update")
    public String update(@ModelAttribute Setting setting, Model model) {
        settingService.updateSetting(setting);
        model.addAttribute("mess", "success!!!!");
        model.addAttribute("settingList", settingService.findAll());
        return "list";
    }
}
