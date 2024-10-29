package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SucaileixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SucaileixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SucaileixingView;


/**
 * 素材类型
 *
 * @author 
 * @email 
 * @date 2023-01-29 09:44:47
 */
public interface SucaileixingService extends IService<SucaileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SucaileixingVO> selectListVO(Wrapper<SucaileixingEntity> wrapper);
   	
   	SucaileixingVO selectVO(@Param("ew") Wrapper<SucaileixingEntity> wrapper);
   	
   	List<SucaileixingView> selectListView(Wrapper<SucaileixingEntity> wrapper);
   	
   	SucaileixingView selectView(@Param("ew") Wrapper<SucaileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SucaileixingEntity> wrapper);
   	

}

