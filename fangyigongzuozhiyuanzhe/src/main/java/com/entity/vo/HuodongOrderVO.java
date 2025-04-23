package com.entity.vo;

import com.entity.HuodongOrderEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 活动报名
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("huodong_order")
public class HuodongOrderVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 报名编号
     */

    @TableField(value = "huodong_order_uuid_number")
    private String huodongOrderUuidNumber;


    /**
     * 活动
     */

    @TableField(value = "huodong_id")
    private Integer huodongId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 健康码
     */

    @TableField(value = "huodong_order_jiankangma_photo")
    private String huodongOrderJiankangmaPhoto;


    /**
     * 行程码
     */

    @TableField(value = "huodong_order_xingchengma_photo")
    private String huodongOrderXingchengmaPhoto;


    /**
     * 核算检测报告
     */

    @TableField(value = "huodong_order_hesuanbaogao_photo")
    private String huodongOrderHesuanbaogaoPhoto;


    /**
     * 个人介绍
     */

    @TableField(value = "huodong_order_jieshao_text")
    private String huodongOrderJieshaoText;


    /**
     * 报名状态
     */

    @TableField(value = "huodong_order_types")
    private Integer huodongOrderTypes;


    /**
     * 审核状态
     */

    @TableField(value = "huodong_order_yesno_types")
    private Integer huodongOrderYesnoTypes;


    /**
     * 审核意见
     */

    @TableField(value = "huodong_order_yesno_text")
    private String huodongOrderYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "huodong_order_shenhe_time")
    private Date huodongOrderShenheTime;


    /**
     * 报名时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show3
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：报名编号
	 */
    public String getHuodongOrderUuidNumber() {
        return huodongOrderUuidNumber;
    }


    /**
	 * 获取：报名编号
	 */

    public void setHuodongOrderUuidNumber(String huodongOrderUuidNumber) {
        this.huodongOrderUuidNumber = huodongOrderUuidNumber;
    }
    /**
	 * 设置：活动
	 */
    public Integer getHuodongId() {
        return huodongId;
    }


    /**
	 * 获取：活动
	 */

    public void setHuodongId(Integer huodongId) {
        this.huodongId = huodongId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：健康码
	 */
    public String getHuodongOrderJiankangmaPhoto() {
        return huodongOrderJiankangmaPhoto;
    }


    /**
	 * 获取：健康码
	 */

    public void setHuodongOrderJiankangmaPhoto(String huodongOrderJiankangmaPhoto) {
        this.huodongOrderJiankangmaPhoto = huodongOrderJiankangmaPhoto;
    }
    /**
	 * 设置：行程码
	 */
    public String getHuodongOrderXingchengmaPhoto() {
        return huodongOrderXingchengmaPhoto;
    }


    /**
	 * 获取：行程码
	 */

    public void setHuodongOrderXingchengmaPhoto(String huodongOrderXingchengmaPhoto) {
        this.huodongOrderXingchengmaPhoto = huodongOrderXingchengmaPhoto;
    }
    /**
	 * 设置：核算检测报告
	 */
    public String getHuodongOrderHesuanbaogaoPhoto() {
        return huodongOrderHesuanbaogaoPhoto;
    }


    /**
	 * 获取：核算检测报告
	 */

    public void setHuodongOrderHesuanbaogaoPhoto(String huodongOrderHesuanbaogaoPhoto) {
        this.huodongOrderHesuanbaogaoPhoto = huodongOrderHesuanbaogaoPhoto;
    }
    /**
	 * 设置：个人介绍
	 */
    public String getHuodongOrderJieshaoText() {
        return huodongOrderJieshaoText;
    }


    /**
	 * 获取：个人介绍
	 */

    public void setHuodongOrderJieshaoText(String huodongOrderJieshaoText) {
        this.huodongOrderJieshaoText = huodongOrderJieshaoText;
    }
    /**
	 * 设置：报名状态
	 */
    public Integer getHuodongOrderTypes() {
        return huodongOrderTypes;
    }


    /**
	 * 获取：报名状态
	 */

    public void setHuodongOrderTypes(Integer huodongOrderTypes) {
        this.huodongOrderTypes = huodongOrderTypes;
    }
    /**
	 * 设置：审核状态
	 */
    public Integer getHuodongOrderYesnoTypes() {
        return huodongOrderYesnoTypes;
    }


    /**
	 * 获取：审核状态
	 */

    public void setHuodongOrderYesnoTypes(Integer huodongOrderYesnoTypes) {
        this.huodongOrderYesnoTypes = huodongOrderYesnoTypes;
    }
    /**
	 * 设置：审核意见
	 */
    public String getHuodongOrderYesnoText() {
        return huodongOrderYesnoText;
    }


    /**
	 * 获取：审核意见
	 */

    public void setHuodongOrderYesnoText(String huodongOrderYesnoText) {
        this.huodongOrderYesnoText = huodongOrderYesnoText;
    }
    /**
	 * 设置：审核时间
	 */
    public Date getHuodongOrderShenheTime() {
        return huodongOrderShenheTime;
    }


    /**
	 * 获取：审核时间
	 */

    public void setHuodongOrderShenheTime(Date huodongOrderShenheTime) {
        this.huodongOrderShenheTime = huodongOrderShenheTime;
    }
    /**
	 * 设置：报名时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：报名时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
