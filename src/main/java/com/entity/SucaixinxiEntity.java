package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 素材信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-01-29 09:44:47
 */
@TableName("sucaixinxi")
public class SucaixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public SucaixinxiEntity() {
		
	}
	
	public SucaixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 素材编号
	 */
					
	private String sucaibianhao;
	
	/**
	 * 素材名称
	 */
					
	private String sucaimingcheng;
	
	/**
	 * 素材类型
	 */
					
	private String sucaileixing;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 素材文件
	 */
					
	private String sucaiwenjian;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date fabushijian;
	
	/**
	 * 素材介绍
	 */
					
	private String sucaijieshao;
	
	/**
	 * 用户id
	 */
					
	private Long userid;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：素材编号
	 */
	public void setSucaibianhao(String sucaibianhao) {
		this.sucaibianhao = sucaibianhao;
	}
	/**
	 * 获取：素材编号
	 */
	public String getSucaibianhao() {
		return sucaibianhao;
	}
	/**
	 * 设置：素材名称
	 */
	public void setSucaimingcheng(String sucaimingcheng) {
		this.sucaimingcheng = sucaimingcheng;
	}
	/**
	 * 获取：素材名称
	 */
	public String getSucaimingcheng() {
		return sucaimingcheng;
	}
	/**
	 * 设置：素材类型
	 */
	public void setSucaileixing(String sucaileixing) {
		this.sucaileixing = sucaileixing;
	}
	/**
	 * 获取：素材类型
	 */
	public String getSucaileixing() {
		return sucaileixing;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：素材文件
	 */
	public void setSucaiwenjian(String sucaiwenjian) {
		this.sucaiwenjian = sucaiwenjian;
	}
	/**
	 * 获取：素材文件
	 */
	public String getSucaiwenjian() {
		return sucaiwenjian;
	}
	/**
	 * 设置：发布时间
	 */
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
	/**
	 * 设置：素材介绍
	 */
	public void setSucaijieshao(String sucaijieshao) {
		this.sucaijieshao = sucaijieshao;
	}
	/**
	 * 获取：素材介绍
	 */
	public String getSucaijieshao() {
		return sucaijieshao;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}

}
