package com.entity.view;

import com.entity.HuodongfenzuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 活动分组
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("huodongfenzu")
public class HuodongfenzuView extends HuodongfenzuEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 组工作类型的值
		*/
		private String huodongfenzuValue;



	public HuodongfenzuView() {

	}

	public HuodongfenzuView(HuodongfenzuEntity huodongfenzuEntity) {
		try {
			BeanUtils.copyProperties(this, huodongfenzuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 组工作类型的值
			*/
			public String getHuodongfenzuValue() {
				return huodongfenzuValue;
			}
			/**
			* 设置： 组工作类型的值
			*/
			public void setHuodongfenzuValue(String huodongfenzuValue) {
				this.huodongfenzuValue = huodongfenzuValue;
			}
















}
