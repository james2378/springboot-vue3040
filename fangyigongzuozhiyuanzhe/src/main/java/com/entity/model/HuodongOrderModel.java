package com.entity.model;

import com.entity.HuodongOrderEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 活动报名
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class HuodongOrderModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 报名编号
     */
    private String huodongOrderUuidNumber;


    /**
     * 活动
     */
    private Integer huodongId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 健康码
     */
    private String huodongOrderJiankangmaPhoto;


    /**
     * 行程码
     */
    private String huodongOrderXingchengmaPhoto;


    /**
     * 核算检测报告
     */
    private String huodongOrderHesuanbaogaoPhoto;


    /**
     * 个人介绍
     */
    private String huodongOrderJieshaoText;


    /**
     * 报名状态
     */
    private Integer huodongOrderTypes;


    /**
     * 审核状态
     */
    private Integer huodongOrderYesnoTypes;


    /**
     * 审核意见
     */
    private String huodongOrderYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date huodongOrderShenheTime;


    /**
     * 报名时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show3
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：报名编号
	 */
    public String getHuodongOrderUuidNumber() {
        return huodongOrderUuidNumber;
    }


    /**
	 * 设置：报名编号
	 */
    public void setHuodongOrderUuidNumber(String huodongOrderUuidNumber) {
        this.huodongOrderUuidNumber = huodongOrderUuidNumber;
    }
    /**
	 * 获取：活动
	 */
    public Integer getHuodongId() {
        return huodongId;
    }


    /**
	 * 设置：活动
	 */
    public void setHuodongId(Integer huodongId) {
        this.huodongId = huodongId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：健康码
	 */
    public String getHuodongOrderJiankangmaPhoto() {
        return huodongOrderJiankangmaPhoto;
    }


    /**
	 * 设置：健康码
	 */
    public void setHuodongOrderJiankangmaPhoto(String huodongOrderJiankangmaPhoto) {
        this.huodongOrderJiankangmaPhoto = huodongOrderJiankangmaPhoto;
    }
    /**
	 * 获取：行程码
	 */
    public String getHuodongOrderXingchengmaPhoto() {
        return huodongOrderXingchengmaPhoto;
    }


    /**
	 * 设置：行程码
	 */
    public void setHuodongOrderXingchengmaPhoto(String huodongOrderXingchengmaPhoto) {
        this.huodongOrderXingchengmaPhoto = huodongOrderXingchengmaPhoto;
    }
    /**
	 * 获取：核算检测报告
	 */
    public String getHuodongOrderHesuanbaogaoPhoto() {
        return huodongOrderHesuanbaogaoPhoto;
    }


    /**
	 * 设置：核算检测报告
	 */
    public void setHuodongOrderHesuanbaogaoPhoto(String huodongOrderHesuanbaogaoPhoto) {
        this.huodongOrderHesuanbaogaoPhoto = huodongOrderHesuanbaogaoPhoto;
    }
    /**
	 * 获取：个人介绍
	 */
    public String getHuodongOrderJieshaoText() {
        return huodongOrderJieshaoText;
    }


    /**
	 * 设置：个人介绍
	 */
    public void setHuodongOrderJieshaoText(String huodongOrderJieshaoText) {
        this.huodongOrderJieshaoText = huodongOrderJieshaoText;
    }
    /**
	 * 获取：报名状态
	 */
    public Integer getHuodongOrderTypes() {
        return huodongOrderTypes;
    }


    /**
	 * 设置：报名状态
	 */
    public void setHuodongOrderTypes(Integer huodongOrderTypes) {
        this.huodongOrderTypes = huodongOrderTypes;
    }
    /**
	 * 获取：审核状态
	 */
    public Integer getHuodongOrderYesnoTypes() {
        return huodongOrderYesnoTypes;
    }


    /**
	 * 设置：审核状态
	 */
    public void setHuodongOrderYesnoTypes(Integer huodongOrderYesnoTypes) {
        this.huodongOrderYesnoTypes = huodongOrderYesnoTypes;
    }
    /**
	 * 获取：审核意见
	 */
    public String getHuodongOrderYesnoText() {
        return huodongOrderYesnoText;
    }


    /**
	 * 设置：审核意见
	 */
    public void setHuodongOrderYesnoText(String huodongOrderYesnoText) {
        this.huodongOrderYesnoText = huodongOrderYesnoText;
    }
    /**
	 * 获取：审核时间
	 */
    public Date getHuodongOrderShenheTime() {
        return huodongOrderShenheTime;
    }


    /**
	 * 设置：审核时间
	 */
    public void setHuodongOrderShenheTime(Date huodongOrderShenheTime) {
        this.huodongOrderShenheTime = huodongOrderShenheTime;
    }
    /**
	 * 获取：报名时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：报名时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
