package com.indrajit.springboot.restful.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ProductController {

    @GetMapping("/")
    public String list(){
        return "products";
    }
}
