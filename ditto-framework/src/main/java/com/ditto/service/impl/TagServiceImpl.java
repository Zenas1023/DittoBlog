package com.ditto.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ditto.domain.entity.Tag;
import com.ditto.mapper.TagMapper;
import com.ditto.service.TagService;
import org.springframework.stereotype.Service;

/**
 * 标签(Tag)表服务实现类
 *
 * @author makejava
 * @since 2022-07-19 22:33:38
 */
@Service("tagService")
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements TagService {

}
