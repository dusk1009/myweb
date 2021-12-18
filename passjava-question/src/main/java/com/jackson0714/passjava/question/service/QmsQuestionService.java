package com.jackson0714.passjava.question.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jackson0714.common.utils.PageUtils;
import com.jackson0714.passjava.question.entity.QmsQuestionEntity;

import java.util.Map;

/**
 * 
 *
 * @author jackson0714
 * @email jackson0585@163.com
 * @date 2021-12-18 13:15:29
 */
public interface QmsQuestionService extends IService<QmsQuestionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

