package com.dao;

import com.entity.ZiyuanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZiyuanxinxiVO;
import com.entity.view.ZiyuanxinxiView;


/**
 * 资源信息
 * 
 * @author 
 * @email 
 * @date 2023-01-29 09:44:47
 */
public interface ZiyuanxinxiDao extends BaseMapper<ZiyuanxinxiEntity> {
	
	List<ZiyuanxinxiVO> selectListVO(@Param("ew") Wrapper<ZiyuanxinxiEntity> wrapper);
	
	ZiyuanxinxiVO selectVO(@Param("ew") Wrapper<ZiyuanxinxiEntity> wrapper);
	
	List<ZiyuanxinxiView> selectListView(@Param("ew") Wrapper<ZiyuanxinxiEntity> wrapper);

	List<ZiyuanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZiyuanxinxiEntity> wrapper);
	
	ZiyuanxinxiView selectView(@Param("ew") Wrapper<ZiyuanxinxiEntity> wrapper);
	

}
