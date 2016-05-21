package com.univ.service;

import com.univ.entity.CategoryEntity;

import java.util.List;

/**
 * Created by Univ on 16/5/19.
 */
public interface ICategoryService {
    void save(CategoryEntity category);

    List<CategoryEntity> getAll();
    
    //获取一级类别
    List<CategoryEntity> getTopCategoris();

    //获取父类级别
	CategoryEntity load(Long id);

	//获取指定id的category对象
	CategoryEntity get(Long id);

	void update(CategoryEntity category);

	void delete(CategoryEntity category);
}
