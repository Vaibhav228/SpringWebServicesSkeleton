package com.frameworks.webservices.contract.bean;

import java.io.Serializable;

public class FilterCriteria implements Serializable {

	private static final long serialVersionUID = 1L;

	private int filterCriteriaID;
	private int fieldName;
	private int fieldOperator;
	private int fieldValue;
	private int filterAndOr;
	private int groupByFields;
	private int queryFunction;

	public int getFilterCriteriaID() {
		return filterCriteriaID;
	}
	public void setFilterCriteriaID(int filterCriteriaID) {
		this.filterCriteriaID = filterCriteriaID;
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