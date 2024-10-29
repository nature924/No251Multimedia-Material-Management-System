package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZiyuanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZiyuanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZiyuanxinxiView;


/**
 * 资源信息
 *
 * @author 
 * @email 
 * @date 2023-01-29 09:44:47
 */
public interface ZiyuanxinxiService extends IService<ZiyuanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZiyuanxinxiVO> selectListVO(Wrapper<ZiyuanxinxiEntity> wrapper);
   	
   	ZiyuanxinxiVO selectVO(@Param("ew") Wrapper<ZiyuanxinxiEntity> wrapper);
   	
   	List<ZiyuanxinxiView> selectListView(Wrapper<ZiyuanxinxiEntity> wrapper);
   	
   	ZiyuanxinxiView selectView(@Param("ew") Wrapper<ZiyuanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZiyuanxinxiEntity> wrapper);
   	

}

