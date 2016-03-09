package com.frameworks.webservices.services;

import java.util.List;

import com.frameworks.webservices.contract.QueryTemplatesRequest;
import com.frameworks.webservices.contract.QueryTemplatesResponse;


public interface IQueryBuilderService {

	public QueryTemplatesResponse saveQueryTemplate(QueryTemplatesRequest request);
	
	public QueryTemplatesResponse getQueryTemplates(QueryTemplatesRequest request);
	
	public List<QueryTemplatesResponse> loadQueryResults(QueryTemplatesRequest request);
}
