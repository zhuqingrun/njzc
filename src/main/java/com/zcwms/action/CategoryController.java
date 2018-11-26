package com.zcwms.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zcwms.bean.Category;
import com.zcwms.service.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	private CategoryService cate;
	
	 @RequestMapping("/list")
	    public List<Category> list(){
	        List<Category> list = cate.findAllUser();
	        return list;
}
}
