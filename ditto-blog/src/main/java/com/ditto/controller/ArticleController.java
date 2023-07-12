package com.ditto.controller;

import com.ditto.domain.ResponseResult;
import com.ditto.domain.entity.Article;
import com.ditto.service.ArticleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @Resource
    private ArticleService articleService;
    @GetMapping("/hotArticleList")
    public ResponseResult<?> hotArticleList(){
        return articleService.hotArticleList();
    }
    @GetMapping("/articleList")
    public ResponseResult<?> articleList(Integer pageNum,Integer pageSize,Long categoryId){
        return articleService.articleList(pageNum,pageSize,categoryId);
    }
    @GetMapping("/{id}")
    public ResponseResult<?> getArticleDetail(@PathVariable("id") Long id){
        return articleService.getArticleDetail(id);
    }
    @PutMapping("/updateViewCount/{id}")
    public ResponseResult updateViewAccount(@PathVariable("id") Long id){
        return articleService.updateViewAccount(id);
    }
}
