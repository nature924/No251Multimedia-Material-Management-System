package com.dao;

import com.entity.SucaixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SucaixinxiVO;
import com.entity.view.SucaixinxiView;


/**
 * 素材信息
 * 
 * @author 
 * @email 
 * @date 2023-01-29 09:44:47
 */
public interface SucaixinxiDao extends BaseMapper<SucaixinxiEntity> {
	
	List<SucaixinxiVO> selectListVO(@Param("ew") Wrapper<SucaixinxiEntity> wrapper);
	
	SucaixinxiVO selectVO(@Param("ew") Wrapper<SucaixinxiEntity> wrapper);
	
	List<SucaixinxiView> selectListView(@Param("ew") Wrapper<SucaixinxiEntity> wrapper);

	List<SucaixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<SucaixinxiEntity> wrapper);
	
	SucaixinxiView selectView(@Param("ew") Wrapper<SucaixinxiEntity> wrapper);
	

}
