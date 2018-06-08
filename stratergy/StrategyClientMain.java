public class StrategyClientMain {

	public static void main(String[] args) {
		
		double mrptotal = 8000.50; 
		RegCustomer oRC = new RegCustomer(); 
		oRC.display();			
		oRC.calculateDiscount(mrptotal);	
		FirstTimeCustomer oFTC = new FirstTimeCustomer(); 
		oFTC.display(); 
		oFTC.calculateDiscount(mrptotal);	
	}

}
