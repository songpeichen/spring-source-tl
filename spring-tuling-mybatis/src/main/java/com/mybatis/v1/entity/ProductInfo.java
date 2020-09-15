package com.mybatis.v1.entity;

/**
 * Created by smlz on 2019/6/23.
 */
public class ProductInfo {

	@Override
	public String toString() {
		return "ProductInfo{" +
				"productId=" + productId +
				", productName='" + productName + '\'' +
				", store=" + store +
				'}';
	}

	private Integer productId;

    private String productName;

    private Integer store;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getStore() {
        return store;
    }

    public void setStore(Integer store) {
        this.store = store;
    }
}
