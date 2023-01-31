package com.codegym.controller;

import com.codegym.model.Student;
import com.codegym.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
    @Autowired
    IStudentService studentService;
    @GetMapping("/list")
    public String showList(Model model){
        model.addAttribute("studentList",studentService.findAll());
        return "list";
    }
    @GetMapping("/create")
    public String showFormCreate(){
        return "create";
    }
    @PostMapping("/create")
    public String save(@RequestParam String name, @RequestParam int age, Model model){
        Student student=new Student(name,age);
        studentService.save(student);
        model.addAttribute("studentList",studentService.findAll());
        return "list";
    }
}
