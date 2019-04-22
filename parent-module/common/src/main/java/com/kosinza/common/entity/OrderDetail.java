package com.kosinza.common.entity;

import java.io.Serializable;

import java.math.BigDecimal;
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
@TableName("order_detail")
public class OrderDetail extends Model<OrderDetail> {

    private static final long serialVersionUID = 1L;

    @TableId("detail_id")
	private String detailId;
	@TableField("order_id")
	private String orderId;
	@TableField("product_id")
	private String productId;
    /**
     * 商品名称
     */
	@TableField("product_name")
	private String productName;
    /**
     * 当前价格,单位分
     */
	@TableField("product_price")
	private BigDecimal productPrice;
    /**
     * 数量
     */
	@TableField("product_quantity")
	private Integer productQuantity;
    /**
     * 小图
     */
	@TableField("product_icon")
	private String productIcon;
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


	public String getDetailId() {
		return detailId;
	}

	public void setDetailId(String detailId) {
		this.detailId = detailId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public BigDecimal getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}

	public Integer getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}

	public String getProductIcon() {
		return productIcon;
	}

	public void setProductIcon(String productIcon) {
		this.productIcon = productIcon;
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
		return this.detailId;
	}

	@Override
	public String toString() {
		return "OrderDetail{" +
			"detailId=" + detailId +
			", orderId=" + orderId +
			", productId=" + productId +
			", productName=" + productName +
			", productPrice=" + productPrice +
			", productQuantity=" + productQuantity +
			", productIcon=" + productIcon +
			", createTime=" + createTime +
			", updateTime=" + updateTime +
			"}";
	}
}
