package com.velocity.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Policy {
	// id,policyid,status,policyname
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String policyId;
	private String policyName;
	private String status;
	private Integer userId;

	public Policy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Policy(int id, String policyId, String policyName, String status, Integer userId) {
		super();
		this.id = id;
		this.policyId = policyId;
		this.policyName = policyName;
		this.status = status;
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPolicyId() {
		return policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Policy [id=" + id + ", policyId=" + policyId + ", policyName=" + policyName + ", status=" + status
				+ ", userId=" + userId + "]";
	}

}
