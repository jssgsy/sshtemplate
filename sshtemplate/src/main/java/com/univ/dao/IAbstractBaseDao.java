package com.univ.dao;

import java.io.Serializable;

/** 
 * 定义几个所有dao都必须实现的几个方法，在定义dao时可以借助IDE的功能自动要求实现，降低出错的概率。
 * 这里的增删改查是个方法全部按照hibernate中相应方法的原型定义。
 * 
 * @author	Univ 
 * @date	2016年4月24日 下午6:01:39 
 * @version 1.0 
*/

public interface IAbstractBaseDao {

	/*
	 * 保存一个对象
	 */
	Serializable save(Object entity);
	
	/*
	 * 删除一个对象
	 */
	void delete(Object entity);
	
	/*
	 * 更新对象
	 */
	void update(Object entity);
	
	/*
	 * 根据id获取某个对象
	 */
	<T> T get(Class<T> entityClass, Serializable id);

	<T> T load(Class<T> entityClass, Serializable id);
	
}

