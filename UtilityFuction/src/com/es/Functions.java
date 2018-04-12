package com.es;

public class Functions {

	public static double esTest(Double targetValue){
		
		return -targetValue;
		
	}	
		
	public static double esRound(Double targetValue, int sequence){
	
		//Fill the logic
		double decimal = Math.pow(10, sequence);
		double returnValue = Math.round(targetValue*decimal)/decimal;		
	
		
		return returnValue;
	
	}
	
	
	public static void main(String[] args) {
		double testValue = 12.23522;
		double answer = esRound(testValue,2);
		// TODO Auto-generated method stub
		System.out.println("Hello World answer is "+answer);
	}
	
}	