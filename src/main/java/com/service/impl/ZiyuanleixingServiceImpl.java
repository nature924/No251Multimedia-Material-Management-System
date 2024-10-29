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


import com.dao.ZiyuanleixingDao;
import com.entity.ZiyuanleixingEntity;
import com.service.ZiyuanleixingService;
import com.entity.vo.ZiyuanleixingVO;
import com.entity.view.ZiyuanleixingView;

@Service("ziyuanleixingService")
public class ZiyuanleixingServiceImpl extends ServiceImpl<ZiyuanleixingDao, ZiyuanleixingEntity> implements ZiyuanleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZiyuanleixingEntity> page = this.selectPage(
                new Query<ZiyuanleixingEntity>(params).getPage(),
                new EntityWrapper<ZiyuanleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZiyuanleixingEntity> wrapper) {
		  Page<ZiyuanleixingView> page =new Query<ZiyuanleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZiyuanleixingVO> selectListVO(Wrapper<ZiyuanleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZiyuanleixingVO selectVO(Wrapper<ZiyuanleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZiyuanleixingView> selectListView(Wrapper<ZiyuanleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZiyuanleixingView selectView(Wrapper<ZiyuanleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
