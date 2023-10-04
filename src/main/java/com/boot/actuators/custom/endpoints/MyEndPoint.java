package com.boot.actuators.custom.endpoints;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="myEndPoint")
public class MyEndPoint {

	@ReadOperation
	public String myEndPoint() {
		return "Custom End Point Name is 'MyEndPoint' ";
		
	}
	
	
}
