package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.loader.entity.plan.AbstractLoadPlanBasedEntityLoader;

@Entity
@Table(name="products")
public class Product extends BasicEntity {
  
	@Column(name="pname1",length=30)
	private String productName;
	@Column(name="quantity1",length=30)
	private int  productQuantity;
	@Column(name="price1",length=30)
	private double productPrice;
	@Column(name="desc1",length=30)
	private String productDesc;
	
	
	
	public Product() {
		super();
	}

	public Product(String productName, int productQuantity, double productPrice, String productDesc) {
		super();
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.productPrice = productPrice;
		this.productDesc = productDesc;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	@Override
	public String toString() {
		return "Product ["+"productId"+getProductId()+"productName=" + productName + ", productQuantity=" + productQuantity + ", productPrice="
				+ productPrice + ", productDesc=" + productDesc + "]";
	}


}
