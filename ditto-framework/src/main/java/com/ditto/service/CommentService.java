package com.ditto.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ditto.domain.ResponseResult;
import com.ditto.domain.entity.Comment;


/**
 * 评论表(Comment)表服务接口
 *
 * @author makejava
 * @since 2023-02-13 10:22:03
 */
public interface CommentService extends IService<Comment> {

    ResponseResult<?> commentList(Long articleId, Integer pageNum, Integer pageSize);
}

