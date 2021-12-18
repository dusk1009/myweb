package com.jackson0714.passjava.question;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jackson0714.passjava.question.entity.QmsTypeEntity;
import com.jackson0714.passjava.question.service.QmsTypeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class PassjavaQuestionApplicationTests {

	@Autowired
	QmsTypeService typeService;

	// 创建题目类型
	@Test
	void testCreateType() {
		QmsTypeEntity typeEntity = new QmsTypeEntity();
		typeEntity.setType("javaBasic");
		typeService.save(typeEntity);
		System.out.println("创建成功");
	}

	// 更新type=jvm
	@Test
	void testUpdateType() {
		QmsTypeEntity typeEntity = new QmsTypeEntity();
		typeEntity.setId(1L);
		typeEntity.setType("jvm");
		boolean result = typeService.saveOrUpdate(typeEntity);
		System.out.println("修改成功");
	}

	// 查询题目类型
	@Test
	void testSelectType() {
		List<QmsTypeEntity> typeEntityList = typeService.list(new QueryWrapper<QmsTypeEntity>().eq("id",1L));
		typeEntityList.forEach((item)-> {
			System.out.println(item);
		});
		System.out.println("查询成功");
	}

	// 删除题目类型记录
	@Test
	void testRemoveType() {
		typeService.removeById(1L);
		System.out.println("删除成功");
	}

}
