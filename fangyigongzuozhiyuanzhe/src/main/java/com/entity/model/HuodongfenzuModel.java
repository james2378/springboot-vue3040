package com.entity.model;

import com.entity.HuodongfenzuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 活动分组
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class HuodongfenzuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 分组名称
     */
    private String huodongfenzuName;


    /**
     * 组工作类型
     */
    private Integer huodongfenzuTypes;


    /**
     * 组工作内容
     */
    private String huodongfenzuContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
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
	 * 获取：分组名称
	 */
    public String getHuodongfenzuName() {
        return huodongfenzuName;
    }


    /**
	 * 设置：分组名称
	 */
    public void setHuodongfenzuName(String huodongfenzuName) {
        this.huodongfenzuName = huodongfenzuName;
    }
    /**
	 * 获取：组工作类型
	 */
    public Integer getHuodongfenzuTypes() {
        return huodongfenzuTypes;
    }


    /**
	 * 设置：组工作类型
	 */
    public void setHuodongfenzuTypes(Integer huodongfenzuTypes) {
        this.huodongfenzuTypes = huodongfenzuTypes;
    }
    /**
	 * 获取：组工作内容
	 */
    public String getHuodongfenzuContent() {
        return huodongfenzuContent;
    }


    /**
	 * 设置：组工作内容
	 */
    public void setHuodongfenzuContent(String huodongfenzuContent) {
        this.huodongfenzuContent = huodongfenzuContent;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
