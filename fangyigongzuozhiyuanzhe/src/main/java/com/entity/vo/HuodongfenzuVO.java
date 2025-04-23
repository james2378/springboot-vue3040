package com.entity.vo;

import com.entity.HuodongfenzuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 活动分组
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("huodongfenzu")
public class HuodongfenzuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 分组名称
     */

    @TableField(value = "huodongfenzu_name")
    private String huodongfenzuName;


    /**
     * 组工作类型
     */

    @TableField(value = "huodongfenzu_types")
    private Integer huodongfenzuTypes;


    /**
     * 组工作内容
     */

    @TableField(value = "huodongfenzu_content")
    private String huodongfenzuContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
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
	 * 设置：分组名称
	 */
    public String getHuodongfenzuName() {
        return huodongfenzuName;
    }


    /**
	 * 获取：分组名称
	 */

    public void setHuodongfenzuName(String huodongfenzuName) {
        this.huodongfenzuName = huodongfenzuName;
    }
    /**
	 * 设置：组工作类型
	 */
    public Integer getHuodongfenzuTypes() {
        return huodongfenzuTypes;
    }


    /**
	 * 获取：组工作类型
	 */

    public void setHuodongfenzuTypes(Integer huodongfenzuTypes) {
        this.huodongfenzuTypes = huodongfenzuTypes;
    }
    /**
	 * 设置：组工作内容
	 */
    public String getHuodongfenzuContent() {
        return huodongfenzuContent;
    }


    /**
	 * 获取：组工作内容
	 */

    public void setHuodongfenzuContent(String huodongfenzuContent) {
        this.huodongfenzuContent = huodongfenzuContent;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
