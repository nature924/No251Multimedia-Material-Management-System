package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusssucaixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusssucaixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusssucaixinxiView;


/**
 * 素材信息评论表
 *
 * @author 
 * @email 
 * @date 2023-01-29 09:44:48
 */
public interface DiscusssucaixinxiService extends IService<DiscusssucaixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusssucaixinxiVO> selectListVO(Wrapper<DiscusssucaixinxiEntity> wrapper);
   	
   	DiscusssucaixinxiVO selectVO(@Param("ew") Wrapper<DiscusssucaixinxiEntity> wrapper);
   	
   	List<DiscusssucaixinxiView> selectListView(Wrapper<DiscusssucaixinxiEntity> wrapper);
   	
   	DiscusssucaixinxiView selectView(@Param("ew") Wrapper<DiscusssucaixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusssucaixinxiEntity> wrapper);
   	

}

