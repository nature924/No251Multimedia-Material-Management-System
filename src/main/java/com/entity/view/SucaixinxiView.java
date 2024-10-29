package com.entity.view;

import com.entity.SucaixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 素材信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-29 09:44:47
 */
@TableName("sucaixinxi")
public class SucaixinxiView  extends SucaixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SucaixinxiView(){
	}
 
 	public SucaixinxiView(SucaixinxiEntity sucaixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, sucaixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
