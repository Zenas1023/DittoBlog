package com.ditto.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ditto.domain.ResponseResult;
import com.ditto.domain.entity.Category;


/**
 * 分类表(Category)表服务接口
 *
 * @author makejava
 * @since 2023-02-03 11:42:37
 */
public interface CategoryService extends IService<Category> {

    ResponseResult<?> getCategoryList();
}

