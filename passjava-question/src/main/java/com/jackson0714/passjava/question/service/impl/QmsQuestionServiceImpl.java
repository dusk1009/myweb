package com.jackson0714.passjava.question.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jackson0714.common.utils.PageUtils;
import com.jackson0714.common.utils.Query;

import com.jackson0714.passjava.question.dao.QmsQuestionDao;
import com.jackson0714.passjava.question.entity.QmsQuestionEntity;
import com.jackson0714.passjava.question.service.QmsQuestionService;


@Service("qmsQuestionService")
public class QmsQuestionServiceImpl extends ServiceImpl<QmsQuestionDao, QmsQuestionEntity> implements QmsQuestionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<QmsQuestionEntity> page = this.page(
                new Query<QmsQuestionEntity>().getPage(params),
                new QueryWrapper<QmsQuestionEntity>()
        );

        return new PageUtils(page);
    }

}