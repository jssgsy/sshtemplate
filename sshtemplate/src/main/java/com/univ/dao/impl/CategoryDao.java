package com.univ.dao.impl;

import com.univ.dao.ICategoryDao;
import com.univ.entity.CategoryEntity;

import java.util.List;

/**
 * created by Univ
 * 16/5/19 16:44
 */
public class CategoryDao extends AbstractBaseDao implements ICategoryDao {


    public List<CategoryEntity> getAll() {
        return (List<CategoryEntity>) super.getHibernateTemplate().find("from com.univ.entity.CategoryEntity");
    }

	public List<CategoryEntity> getTopCategoris() {
		return (List<CategoryEntity>) super.getHibernateTemplate().find("from com.univ.entity.CategoryEntity where parent is null");
	}

}
