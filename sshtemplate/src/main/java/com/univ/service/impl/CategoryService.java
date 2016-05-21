package com.univ.service.impl;

import com.univ.dao.ICategoryDao;
import com.univ.entity.CategoryEntity;
import com.univ.service.ICategoryService;

import java.util.List;

/**
 * created by Univ
 * 16/5/19 16:44
 */
public class CategoryService implements ICategoryService{

    private ICategoryDao categoryDao;

    public ICategoryDao getCategoryDao() {
        return categoryDao;
    }

    public void setCategoryDao(ICategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    public void save(CategoryEntity category) {
        categoryDao.save(category);
    }

    public List<CategoryEntity> getAll() {
        return categoryDao.getAll();
    }

	public List<CategoryEntity> getTopCategoris() {
		return categoryDao.getTopCategoris();
	}

	public CategoryEntity load(Long id) {
		return categoryDao.load(CategoryEntity.class,id);
	}

	public CategoryEntity get(Long id) {
		return categoryDao.get(CategoryEntity.class,id);
	}

	public void update(CategoryEntity category) {
		categoryDao.update(category);
	}

	public void delete(CategoryEntity category) {
		categoryDao.delete(category);
	}
}
