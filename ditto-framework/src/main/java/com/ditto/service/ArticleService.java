package com.ditto.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ditto.domain.ResponseResult;
import com.ditto.domain.entity.Article;
import org.springframework.stereotype.Service;

public interface ArticleService extends IService<Article> {
    /**
     * 查询热门文章 封装成ResponseResult返回
     * @return
     */
    ResponseResult<?> hotArticleList();

    ResponseResult<?> articleList(Integer pageNum, Integer pageSize, Long categoryId);

    ResponseResult<?> getArticleDetail(Long id);
}
