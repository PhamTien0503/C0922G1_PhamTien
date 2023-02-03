package product_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import product_management.model.Product;
import product_management.service.IProductService;
@RequestMapping("product")
@Controller
public class ProductController {
    @Autowired
    private IProductService productService;
    @GetMapping("")
    public String showList(Model model){
        model.addAttribute("productList",productService.findAll());
        return "list";
    }
    @GetMapping("create")
    public String showFormCreate(Model model){
        model.addAttribute("product",new Product());
        return "create";
    }

    @PostMapping("create")
    public String save(@ModelAttribute Product product, Model model){
        productService.save(product);
//        model.addAttribute("mess","Success!!");
        return "create";
    }
}