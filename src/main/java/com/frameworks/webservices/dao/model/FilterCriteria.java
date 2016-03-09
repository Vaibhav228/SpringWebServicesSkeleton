package com.frameworks.webservices.dao.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="FILTERCRITERIA")
public class FilterCriteria implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="FILTERCRITERIAID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int filterCriteriaID;

    @ManyToOne
    @JoinColumn(name="RULE_ID")
    private QueryTemplate queryTemplate;
	
	@Column(name="FIELD_NAME")
	private int fieldName;
	
	@Column(name="FIELD_OPERATOR")
	private int fieldOperator;
	
	@Column(name="FIELD_VALUE")
	private int fieldValue;
	
	@Column(name="FILTER_ANDOR")
	private int filterAndOr;
	
	@Column(name="GROUPBY_FIELDS")
	private int groupByFields;
	
	@Column(name="QUERY_FUNCTION")
	private int queryFunction;

	public int getFilterCriteriaID() {
		return filterCriteriaID;
	}

	public void setFilterCriteriaID(int filterCriteriaID) {
		this.filterCriteriaID = filterCriteriaID;
	}

	public QueryTemplate getQueryTemplate() {
		return queryTemplate;
	}

	public void setQueryTemplate(QueryTemplate queryTemplate) {
		this.queryTemplate = queryTemplate;
	}

	public int getFieldName() {
		return fieldName;
	}

	public void setFieldName(int fieldName) {
		this.fieldName = fieldName;
	}

	public int getFieldOperator() {
		return fieldOperator;
	}

	public void setFieldOperator(int fieldOperator) {
		this.fieldOperator = fieldOperator;
	}

	public int getFieldValue() {
		return fieldValue;
	}

	public void setFieldValue(int fieldValue) {
		this.fieldValue = fieldValue;
	}

	public int getFilterAndOr() {
		return filterAndOr;
	}

	public void setFilterAndOr(int filterAndOr) {
		this.filterAndOr = filterAndOr;
	}

	public int getGroupByFields() {
		return groupByFields;
	}

	public void setGroupByFields(int groupByFields) {
		this.groupByFields = groupByFields;
	}

	public int getQueryFunction() {
		return queryFunction;
	}

	public void setQueryFunction(int queryFunction) {
		this.queryFunction = queryFunction;
	}
}