package com.dao;

import com.entity.DiscusssucaixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusssucaixinxiVO;
import com.entity.view.DiscusssucaixinxiView;


/**
 * 素材信息评论表
 * 
 * @author 
 * @email 
 * @date 2023-01-29 09:44:48
 */
public interface DiscusssucaixinxiDao extends BaseMapper<DiscusssucaixinxiEntity> {
	
	List<DiscusssucaixinxiVO> selectListVO(@Param("ew") Wrapper<DiscusssucaixinxiEntity> wrapper);
	
	DiscusssucaixinxiVO selectVO(@Param("ew") Wrapper<DiscusssucaixinxiEntity> wrapper);
	
	List<DiscusssucaixinxiView> selectListView(@Param("ew") Wrapper<DiscusssucaixinxiEntity> wrapper);

	List<DiscusssucaixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusssucaixinxiEntity> wrapper);
	
	DiscusssucaixinxiView selectView(@Param("ew") Wrapper<DiscusssucaixinxiEntity> wrapper);
	

}
