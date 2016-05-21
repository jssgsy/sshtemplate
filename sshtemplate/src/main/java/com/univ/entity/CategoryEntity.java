package com.univ.entity;

import java.util.Set;

/**
 * created by Univ
 * 16/5/19 16:36
 */
public class CategoryEntity {

    private Long id;
    private String name;
    private String description;
    private Integer px;
    private CategoryEntity parent;
    private Set<CategoryEntity> children;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getPx() {
		return px;
	}
	public void setPx(Integer px) {
		this.px = px;
	}
		public CategoryEntity getParent() {
		return parent;
	}
	public void setParent(CategoryEntity parent) {
		this.parent = parent;
	}
	public Set<CategoryEntity> getChildren() {
		return children;
	}
	public void setChildren(Set<CategoryEntity> children) {
		this.children = children;
	}
	
	
	    
}
