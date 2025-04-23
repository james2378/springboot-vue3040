package com.entity.view;

import com.entity.NeibuyoujianEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 内部邮件
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("neibuyoujian")
public class NeibuyoujianView extends NeibuyoujianEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;

		//级联表 gongzuorenyuan
			/**
			* 工作人员姓名
			*/
			private String gongzuorenyuanName;
			/**
			* 工作人员手机号
			*/
			private String gongzuorenyuanPhone;
			/**
			* 工作人员头像
			*/
			private String gongzuorenyuanPhoto;
			/**
			* 电子邮箱
			*/
			private String gongzuorenyuanEmail;

	public NeibuyoujianView() {

	}

	public NeibuyoujianView(NeibuyoujianEntity neibuyoujianEntity) {
		try {
			BeanUtils.copyProperties(this, neibuyoujianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}









































				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}


				//级联表的get和set gongzuorenyuan

					/**
					* 获取： 工作人员姓名
					*/
					public String getGongzuorenyuanName() {
						return gongzuorenyuanName;
					}
					/**
					* 设置： 工作人员姓名
					*/
					public void setGongzuorenyuanName(String gongzuorenyuanName) {
						this.gongzuorenyuanName = gongzuorenyuanName;
					}

					/**
					* 获取： 工作人员手机号
					*/
					public String getGongzuorenyuanPhone() {
						return gongzuorenyuanPhone;
					}
					/**
					* 设置： 工作人员手机号
					*/
					public void setGongzuorenyuanPhone(String gongzuorenyuanPhone) {
						this.gongzuorenyuanPhone = gongzuorenyuanPhone;
					}

					/**
					* 获取： 工作人员头像
					*/
					public String getGongzuorenyuanPhoto() {
						return gongzuorenyuanPhoto;
					}
					/**
					* 设置： 工作人员头像
					*/
					public void setGongzuorenyuanPhoto(String gongzuorenyuanPhoto) {
						this.gongzuorenyuanPhoto = gongzuorenyuanPhoto;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getGongzuorenyuanEmail() {
						return gongzuorenyuanEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setGongzuorenyuanEmail(String gongzuorenyuanEmail) {
						this.gongzuorenyuanEmail = gongzuorenyuanEmail;
					}




}
