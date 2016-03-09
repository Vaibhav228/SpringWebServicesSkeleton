package com.frameworks.webservices.services;

import com.frameworks.webservices.contract.GetTransactionsRequest;
import com.frameworks.webservices.contract.GetTransactionsResponse;

public interface ITransactionService {

	public GetTransactionsResponse getTransactions(GetTransactionsRequest request);
}
