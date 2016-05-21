package com.univ.dao;

import com.univ.entity.CategoryEntity;

import java.util.List;

/**
 * Created by Univ on 16/5/19.
 */
public interface ICategoryDao extends IAbstractBaseDao {

    List<CategoryEntity> getAll();

	List<CategoryEntity> getTopCategoris();

}
