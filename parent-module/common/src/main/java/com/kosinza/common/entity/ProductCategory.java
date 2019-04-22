package com.kosinza.common.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhachengwei
 * @since 2019-04-14
 */
@TableName("product_category")
public class ProductCategory extends Model<ProductCategory> {

    private static final long serialVersionUID = 1L;

	@TableId(value="category_id", type= IdType.AUTO)
	private Integer categoryId;
    /**
     * 类目名字
     */
	@TableField("category_name")
	private String categoryName;
    /**
     * 类目编号
     */
	@TableField("category_type")
	private Integer categoryType;
    /**
     * 创建时间
     */
	@TableField("create_time")
	private Date createTime;
    /**
     * 修改时间
     */
	@TableField("update_time")
	private Date updateTime;


	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Integer getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(Integer categoryType) {
		this.categoryType = categoryType;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	protected Serializable pkVal() {
		return this.categoryId;
	}

	@Override
	public String toString() {
		return "ProductCategory{" +
			"categoryId=" + categoryId +
			", categoryName=" + categoryName +
			", categoryType=" + categoryType +
			", createTime=" + createTime +
			", updateTime=" + updateTime +
			"}";
	}
}
