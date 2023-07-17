package com.ditto.controller;

import com.ditto.domain.ResponseResult;
import com.ditto.service.TagService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/content/tag")
public class TagController {
    @Resource
    private TagService tagService;

    @GetMapping("/list")
    public ResponseResult<?> list(){
        return ResponseResult.okResult(tagService.list());
    }
}
