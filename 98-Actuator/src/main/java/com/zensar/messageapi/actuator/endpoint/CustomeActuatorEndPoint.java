package com.zensar.messageapi.actuator.endpoint;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="zensarEndPoint")//user type end point(http://localhost:9090/actuator/zensarEndPoint)
public class CustomeActuatorEndPoint {
	
	@ReadOperation
	//@ReadOperation this is mapped to http get method
	//you also have @WriteOperation mapped to http post method
	public Map<String, String> customeEndPoint()
	{
		Map<String , String>param=new HashMap();
		param.put("name", "zensar");
		return param;
	}
}
