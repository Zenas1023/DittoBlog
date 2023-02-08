package com.ditto.controller;

import com.ditto.domain.ResponseResult;
import com.ditto.service.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Resource
    private CategoryService categoryService;
    @GetMapping("/getCategoryList")
    public ResponseResult<?> getCategoryList(){
       return categoryService.getCategoryList();
    }
}
