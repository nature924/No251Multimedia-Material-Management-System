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


import com.dao.DiscusssucaixinxiDao;
import com.entity.DiscusssucaixinxiEntity;
import com.service.DiscusssucaixinxiService;
import com.entity.vo.DiscusssucaixinxiVO;
import com.entity.view.DiscusssucaixinxiView;

@Service("discusssucaixinxiService")
public class DiscusssucaixinxiServiceImpl extends ServiceImpl<DiscusssucaixinxiDao, DiscusssucaixinxiEntity> implements DiscusssucaixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusssucaixinxiEntity> page = this.selectPage(
                new Query<DiscusssucaixinxiEntity>(params).getPage(),
                new EntityWrapper<DiscusssucaixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusssucaixinxiEntity> wrapper) {
		  Page<DiscusssucaixinxiView> page =new Query<DiscusssucaixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusssucaixinxiVO> selectListVO(Wrapper<DiscusssucaixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusssucaixinxiVO selectVO(Wrapper<DiscusssucaixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusssucaixinxiView> selectListView(Wrapper<DiscusssucaixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusssucaixinxiView selectView(Wrapper<DiscusssucaixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
