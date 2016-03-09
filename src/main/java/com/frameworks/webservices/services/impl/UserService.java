package com.frameworks.webservices.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.frameworks.webservices.businesslogic.ISessionLogic;
import com.frameworks.webservices.businesslogic.IUserLogic;
import com.frameworks.webservices.constants.AppConstants;
import com.frameworks.webservices.contract.CreateSessionRequest;
import com.frameworks.webservices.contract.CreateSessionResponse;
import com.frameworks.webservices.contract.CustomerSignonRequest;
import com.frameworks.webservices.contract.CustomerSignonResponse;
import com.frameworks.webservices.contract.bean.Customer;
import com.frameworks.webservices.contract.bean.Role;
import com.frameworks.webservices.contract.bean.Security;
import com.frameworks.webservices.contract.bean.Session;
import com.frameworks.webservices.exception.BusinessLogicException;
import com.frameworks.webservices.services.IUserService;


@RestController
public class UserService implements IUserService{

	private static final Logger logger = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private ISessionLogic sessionLogic;
	
	@Autowired
	private IUserLogic userLogic;
	
	@RequestMapping(value = "/health", method = RequestMethod.GET)
	public @ResponseBody String healthCheck(){
		return "Active";
	}
	
	@RequestMapping(value = "/createSession", method = RequestMethod.POST, consumes={AppConstants.CONTENT_TYPE_JSON}, produces={AppConstants.CONTENT_TYPE_JSON})
	public @ResponseBody CreateSessionResponse createSession(@RequestBody CreateSessionRequest request){
		logger.debug("Method -- createSession --- Start");
		String sessionId = null;
		CreateSessionResponse response = new CreateSessionResponse();
		try{			
			response.setChannel(request.getChannel());
			if(request.getLocale()!=null && request.getLocale().getCountryCode() != null && request.getLocale().getLanguageCode() != null){
				response.setLocale(request.getLocale());	
			}
			
			sessionId = sessionLogic.createSession(request, request.getChannel().getType());
			
			Security security = new Security();
			Session session = new Session();
			session.setId(sessionId);
			security.setSession(session);
			security.setClientIp(request.getSecurity().getClientIp());
			response.setSecurity(security);

		}catch(BusinessLogicException ex){
			logger.error("Business Error occured while creating session");
		}catch(Exception ex){
			logger.error("Error occured while creating session");
		}
		logger.debug("Method -- createSession --- End");
		return response;
	}
	

	@RequestMapping(value = "/customerSignon", method = RequestMethod.POST, consumes={AppConstants.CONTENT_TYPE_JSON}, produces={AppConstants.CONTENT_TYPE_JSON})
	@ResponseBody
	public CustomerSignonResponse customerSignon(@RequestBody CustomerSignonRequest request) {
		logger.debug("Method -- customerSignon --- Start");
		CustomerSignonResponse response = new CustomerSignonResponse();
		try{
			boolean  isVerified = sessionLogic.verifySession(request.getSecurity().getSession().getId());
			
			if(isVerified){

				logger.debug("Check User exists....: "+request.getCustomer().getEmail());
				if(userLogic.checkIfCustomerExists(request.getCustomer())){
					Customer user = new Customer();
					user.setEmail(request.getCustomer().getEmail());
					user.setFirstName("Vaibhav");
					user.setMiddleName("Ashok");
					user.setLastName("Patil");
					user.setDateOfBirth("22-July-1987");
					
					List<Role> rolesList = new ArrayList<Role>();
					Role role = new Role();
					if(request.getCustomer().getEmail().equalsIgnoreCase("OPERATOR")){
						role.setRoleName("OPERATOR");
						List<String> roleFunctions = new ArrayList<String>();
						roleFunctions.add("QUERY_MANAGER");
						roleFunctions.add("BUILD_QUERY");
						roleFunctions.add("PRE_BUILD_QUERY");
						role.setRoleFunctions(roleFunctions);
					}else if(request.getCustomer().getEmail().equalsIgnoreCase("MANAGER")){
						role.setRoleName("MANAGER");
						List<String> roleFunctions = new ArrayList<String>();
						roleFunctions.add("DATA_ANALYZER");
						roleFunctions.add("ANALYSE_TRANS");
						roleFunctions.add("BUILD_QUERY");
						role.setRoleFunctions(roleFunctions);
					}else if(request.getCustomer().getEmail().equalsIgnoreCase("ANALYST")){
						role.setRoleName("ANALYST");
						List<String> roleFunctions = new ArrayList<String>();
						roleFunctions.add("BUILD_REPORT");
						role.setRoleFunctions(roleFunctions);
					}
					rolesList.add(role);
					user.setUserRoles(rolesList);
					response.setUser(user);
				}
				//userLogic.createUser();
			}else{
				logger.debug("Invalid Session");
			}
		}catch(BusinessLogicException ex){
			logger.error("Business Error occured while customerSignon");
		}catch(Exception ex){
			logger.error("Business Error occured while customerSignon : "+ex);
		}
		logger.debug("Method -- customerSignon --- End");
		return response;
	}
}
