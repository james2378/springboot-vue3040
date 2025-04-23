package com.dao;

import com.entity.HuodongfenzuChengyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.HuodongfenzuChengyuanView;

/**
 * 组内成员 Dao 接口
 *
 * @author 
 */
public interface HuodongfenzuChengyuanDao extends BaseMapper<HuodongfenzuChengyuanEntity> {

   List<HuodongfenzuChengyuanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
