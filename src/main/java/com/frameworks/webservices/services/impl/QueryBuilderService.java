package com.frameworks.webservices.services.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.frameworks.webservices.businesslogic.IQueryBuilderLogic;
import com.frameworks.webservices.businesslogic.ISessionLogic;
import com.frameworks.webservices.constants.AppConstants;
import com.frameworks.webservices.contract.QueryTemplatesRequest;
import com.frameworks.webservices.contract.QueryTemplatesResponse;
import com.frameworks.webservices.exception.BusinessLogicException;
import com.frameworks.webservices.services.IQueryBuilderService;

@Component
public class QueryBuilderService implements IQueryBuilderService{
	
	private static final Logger logger = LoggerFactory.getLogger(DataService.class);

	@Autowired
	private ISessionLogic sessionLogic;
	
	@Autowired
	private IQueryBuilderLogic queryBuilderLogic;
	
	@RequestMapping(value = "/saveQueryTemplate", method = RequestMethod.POST, consumes={AppConstants.CONTENT_TYPE_JSON}, produces={AppConstants.CONTENT_TYPE_JSON})
	@ResponseBody
	public QueryTemplatesResponse saveQueryTemplate(@RequestBody QueryTemplatesRequest request) {
		logger.debug("Method -- saveQueryTemplates --- Start");
		QueryTemplatesResponse response = new QueryTemplatesResponse();
		try{
			boolean  isVerified = sessionLogic.verifySession(request.getSecurity().getSession().getId());
			
			if(isVerified){
				queryBuilderLogic.saveQueryTemplates(request);
			}
			
		}catch(BusinessLogicException ex){
			logger.error("Business Error occured while creating session");
		}catch(Exception ex){
			logger.error("Error occured while creating session");
		}
		logger.debug("Method -- saveQueryTemplates --- End");
		return null;
	}

	public QueryTemplatesResponse getQueryTemplates(QueryTemplatesRequest request) {
		return null;
	}

	public List<QueryTemplatesResponse> loadQueryResults(QueryTemplatesRequest request) {
		return null;
	}
}
