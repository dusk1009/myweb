package com.jackson0714.passjava.question.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jackson0714.common.utils.PageUtils;
import com.jackson0714.common.utils.Query;

import com.jackson0714.passjava.question.dao.QmsTypeDao;
import com.jackson0714.passjava.question.entity.QmsTypeEntity;
import com.jackson0714.passjava.question.service.QmsTypeService;


@Service("qmsTypeService")
public class QmsTypeServiceImpl extends ServiceImpl<QmsTypeDao, QmsTypeEntity> implements QmsTypeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<QmsTypeEntity> page = this.page(
                new Query<QmsTypeEntity>().getPage(params),
                new QueryWrapper<QmsTypeEntity>()
        );

        return new PageUtils(page);
    }

}