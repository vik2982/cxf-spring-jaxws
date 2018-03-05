package com.va.service;

import com.va.business.Calculator;
import com.va.subtraction_service.SubtractionServiceHttpPortType;

@javax.jws.WebService(serviceName = "SubtractionService", portName = "SubtractionServiceHttpPort", endpointInterface = "com.va.subtraction_service.SubtractionServiceHttpPortType", targetNamespace = "http://va.com/subtraction_service")
public class SubtractionServiceImpl implements SubtractionServiceHttpPortType {

	
	Calculator calculator;
	
	public Calculator getCalculator() {
		return calculator;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	public int subtract(int paramOne, int paramTwo) {
		return getCalculator().getSubtractionResult(paramOne, paramTwo);
	}

}
