package com.frameworks.webservices.businesslogic;

import org.springframework.web.bind.annotation.RequestBody;

import com.frameworks.webservices.contract.QueryTemplatesRequest;
import com.frameworks.webservices.contract.QueryTemplatesResponse;

public interface IQueryBuilderLogic {

	public QueryTemplatesResponse saveQueryTemplates(@RequestBody QueryTemplatesRequest request);
}
