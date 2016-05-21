package com.univ.action;

import com.univ.entity.CategoryEntity;
import com.univ.service.ICategoryService;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

/**
 * created by Univ
 * 16/5/19 16:43
 */
public class CategoryAction extends ActionSupport {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ICategoryService categoryService;
    private List<CategoryEntity> categoryList;
    private CategoryEntity category;


    public String toSave(){
    	categoryList = categoryService.getTopCategoris();
    	return "toSave";
    }

    public String save() {
    	if(null != category.getParent().getId()) {
    		CategoryEntity parent = categoryService.load(category.getParent().getId());
    		category.setParent(parent);
    	}else{
    		category.setParent(null);
    	}
    	categoryService.save(category);
        return toList();
    }
    
    public String toUpdate(){
    	category = categoryService.get(category.getId());
    	categoryList =  categoryService.getTopCategoris();
    	return "toUpdate";
    }
    
    public String update(){
    	if(null != category.getParent().getId()) {
    		CategoryEntity parent = categoryService.load(category.getParent().getId());
    		category.setParent(parent);
    	}else{
    		category.setParent(null);
    	}
    	categoryService.update(category);
    	return toList();
    }
    
    public String delete(){
    	categoryService.delete(category);
    	return toList();
    }

    public String toList() {
        categoryList =  categoryService.getAll();
        return "toList";
    }


    //--------------------------getter and setter---------------------------------------

    public ICategoryService getCategoryService() {
        return categoryService;
    }

    public void setCategoryService(ICategoryService categoryService) {
        this.categoryService = categoryService;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    public List<CategoryEntity> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<CategoryEntity> categoryList) {
        this.categoryList = categoryList;
    }

}
