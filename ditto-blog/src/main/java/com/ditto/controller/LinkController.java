package com.ditto.controller;

import com.ditto.domain.ResponseResult;
import com.ditto.service.LinkService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/link")
public class LinkController {
    @Resource
    private LinkService linkService;
    @GetMapping("/getAllLink")
    public ResponseResult<?> getAllLink() {
        System.out.println("test");
       return linkService.getAllLink();
    }
}
