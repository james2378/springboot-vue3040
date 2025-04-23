package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 活动分组
 *
 * @author 
 * @email
 */
@TableName("huodongfenzu")
public class HuodongfenzuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public HuodongfenzuEntity() {

	}

	public HuodongfenzuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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

    @Override
    public String toString() {
        return "Huodongfenzu{" +
            "id=" + id +
            ", huodongfenzuName=" + huodongfenzuName +
            ", huodongfenzuTypes=" + huodongfenzuTypes +
            ", huodongfenzuContent=" + huodongfenzuContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
