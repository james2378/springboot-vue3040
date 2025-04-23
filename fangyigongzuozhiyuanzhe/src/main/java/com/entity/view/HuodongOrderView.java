package com.entity.view;

import com.entity.HuodongOrderEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 活动报名
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("huodong_order")
public class HuodongOrderView extends HuodongOrderEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 报名状态的值
		*/
		private String huodongOrderValue;
		/**
		* 审核状态的值
		*/
		private String huodongOrderYesnoValue;



		//级联表 huodong
			/**
			* 活动编号
			*/
			private String huodongUuidNumber;
			/**
			* 活动名称
			*/
			private String huodongName;
			/**
			* 活动地点
			*/
			private String huodongAddress;
			/**
			* 疫情信息
			*/
			private String huodongYiqing;
			/**
			* 活动照片
			*/
			private String huodongPhoto;
			/**
			* 活动类型
			*/
			private Integer huodongTypes;
				/**
				* 活动类型的值
				*/
				private String huodongValue;
			/**
			* 活动开始时间
			*/
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			private Date kaishiTime;
			/**
			* 活动结束时间
			*/
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			private Date jieshuTime;
			/**
			* 热度
			*/
			private Integer huodongClicknum;
			/**
			* 活动介绍
			*/
			private String huodongContent;
			/**
			* 是否上架
			*/
			private Integer shangxiaTypes;
				/**
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer huodongDelete;

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

	public HuodongOrderView() {

	}

	public HuodongOrderView(HuodongOrderEntity huodongOrderEntity) {
		try {
			BeanUtils.copyProperties(this, huodongOrderEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 报名状态的值
			*/
			public String getHuodongOrderValue() {
				return huodongOrderValue;
			}
			/**
			* 设置： 报名状态的值
			*/
			public void setHuodongOrderValue(String huodongOrderValue) {
				this.huodongOrderValue = huodongOrderValue;
			}
			/**
			* 获取： 审核状态的值
			*/
			public String getHuodongOrderYesnoValue() {
				return huodongOrderYesnoValue;
			}
			/**
			* 设置： 审核状态的值
			*/
			public void setHuodongOrderYesnoValue(String huodongOrderYesnoValue) {
				this.huodongOrderYesnoValue = huodongOrderYesnoValue;
			}
















				//级联表的get和set huodong

					/**
					* 获取： 活动编号
					*/
					public String getHuodongUuidNumber() {
						return huodongUuidNumber;
					}
					/**
					* 设置： 活动编号
					*/
					public void setHuodongUuidNumber(String huodongUuidNumber) {
						this.huodongUuidNumber = huodongUuidNumber;
					}

					/**
					* 获取： 活动名称
					*/
					public String getHuodongName() {
						return huodongName;
					}
					/**
					* 设置： 活动名称
					*/
					public void setHuodongName(String huodongName) {
						this.huodongName = huodongName;
					}

					/**
					* 获取： 活动地点
					*/
					public String getHuodongAddress() {
						return huodongAddress;
					}
					/**
					* 设置： 活动地点
					*/
					public void setHuodongAddress(String huodongAddress) {
						this.huodongAddress = huodongAddress;
					}

					/**
					* 获取： 疫情信息
					*/
					public String getHuodongYiqing() {
						return huodongYiqing;
					}
					/**
					* 设置： 疫情信息
					*/
					public void setHuodongYiqing(String huodongYiqing) {
						this.huodongYiqing = huodongYiqing;
					}

					/**
					* 获取： 活动照片
					*/
					public String getHuodongPhoto() {
						return huodongPhoto;
					}
					/**
					* 设置： 活动照片
					*/
					public void setHuodongPhoto(String huodongPhoto) {
						this.huodongPhoto = huodongPhoto;
					}

					/**
					* 获取： 活动类型
					*/
					public Integer getHuodongTypes() {
						return huodongTypes;
					}
					/**
					* 设置： 活动类型
					*/
					public void setHuodongTypes(Integer huodongTypes) {
						this.huodongTypes = huodongTypes;
					}


						/**
						* 获取： 活动类型的值
						*/
						public String getHuodongValue() {
							return huodongValue;
						}
						/**
						* 设置： 活动类型的值
						*/
						public void setHuodongValue(String huodongValue) {
							this.huodongValue = huodongValue;
						}

					/**
					* 获取： 活动开始时间
					*/
					public Date getKaishiTime() {
						return kaishiTime;
					}
					/**
					* 设置： 活动开始时间
					*/
					public void setKaishiTime(Date kaishiTime) {
						this.kaishiTime = kaishiTime;
					}

					/**
					* 获取： 活动结束时间
					*/
					public Date getJieshuTime() {
						return jieshuTime;
					}
					/**
					* 设置： 活动结束时间
					*/
					public void setJieshuTime(Date jieshuTime) {
						this.jieshuTime = jieshuTime;
					}

					/**
					* 获取： 热度
					*/
					public Integer getHuodongClicknum() {
						return huodongClicknum;
					}
					/**
					* 设置： 热度
					*/
					public void setHuodongClicknum(Integer huodongClicknum) {
						this.huodongClicknum = huodongClicknum;
					}

					/**
					* 获取： 活动介绍
					*/
					public String getHuodongContent() {
						return huodongContent;
					}
					/**
					* 设置： 活动介绍
					*/
					public void setHuodongContent(String huodongContent) {
						this.huodongContent = huodongContent;
					}

					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
					}


						/**
						* 获取： 是否上架的值
						*/
						public String getShangxiaValue() {
							return shangxiaValue;
						}
						/**
						* 设置： 是否上架的值
						*/
						public void setShangxiaValue(String shangxiaValue) {
							this.shangxiaValue = shangxiaValue;
						}

					/**
					* 获取： 逻辑删除
					*/
					public Integer getHuodongDelete() {
						return huodongDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setHuodongDelete(Integer huodongDelete) {
						this.huodongDelete = huodongDelete;
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






}
