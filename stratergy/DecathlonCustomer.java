abstract class DecathlonCustomer {
	
	static String name; 
	static int age;
	
	iDiscountCalculator iCC; 
	
	DecathlonCustomer(){}
	
	DecathlonCustomer(String n,int b){
		name=n;
		age=b;
	}
	
	
	public void calculateDiscount(double mrptotal) { 
		iCC.calculateBillAmount(mrptotal); 
	}
	
	public void display() { 
		System.out.println("Name is "+ name + " \nAge is " + age); 
	}

}

