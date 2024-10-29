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


import com.dao.SucaixinxiDao;
import com.entity.SucaixinxiEntity;
import com.service.SucaixinxiService;
import com.entity.vo.SucaixinxiVO;
import com.entity.view.SucaixinxiView;

@Service("sucaixinxiService")
public class SucaixinxiServiceImpl extends ServiceImpl<SucaixinxiDao, SucaixinxiEntity> implements SucaixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SucaixinxiEntity> page = this.selectPage(
                new Query<SucaixinxiEntity>(params).getPage(),
                new EntityWrapper<SucaixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SucaixinxiEntity> wrapper) {
		  Page<SucaixinxiView> page =new Query<SucaixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SucaixinxiVO> selectListVO(Wrapper<SucaixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SucaixinxiVO selectVO(Wrapper<SucaixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SucaixinxiView> selectListView(Wrapper<SucaixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SucaixinxiView selectView(Wrapper<SucaixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
