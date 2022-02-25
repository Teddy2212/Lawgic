package com.asiana.lawgic.lawgic.controller;

import com.asiana.lawgic.lawgic.entity.Category;
import com.asiana.lawgic.lawgic.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class CategoryController {
    final private CategoryService categoryService;
    @GetMapping("/category")
    public String categoryController(Model model){
        model.addAttribute("carToCar",categoryService.getLawyersByCategoryId(Category.CAR_TO_CAR));
        model.addAttribute("carToCar",categoryService.getLawyersByCategoryId(Category.CAR_TO_PERSON));
        model.addAttribute("carToCar",categoryService.getLawyersByCategoryId(Category.CAR_ONLY));
        model.addAttribute("carToCar",categoryService.getLawyersByCategoryId(Category.RAILROAD_CROSSING));


        return "category/category";
    }
}
