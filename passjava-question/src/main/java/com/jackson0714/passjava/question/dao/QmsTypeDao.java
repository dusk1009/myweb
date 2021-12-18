package com.jackson0714.passjava.question.dao;

import com.jackson0714.passjava.question.entity.QmsTypeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 题目-题目类型表
 * 
 * @author jackson0714
 * @email jackson0585@163.com
 * @date 2021-12-18 13:15:30
 */
@Mapper
public interface QmsTypeDao extends BaseMapper<QmsTypeEntity> {
	
}
