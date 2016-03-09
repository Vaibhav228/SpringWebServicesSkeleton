package com.frameworks.webservices.contract;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

//TODO - Do not include NUll in the Response. Make this change Globally.
@JsonInclude(Include.NON_NULL)
public class CreateSessionResponse extends BaseResponse implements Serializable{

	private static final long serialVersionUID = 1L;

}
