package com.frameworks.webservices.services.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

import com.frameworks.webservices.contract.GetTransactionsRequest;
import com.frameworks.webservices.contract.GetTransactionsResponse;
import com.frameworks.webservices.services.ITransactionService;

@RestController
public class TransactionService implements ITransactionService{
	
	private static final Logger logger = LoggerFactory.getLogger(TransactionService.class);

	public GetTransactionsResponse getTransactions(GetTransactionsRequest request) {
		return null;
	}
}
