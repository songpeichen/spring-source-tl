package com.mybatis.v3.entity;

/**
 * Created by smlz on 2019/6/17.
 */
public class AccountInfo {

	@Override
	public String toString() {
		return "AccountInfo{" +
				"id=" + id +
				", accoutId='" + accoutId + '\'' +
				", blance=" + blance +
				'}';
	}

	private Integer id;

    private String accoutId;

    private double blance;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccoutId() {
        return accoutId;
    }

    public void setAccoutId(String accoutId) {
        this.accoutId = accoutId;
    }

    public double getBlance() {
        return blance;
    }

    public void setBlance(double blance) {
        this.blance = blance;
    }
}
