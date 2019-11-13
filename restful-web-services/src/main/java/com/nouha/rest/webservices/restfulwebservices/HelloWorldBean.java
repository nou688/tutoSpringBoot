package com.nouha.rest.webservices.restfulwebservices;

public class HelloWorldBean {
	private String message;
public HelloWorldBean(String message) {
		// TODO Auto-generated constructor stub
	this.setMessage(message);
	}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}

public String tostring () {
return String.format("helloWorld [message=%s]", message);
}
}