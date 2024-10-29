package com.dao;

import com.entity.ZiyuanleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZiyuanleixingVO;
import com.entity.view.ZiyuanleixingView;


/**
 * 资源类型
 * 
 * @author 
 * @email 
 * @date 2023-01-29 09:44:47
 */
public interface ZiyuanleixingDao extends BaseMapper<ZiyuanleixingEntity> {
	
	List<ZiyuanleixingVO> selectListVO(@Param("ew") Wrapper<ZiyuanleixingEntity> wrapper);
	
	ZiyuanleixingVO selectVO(@Param("ew") Wrapper<ZiyuanleixingEntity> wrapper);
	
	List<ZiyuanleixingView> selectListView(@Param("ew") Wrapper<ZiyuanleixingEntity> wrapper);

	List<ZiyuanleixingView> selectListView(Pagination page,@Param("ew") Wrapper<ZiyuanleixingEntity> wrapper);
	
	ZiyuanleixingView selectView(@Param("ew") Wrapper<ZiyuanleixingEntity> wrapper);
	

}
