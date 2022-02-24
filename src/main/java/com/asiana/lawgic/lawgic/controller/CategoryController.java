package com.asiana.lawgic.lawgic.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class CategoryController {
    @GetMapping("/category")
    public String categoryController(){

        return "category/category";
    }
}
