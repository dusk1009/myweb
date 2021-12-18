package com.jackson0714.passjava.question.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jackson0714.common.utils.PageUtils;
import com.jackson0714.passjava.question.entity.QmsTypeEntity;

import java.util.Map;

/**
 * 题目-题目类型表
 *
 * @author jackson0714
 * @email jackson0585@163.com
 * @date 2021-12-18 13:15:30
 */
public interface QmsTypeService extends IService<QmsTypeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

