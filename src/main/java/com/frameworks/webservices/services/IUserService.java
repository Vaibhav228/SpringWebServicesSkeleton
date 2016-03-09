package com.frameworks.webservices.services;

import javax.annotation.security.RolesAllowed;

import com.frameworks.webservices.contract.CreateSessionRequest;
import com.frameworks.webservices.contract.CreateSessionResponse;
import com.frameworks.webservices.contract.CustomerSignonRequest;
import com.frameworks.webservices.contract.CustomerSignonResponse;

public interface IUserService {

	@RolesAllowed({"ALL"})
	public CreateSessionResponse createSession(CreateSessionRequest request);
	
	@RolesAllowed({"ALL"})
	public CustomerSignonResponse customerSignon(CustomerSignonRequest request);
}
