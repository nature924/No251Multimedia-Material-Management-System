package com.dao;

import com.entity.SucaileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SucaileixingVO;
import com.entity.view.SucaileixingView;


/**
 * 素材类型
 * 
 * @author 
 * @email 
 * @date 2023-01-29 09:44:47
 */
public interface SucaileixingDao extends BaseMapper<SucaileixingEntity> {
	
	List<SucaileixingVO> selectListVO(@Param("ew") Wrapper<SucaileixingEntity> wrapper);
	
	SucaileixingVO selectVO(@Param("ew") Wrapper<SucaileixingEntity> wrapper);
	
	List<SucaileixingView> selectListView(@Param("ew") Wrapper<SucaileixingEntity> wrapper);

	List<SucaileixingView> selectListView(Pagination page,@Param("ew") Wrapper<SucaileixingEntity> wrapper);
	
	SucaileixingView selectView(@Param("ew") Wrapper<SucaileixingEntity> wrapper);
	

}
