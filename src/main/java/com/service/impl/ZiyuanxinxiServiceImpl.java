package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZiyuanxinxiDao;
import com.entity.ZiyuanxinxiEntity;
import com.service.ZiyuanxinxiService;
import com.entity.vo.ZiyuanxinxiVO;
import com.entity.view.ZiyuanxinxiView;

@Service("ziyuanxinxiService")
public class ZiyuanxinxiServiceImpl extends ServiceImpl<ZiyuanxinxiDao, ZiyuanxinxiEntity> implements ZiyuanxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZiyuanxinxiEntity> page = this.selectPage(
                new Query<ZiyuanxinxiEntity>(params).getPage(),
                new EntityWrapper<ZiyuanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZiyuanxinxiEntity> wrapper) {
		  Page<ZiyuanxinxiView> page =new Query<ZiyuanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZiyuanxinxiVO> selectListVO(Wrapper<ZiyuanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZiyuanxinxiVO selectVO(Wrapper<ZiyuanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZiyuanxinxiView> selectListView(Wrapper<ZiyuanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZiyuanxinxiView selectView(Wrapper<ZiyuanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
