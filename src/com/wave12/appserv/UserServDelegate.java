package com.wave12.appserv;

@javax.jws.WebService(targetNamespace = "http://appserv.wave12.com/", serviceName = "UserServService", portName = "UserServPort", wsdlLocation = "WEB-INF/wsdl/UserServService.wsdl")

public class UserServDelegate {

	com.wave12.appserv.UserServ userServ = new com.wave12.appserv.UserServ();

	public String sayHi(String who) {
		return userServ.sayHi(who);
	}

}