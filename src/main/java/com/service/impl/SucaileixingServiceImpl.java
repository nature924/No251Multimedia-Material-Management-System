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


import com.dao.SucaileixingDao;
import com.entity.SucaileixingEntity;
import com.service.SucaileixingService;
import com.entity.vo.SucaileixingVO;
import com.entity.view.SucaileixingView;

@Service("sucaileixingService")
public class SucaileixingServiceImpl extends ServiceImpl<SucaileixingDao, SucaileixingEntity> implements SucaileixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SucaileixingEntity> page = this.selectPage(
                new Query<SucaileixingEntity>(params).getPage(),
                new EntityWrapper<SucaileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SucaileixingEntity> wrapper) {
		  Page<SucaileixingView> page =new Query<SucaileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SucaileixingVO> selectListVO(Wrapper<SucaileixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SucaileixingVO selectVO(Wrapper<SucaileixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SucaileixingView> selectListView(Wrapper<SucaileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SucaileixingView selectView(Wrapper<SucaileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
