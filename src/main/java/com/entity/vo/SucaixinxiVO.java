package com.entity.vo;

import com.entity.SucaixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 素材信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-01-29 09:44:47
 */
public class SucaixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
