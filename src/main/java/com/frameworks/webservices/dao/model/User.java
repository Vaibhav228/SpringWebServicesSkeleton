package com.frameworks.webservices.dao.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="USER")
public class User implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="USER_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long userId;
	
	@Basic(optional=false)
	@Column(name="USER_NAME", nullable=false)
	private String userName;
	
	@Basic(optional=false)
	@Column(name="PASSWORD", nullable=false)
	private String password;
	
	@Basic(optional=false)
	@Column(name="LOGIN_STATUS", nullable=false)
	private String loginStatus;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Basic(optional=true)
	@Column(name="LAST_UPDATE_DATE", nullable=false)
	private Date lastUpdateDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Basic(optional=false)
	@Column(name="LAST_LOGIN", nullable=false)
	private Date lastLoginDate;
	
	@Basic(optional=true)
	@Column(name="RETRIES", nullable=false)
	private int retries;

	@Basic(optional=true)
	@Column(name="CREATED_BY", nullable=false)
	private String createdBy;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Basic(optional=false)
	@Column(name="CREATION_DATE", nullable=false)
	private Date createdDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Basic(optional=true)
	@Column(name="LAST_FAILED_LOGIN", nullable=false)
	private Date lastFailedLoginDate;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public int getRetries() {
		return retries;
	}

	public void setRetries(int retries) {
		this.retries = retries;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getLastFailedLoginDate() {
		return lastFailedLoginDate;
	}

	public void setLastFailedLoginDate(Date lastFailedLoginDate) {
		this.lastFailedLoginDate = lastFailedLoginDate;
	}
}
