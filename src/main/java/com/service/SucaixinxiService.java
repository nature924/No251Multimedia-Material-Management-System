package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SucaixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SucaixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SucaixinxiView;


/**
 * 素材信息
 *
 * @author 
 * @email 
 * @date 2023-01-29 09:44:47
 */
public interface SucaixinxiService extends IService<SucaixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SucaixinxiVO> selectListVO(Wrapper<SucaixinxiEntity> wrapper);
   	
   	SucaixinxiVO selectVO(@Param("ew") Wrapper<SucaixinxiEntity> wrapper);
   	
   	List<SucaixinxiView> selectListView(Wrapper<SucaixinxiEntity> wrapper);
   	
   	SucaixinxiView selectView(@Param("ew") Wrapper<SucaixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SucaixinxiEntity> wrapper);
   	

}

