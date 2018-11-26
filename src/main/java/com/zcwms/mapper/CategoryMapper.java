package com.zcwms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zcwms.bean.Category;
@Mapper
public interface CategoryMapper {
	
	
	public List<Category> findAll();
}
