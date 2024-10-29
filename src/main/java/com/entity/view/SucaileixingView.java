package com.entity.view;

import com.entity.SucaileixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 素材类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-29 09:44:47
 */
@TableName("sucaileixing")
public class SucaileixingView  extends SucaileixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SucaileixingView(){
	}
 
 	public SucaileixingView(SucaileixingEntity sucaileixingEntity){
 	try {
			BeanUtils.copyProperties(this, sucaileixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
