package com.ditto.controller;

import com.ditto.domain.ResponseResult;
import com.ditto.domain.entity.Comment;
import com.ditto.service.CommentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/comment")
public class CommentController {
    @Resource
    private CommentService commentService;

    @GetMapping("/commentList")
    public ResponseResult<?> commentList(Long articleId, Integer pageNum, Integer pageSize) {
        return commentService.commentList(articleId, pageNum, pageSize);
    }
    @PostMapping
    public ResponseResult<?> addComment(@RequestBody Comment comment){
        return commentService.addComment(comment);
    }
}
