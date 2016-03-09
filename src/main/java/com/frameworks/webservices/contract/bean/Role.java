package com.frameworks.webservices.contract.bean;

import java.io.Serializable;
import java.util.List;

public class Role implements Serializable{

	private static final long serialVersionUID = 1L;
	protected String roleName;
	protected List<String> roleFunctions;

	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public List<String> getRoleFunctions() {
		return roleFunctions;
	}
	public void setRoleFunctions(List<String> roleFunctions) {
		this.roleFunctions = roleFunctions;
	}
}
