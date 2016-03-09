package com.frameworks.webservices.businesslogic.impl;

import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.frameworks.webservices.businesslogic.IQueryBuilderLogic;
import com.frameworks.webservices.contract.QueryTemplatesRequest;
import com.frameworks.webservices.contract.QueryTemplatesResponse;
import com.frameworks.webservices.dao.DaoFactory;
import com.frameworks.webservices.dao.model.QueryTemplate;

@Component
public class QueryBuilderLogicImpl implements IQueryBuilderLogic{

	private static final Logger logger = LoggerFactory.getLogger(QueryBuilderLogicImpl.class);
	
	@Autowired
	DaoFactory daoFactory;
	
	@Autowired
	Mapper dozerBizLogicMapper;
	
	public QueryTemplatesResponse saveQueryTemplates(QueryTemplatesRequest request) {
		
		QueryTemplate queryTemplate = dozerBizLogicMapper.map(request, QueryTemplate.class);
		
		return null;
	}

}
