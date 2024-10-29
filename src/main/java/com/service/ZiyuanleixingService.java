package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZiyuanleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZiyuanleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZiyuanleixingView;


/**
 * 资源类型
 *
 * @author 
 * @email 
 * @date 2023-01-29 09:44:47
 */
public interface ZiyuanleixingService extends IService<ZiyuanleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZiyuanleixingVO> selectListVO(Wrapper<ZiyuanleixingEntity> wrapper);
   	
   	ZiyuanleixingVO selectVO(@Param("ew") Wrapper<ZiyuanleixingEntity> wrapper);
   	
   	List<ZiyuanleixingView> selectListView(Wrapper<ZiyuanleixingEntity> wrapper);
   	
   	ZiyuanleixingView selectView(@Param("ew") Wrapper<ZiyuanleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZiyuanleixingEntity> wrapper);
   	

}

