package com.frameworks.webservices.dao.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="QUERY_TEMPLATE")
public class QueryTemplate implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="RULEID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ruleId;
	
	@Column(name="ENTITY_NAME")
    private String entityType;
    
	@Column(name="RULE_NAME")
    private String ruleName;
	
	@Column(name="SELECTED_COLUMNS")
	private String selectedColumns;
	
	@Column(name="COUNTRY_ID")
	private String countryId;
	
	@Column(name="AGENT_ID")
	private String agentId;
	
	@Column(name="RULE_TYPE")
	private String ruleType;
	
	@Column(name="CREATE_USER_ID")
    private String createUserId;
	
	@Column(name="CREATE_TIMESTAMP")
    private Date createTimestamp;
	
	@Column(name="MODIFIED_USER_ID")
    private String modifiedUserId;
	
	@Column(name="MODIFIED_TIMESTAMP")
    private Date modifiedTimestamp;
	
	@Column(name="SELECT_QUERY")
    private String selectQuery;
	
	@OneToMany(mappedBy="queryTemplate", cascade=CascadeType.MERGE, fetch=FetchType.EAGER)
	private List<FilterCriteria> listFilterCriterias;
	
	public QueryTemplate() {
	}

	public int getRuleId() {
		return ruleId;
	}

	public void setRuleId(int ruleId) {
		this.ruleId = ruleId;
	}

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

	public Date getCreateTimestamp() {
		return createTimestamp;
	}

	public void setCreateTimestamp(Date createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public String getModifiedUserId() {
		return modifiedUserId;
	}

	public void setModifiedUserId(String modifiedUserId) {
		this.modifiedUserId = modifiedUserId;
	}

	public Date getModifiedTimestamp() {
		return modifiedTimestamp;
	}

	public void setModifiedTimestamp(Date modifiedTimestamp) {
		this.modifiedTimestamp = modifiedTimestamp;
	}

	public String getSelectQuery() {
		return selectQuery;
	}

	public void setSelectQuery(String selectQuery) {
		this.selectQuery = selectQuery;
	}

	public List<FilterCriteria> getListFilterCriterias() {
		return listFilterCriterias;
	}

	public void setListFilterCriterias(List<FilterCriteria> listFilterCriterias) {
		this.listFilterCriterias = listFilterCriterias;
	}
}