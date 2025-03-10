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
 * 课后服务报名
 *
 * @author 
 * @email
 */
@TableName("kehoufuwu_order")
public class KehoufuwuOrderEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public KehoufuwuOrderEntity() {

	}

	public KehoufuwuOrderEntity(T t) {
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
     * 课后服务
     */
    @TableField(value = "kehoufuwu_id")

    private Integer kehoufuwuId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 申请状态
     */
    @TableField(value = "kehoufuwu_order_yesno_types")

    private Integer kehoufuwuOrderYesnoTypes;


    /**
     * 申请结果
     */
    @TableField(value = "kehoufuwu_order_yesno_text")

    private String kehoufuwuOrderYesnoText;


    /**
     * 申请时间
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
	 * 设置：课后服务
	 */
    public Integer getKehoufuwuId() {
        return kehoufuwuId;
    }
    /**
	 * 获取：课后服务
	 */

    public void setKehoufuwuId(Integer kehoufuwuId) {
        this.kehoufuwuId = kehoufuwuId;
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
	 * 设置：申请状态
	 */
    public Integer getKehoufuwuOrderYesnoTypes() {
        return kehoufuwuOrderYesnoTypes;
    }
    /**
	 * 获取：申请状态
	 */

    public void setKehoufuwuOrderYesnoTypes(Integer kehoufuwuOrderYesnoTypes) {
        this.kehoufuwuOrderYesnoTypes = kehoufuwuOrderYesnoTypes;
    }
    /**
	 * 设置：申请结果
	 */
    public String getKehoufuwuOrderYesnoText() {
        return kehoufuwuOrderYesnoText;
    }
    /**
	 * 获取：申请结果
	 */

    public void setKehoufuwuOrderYesnoText(String kehoufuwuOrderYesnoText) {
        this.kehoufuwuOrderYesnoText = kehoufuwuOrderYesnoText;
    }
    /**
	 * 设置：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：申请时间
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
        return "KehoufuwuOrder{" +
            "id=" + id +
            ", kehoufuwuId=" + kehoufuwuId +
            ", yonghuId=" + yonghuId +
            ", kehoufuwuOrderYesnoTypes=" + kehoufuwuOrderYesnoTypes +
            ", kehoufuwuOrderYesnoText=" + kehoufuwuOrderYesnoText +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
