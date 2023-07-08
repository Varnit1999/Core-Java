package com.simplilearn.day1;

public class Methods {
	
	
	void add(int a, int b) {   //Method with parameters and no return value
		int c=a+b;
		System.out.println("Sum is:"+c);
	}
	
	int sub(int a,int b) {  //Method with parameter and return value
		return a-b;
	}
	
	int mul() {         //Method with no parameter and return value
		return 5*8;
	}
	
	void div() {     //Method with no parameter and no return value
		int a=12;
		int b=3;
		System.out.println("Division is:"+a/b);
	}

	public static void main(String[] args) {
		Methods m1= new Methods();
		
		m1.add(23,12);
		
		System.out.println("Subtratcion is:"+m1.sub(22, 9));
		
		System.out.println("Multiplication is:"+m1.mul());
		
		m1.div();

	}

}
