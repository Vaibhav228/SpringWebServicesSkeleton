package com.frameworks.webservices.contract;

import java.io.Serializable;
import java.util.List;

import com.frameworks.webservices.contract.bean.FilterCriteria;

public class QueryTemplatesRequest extends BaseRequest implements Serializable{

	private static final long serialVersionUID = 1L;

    private String entityType;
    private String ruleName;
	private String selectedColumns;
	private String countryId;
	private String agentId;
	private String ruleType;
    private String createUserId;
    private String modifiedUserId;
    private String selectQuery;
	private List<FilterCriteria> filterCriterias;

	public String getEntityType() {
		return entityType;
	}
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}
	public String getRuleName() {
		return ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}
	public String getSelectedColumns() {
		return selectedColumns;
	}
	public void setSelectedColumns(String selectedColumns) {
		this.selectedColumns = selectedColumns;
	}
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	public String getAgentId() {
		return agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	public String getRuleType() {
		return ruleType;
	}
	public void setRuleType(String ruleType) {
		this.ruleType = ruleType;
	}
	public String getCreateUserId() {
		return createUserId;
	}
	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}
	public String getModifiedUserId() {
		return modifiedUserId;
	}
	public void setModifiedUserId(String modifiedUserId) {
		this.modifiedUserId = modifiedUserId;
	}
	public String getSelectQuery() {
		return selectQuery;
	}
	public void setSelectQuery(String selectQuery) {
		this.selectQuery = selectQuery;
	}
	public List<FilterCriteria> getFilterCriterias() {
		return filterCriterias;
	}
	public void setFilterCriterias(List<FilterCriteria> filterCriterias) {
		this.filterCriterias = filterCriterias;
	}
}
