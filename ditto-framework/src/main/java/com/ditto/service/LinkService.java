package com.ditto.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ditto.domain.ResponseResult;
import com.ditto.domain.entity.Link;


/**
 * 友链(Link)表服务接口
 *
 * @author makejava
 * @since 2023-02-04 18:15:45
 */
public interface LinkService extends IService<Link> {

    ResponseResult<?> getAllLink();
}

