package com.boot.actuators;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id= "readEndpoint")
public class CustomEndPoint {

	@ReadOperation
	public String readEndPoint() {
		return "Successsfully created Custom EndPoint";
	}
	
}
