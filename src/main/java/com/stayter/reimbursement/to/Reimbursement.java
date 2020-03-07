package com.stayter.reimbursement.to;

import java.util.Date;

public class Reimbursement {
	private String desc;
	private Date date;
	private float amount;
	private String status;
	
	public Reimbursement(String desc, Date date, float amount) {
		super();
		this.desc = desc;
		this.date = date;
		this.amount = amount;
		this.status = "pending";
	}

	public Reimbursement(String desc, Date date, float amount, String status) {
		super();
		this.desc = desc;
		this.date = date;
		this.amount = amount;
		this.status = status;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
