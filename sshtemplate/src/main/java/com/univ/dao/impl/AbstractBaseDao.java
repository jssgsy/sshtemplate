package com.univ.dao.impl;

import java.io.Serializable;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.univ.dao.IAbstractBaseDao;

/** 
 * dao层的父类，供自定义的dao继承,用来简化配置
 * @author	Univ 
 * @date	2016年4月24日 下午12:07:05 
 * @version 1.0 
 * 将所有dao都必须实现的方法抽象至此，dao只需要调用即可，不用再定义。
 * 因为这些基本方法的逻辑是一样的。
*/

public abstract class AbstractBaseDao extends HibernateDaoSupport implements IAbstractBaseDao{

	public Serializable save(Object entity) {
		return super.getHibernateTemplate().save(entity);
	}

	public void delete(Object entity) {
		super.getHibernateTemplate().delete(entity);
	}

	public void update(Object entity) {
		super.getHibernateTemplate().update(entity);
	}

	public <T> T get(Class<T> entityClass, Serializable id) {
		return super.getHibernateTemplate().get(entityClass, id);
	}
	
	public <T> T load(Class<T> entityClass, Serializable id) {
		return super.getHibernateTemplate().load(entityClass, id);
	}


}

