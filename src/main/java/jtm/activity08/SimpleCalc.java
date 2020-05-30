package jtm.activity08;

// TODO implement basic mathematical operations with int numbers in range
// of [-10..+10] (including)
// Note that:
// 1. input range is checked using assertions (so if they are disabled, inputs can be any int)
// 2. outputs are always checked and exception is thrown if it is outside proper range

public class SimpleCalc {

	
	public static int add(int a, int b) throws SimpleCalcException{
		
		validateInput(a, b);
		String operation = "+";
		validateOutput(a, b, operation);
		return a + b;		
	}
	

	public static int subtract(int a, int b) throws SimpleCalcException{
		validateInput (a,b);
		String operation = "-";
		validateOutput(a, b, operation);
		return a - b;
	}
	

	public static int multiply(int a, int b) throws SimpleCalcException{
		validateInput (a,b);
		String operation = "*";
		validateOutput(a, b, operation);
		return a * b;
	}
			
	
	public static int divide(int a, int b) throws SimpleCalcException{
		validateInput (a,b);
		String operation = "/";
		validateOutput(a, b, operation);
		return a / b;
	}
		

	private static void validateInput(int a, int b) {
		
		
		
		
		if (a<-10 && b<-10) {
			assert false: "input value a: " + a + " is below -10 and b: " + b + " is below -10";
		}else if (a>10 && b<-10) {
			assert false: "input value a: " + a + " is above 10 and b: " + b + " is below -10";
		}else if (a<-10 && b>10) {
			assert false: "input value a: " + a + " is below -10 and b: " +  b + " is above 10";
		}else if (a>10 && b>10) {
			assert false: "input value a: " + a + " is above 10 and b: " + b + " is above 10";
		}if (a < -10) {
			assert false: "input value a: " + a + " is below -10";
		}else if(a>10) {
			assert false: "input value a: " + a + " is above 10";
		}else if (b<-10) {
			assert false: "input value b: " + b + " is below -10";
		}else if (b>10) {
			assert false: "input value b: " + b + " is above 10";
		}
	}

	// Hint:
	// If division by zero is performed, catch original exception and create
	// new SimpleCalcException with message "division by zero" and add
	// original division exception as a cause for it.
	private static int validateOutput(int a, int b, String operation) throws SimpleCalcException {
		int result = 0;
	
		try {
			if (operation.equals("+")) {
				result = a + b;
			}else if (operation.equals("-")) {
				result = a - b;
			}else if (operation.equals("*")) {
				result = a * b;
			}else if (operation.equals("/")) {
				result = a / b;
			}
			    
		}catch (Exception i) {
			if (b == 0) {
				throw new SimpleCalcException
				("division by zero");
			}
			
		}
		
				if (result < -10) {
					throw new SimpleCalcException 
					("output value " + a + " " + operation + " " + b + " = " + result + " is below -10");
	
				}else if (result > 10) {
					throw new SimpleCalcException
					("output value " + a + " " + operation + " " + b + " = " + result + " is above 10");
				}
			
			
		return result;
	}
}
