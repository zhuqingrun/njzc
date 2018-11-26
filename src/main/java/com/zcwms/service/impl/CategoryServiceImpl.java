package com.zcwms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zcwms.bean.Category;
import com.zcwms.mapper.CategoryMapper;
import com.zcwms.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryMapper category;
	
	@Override
	public List<Category> findAllUser() {
		List<Category> findAll = category.findAll();
		return findAll;
	}

}                     