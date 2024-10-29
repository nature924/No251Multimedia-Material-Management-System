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


import com.dao.DiscussziyuanxinxiDao;
import com.entity.DiscussziyuanxinxiEntity;
import com.service.DiscussziyuanxinxiService;
import com.entity.vo.DiscussziyuanxinxiVO;
import com.entity.view.DiscussziyuanxinxiView;

@Service("discussziyuanxinxiService")
public class DiscussziyuanxinxiServiceImpl extends ServiceImpl<DiscussziyuanxinxiDao, DiscussziyuanxinxiEntity> implements DiscussziyuanxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussziyuanxinxiEntity> page = this.selectPage(
                new Query<DiscussziyuanxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussziyuanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussziyuanxinxiEntity> wrapper) {
		  Page<DiscussziyuanxinxiView> page =new Query<DiscussziyuanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussziyuanxinxiVO> selectListVO(Wrapper<DiscussziyuanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussziyuanxinxiVO selectVO(Wrapper<DiscussziyuanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussziyuanxinxiView> selectListView(Wrapper<DiscussziyuanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussziyuanxinxiView selectView(Wrapper<DiscussziyuanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
