package com.dao;

import com.entity.HuodongfenzuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.HuodongfenzuView;

/**
 * 活动分组 Dao 接口
 *
 * @author 
 */
public interface HuodongfenzuDao extends BaseMapper<HuodongfenzuEntity> {

   List<HuodongfenzuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
